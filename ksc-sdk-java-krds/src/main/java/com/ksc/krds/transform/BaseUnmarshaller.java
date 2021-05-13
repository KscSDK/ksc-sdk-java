package com.ksc.krds.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

import static com.fasterxml.jackson.core.JsonToken.*;

public abstract class BaseUnmarshaller<R extends KrdsResponse> implements Unmarshaller<R, JsonUnmarshallerContext> {

    private R result;

    public BaseUnmarshaller() {
//        try {
//            Class<R> clazz = (Class<R>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//            this.result = clazz.newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassCastException e) {
//            e.printStackTrace();
//        }
        init();
    }


    public R getResult() {
        return this.result;
    }

    @Override
    public R unmarshall(JsonUnmarshallerContext context) throws Exception {
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == VALUE_NULL) {
            return null;
        }

        if (token == null) {
            token = context.nextToken();
        }

        BaseData data = getResult().getData();
        Class<? extends BaseData> dataClazz = data.getClass();
        Field[] fields = dataClazz.getDeclaredFields();

        while (true) {
            if (token == null) {
                break;
            }

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    getResult().setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }

                for (Field field : fields) {
                    if (isExpression(context, targetDepth, field)) {
                        Method method = getMethod(dataClazz, field);
                        invokeMethod(context, method, field, data);
                    }
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return getResult();
    }

    public boolean isExpression(JsonUnmarshallerContext context, int targetDepth, Field field) {
        return context.testExpression(field.getName(), targetDepth + 1);
    }

    public Method getMethod(Class<? extends BaseData> dataClazz, Field field) {
        String[] methodPrefix = {"set", "add"};
        for (String prefix : methodPrefix) {
            try {
                return dataClazz.getMethod(prefix + field.getName(), field.getType());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public void invokeMethod(JsonUnmarshallerContext context, Method method, Field field, BaseData data) throws Exception {
        String typeName = field.getType().getName();
        if ("java.lang.Integer".equals(typeName)) {
            context.nextToken();
            Integer value = context.getUnmarshaller(Integer.class).unmarshall(context);
            method.invoke(data, value);
        }

        if ("java.lang.String".equals(typeName)) {
            context.nextToken();
            String value = context.getUnmarshaller(String.class).unmarshall(context);
            method.invoke(data, value);
        }

        doInvokeMethod(context, method, field, data);
    }

    protected abstract void init();

    public void setResult(R result) {
        this.result = result;
    }

    protected abstract void doInvokeMethod(JsonUnmarshallerContext context, Method method, Field field, BaseData data) throws Exception;

    public Unmarshaller getUnmarshaller(Field field) {
        com.ksc.krds.annotations.Unmarshaller annotation = field.getAnnotation(com.ksc.krds.annotations.Unmarshaller.class);
        assert annotation != null;
        Class clazz = annotation.clazz();
        try {
            return (Unmarshaller) clazz.getMethod("getInstance").invoke(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }

}
