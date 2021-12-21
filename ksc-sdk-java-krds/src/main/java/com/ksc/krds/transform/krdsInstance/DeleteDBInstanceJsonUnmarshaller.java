package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;


public class DeleteDBInstanceJsonUnmarshaller implements Unmarshaller<RdsResponse, JsonUnmarshallerContext> {
    public RdsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RdsResponseConversion.invoke1(context.getJsonParser(),RdsResponse.class);
    }

    private static CreateKrdsResponseJsonUnmarshaller instance;

    public static CreateKrdsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateKrdsResponseJsonUnmarshaller();
        return instance;
    }
}