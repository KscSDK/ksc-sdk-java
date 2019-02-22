package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.KrdsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;


public class KrdsResponseJsonUnmarshaller implements Unmarshaller<KrdsResponse, JsonUnmarshallerContext> {
    public KrdsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        return new KrdsResponse();
    }

    private static CreateKrdsResponseJsonUnmarshaller instance;

    public static CreateKrdsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateKrdsResponseJsonUnmarshaller();
        return instance;
    }
}