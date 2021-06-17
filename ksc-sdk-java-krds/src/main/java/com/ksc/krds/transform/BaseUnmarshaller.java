package com.ksc.krds.transform;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseUnmarshaller<R> implements Unmarshaller<RdsResponse<R>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<R> unmarshall(JsonUnmarshallerContext in) throws Exception {
        Class<R> rClass = (Class<R>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return RdsResponseConversion.invoke(in.getJsonParser(), rClass);
    }
}
