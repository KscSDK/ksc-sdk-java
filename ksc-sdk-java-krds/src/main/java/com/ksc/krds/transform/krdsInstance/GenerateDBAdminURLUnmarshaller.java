package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class GenerateDBAdminURLUnmarshaller implements Unmarshaller<RdsResponse<String>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<String> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(),String.class);
    }
}
