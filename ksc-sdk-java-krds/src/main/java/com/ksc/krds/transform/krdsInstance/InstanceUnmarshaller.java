package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.annotations.Unmarshaller;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsInstance.Instance;
import com.ksc.krds.model.krdsInstance.InstanceResponse;
import com.ksc.krds.transform.BaseData;
import com.ksc.krds.transform.BaseUnmarshaller;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;


public class InstanceUnmarshaller<R extends KrdsResponse> extends BaseUnmarshaller<R> {

    @Override
    protected void init() {
        setResult((R) new InstanceResponse());
    }

    @Override
    public void doInvokeMethod(JsonUnmarshallerContext context, Method method, Field field, BaseData data) throws Exception {
        String typeName = field.getType().getName();
        if ("java.util.List".equals(typeName)) {
            context.nextToken();
            List<Instance> list = new ListUnmarshaller<Instance>(getUnmarshaller(field)).unmarshall(context);
            method.invoke(data, list);
            return;
        }

        context.nextToken();
        Instance instance = (Instance) getUnmarshaller(field).unmarshall(context);
        method.invoke(data, instance);

    }

}
