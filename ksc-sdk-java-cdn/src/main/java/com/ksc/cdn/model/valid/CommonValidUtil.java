package com.ksc.cdn.model.valid;

import com.ksc.cdn.KscClientException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.List;

/**
 * CommonValidUtil
 * <p>
 * 验证请求参数是否合法
 *
 * @author jiangran@kingsoft.com
 * @date 08/11/2016
 */
public class CommonValidUtil {
    private final static Logger log = LoggerFactory.getLogger(CommonValidUtil.class);

    /**
     * 验证请求参数是否合法
     *
     * @param object
     * @throws KscClientException
     */
    public static void check(Object object) throws KscClientException {
        Class<? extends Object> clazz = object.getClass();
        checkField(clazz,object);

    }
    private static void checkField(Class<? extends Object> clazz,Object object) throws KscClientException {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            checkFieldValid(field, object);
        }
        if(clazz.getSuperclass()!=null){
            Class<?> superclass = clazz.getSuperclass();
            checkField(superclass,object);
        }

    }
    private static void checkFieldValid(Field field, Object object) throws KscClientException {
        try {
            field.setAccessible(true);
            FieldValidate annotation = field.getAnnotation(FieldValidate.class);
            if (annotation != null) {
                if (!annotation.nullable()) {

                    Object value = field.get(object);
                    if(value == null){
                        throw new KscClientException(String.format("field %s not null", field.getName()));
                    }
                    if (field.getType() == String.class && StringUtils.isBlank(value.toString())) {
                        throw new KscClientException(String.format("field %s not null", field.getName()));
                    }
                    if (field.getType() == Integer.class && ((Integer) value == 0)) {
                        throw new KscClientException(String.format("field %s not 0", field.getName()));
                    }
                    if (field.getType() == Long.class && ((Long) value == 0l)) {
                        throw new KscClientException(String.format("field %s not 0", field.getName()));
                    }
                }
            }
            if (field.getType() == List.class && field.get(object)!=null) {

                List<Object> list = (List<Object>) field.get(object);
                for (Object li : list
                        ) {
                    Field[] declaredFields = li.getClass().getDeclaredFields();
                    for (Field f:declaredFields
                            ) {
                        checkFieldValid(f,li);
                    }

                }

            }

        } catch (IllegalAccessException e) {
            log.warn("validate bean field {} cause illegal access exception", field.getName());
        }finally {
            field.setAccessible(false);
        }
    }
}
