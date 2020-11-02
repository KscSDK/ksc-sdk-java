package com.ksc.krds.transform;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.WordUtils;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Slf4j
public class TypeHelper {
    private static Map<Class, Map<PropertyDescriptor, Field>> fieldCache = new IdentityHashMap<Class, Map<PropertyDescriptor, Field>>();
    private static Map<Class, PropertyDescriptor[]> propertyDescriptorsCache = new IdentityHashMap<Class, PropertyDescriptor[]>();
    private static ReadWriteLock propertyDescriptorsCacheLock = new ReentrantReadWriteLock();
    private static ReadWriteLock fieldCacheLock = new ReentrantReadWriteLock();

    static boolean isBaseType(Type type) {
        Class<?> classType = (Class) type;
        return (classType != null && classType.isPrimitive()) || type == String.class || type == List.class || type == Map.class
                || type == Integer.class || type == Double.class || type == Float.class || type == Byte.class || type == Short.class || type == Long.class
                || type == Boolean.class || type == Date.class || type == Object.class || type == BigDecimal.class || type == BigInteger.class || classType.isEnum() || classType.isArray();
    }

    public static PropertyDescriptor[] getPropertyDescriptors(Class clazz) {
        try {
            propertyDescriptorsCacheLock.readLock().lock();
            PropertyDescriptor[] v = propertyDescriptorsCache.get(clazz);
            if (v != null) {
                return v;
            }
            try {
                v = Introspector.getBeanInfo(clazz).getPropertyDescriptors();
            } catch (IntrospectionException ignored) {
            }
            propertyDescriptorsCacheLock.readLock().unlock();
            propertyDescriptorsCacheLock.writeLock().lock();
            propertyDescriptorsCache.put(clazz, v);
            return v;
        } finally {
            try {
                propertyDescriptorsCacheLock.readLock().unlock();
            } catch (IllegalMonitorStateException ignored) {
            }
            try {
                propertyDescriptorsCacheLock.writeLock().unlock();
            } catch (IllegalMonitorStateException ignored) {
            }
        }
    }

    public static Field getPropertyFieldWithinSuperClass(Class<?> object_class, PropertyDescriptor propertyDescriptor) {
        try {
            Map<PropertyDescriptor, Field> propertyDescriptorFieldMap;
            fieldCacheLock.readLock().lock();
            propertyDescriptorFieldMap = fieldCache.get(object_class);
            if (propertyDescriptorFieldMap == null) {
                propertyDescriptorFieldMap = new IdentityHashMap<PropertyDescriptor, Field>();
                fieldCacheLock.readLock().unlock();
                fieldCacheLock.writeLock().lock();
                fieldCache.put(object_class, propertyDescriptorFieldMap);
            } else {
                Field field = propertyDescriptorFieldMap.get(propertyDescriptor);
                if (field != null) {
                    return field;
                }
            }
            Field field = null;
            //noinspection Duplicates
            int try_capitailized = 1;
            Set<String> testedName = new HashSet<String>();
            while (true) {
                String name = propertyDescriptor.getName();
                if (try_capitailized == 1) {
                    name = WordUtils.capitalize(name);
                } else {
                    if (try_capitailized == 3) {
                        if (propertyDescriptor.getPropertyType() == boolean.class) {
                            name = "is" + WordUtils.capitalize(name);
                        } else {
                            break;
                        }
                    } else {
                        name = WordUtils.uncapitalize(name);
                    }
                }
                if (!testedName.contains(name)) {
                    try {
                        field = object_class.getDeclaredField(name);
                    } catch (NoSuchFieldException e) {
                        Class<?> c = object_class;
                        while (field == null) { // find the field
                            c = c.getSuperclass();
                            if (c == null || c == Object.class) {
                                break;
                            }
                            try {
                                field = c.getDeclaredField(name);
                            } catch (NoSuchFieldException ignored) {
                            }
                        }
                    }
                    if (try_capitailized == 3 || field != null)
                        break;
                    testedName.add(name);
                }
                try_capitailized++;
            }
            if (field == null) {
                throw new NullPointerException(String.format("Get Field Error. %s:%s", object_class.getName(), propertyDescriptor.getName()));
            }
            propertyDescriptorFieldMap.put(propertyDescriptor, field);
            field.setAccessible(true);
            return field;
        } finally {
            try {
                fieldCacheLock.readLock().unlock();
            } catch (IllegalMonitorStateException ignored) {
            }
            try {
                fieldCacheLock.writeLock().unlock();
            } catch (IllegalMonitorStateException ignored) {
            }
        }
    }
}

