package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.TestResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class TestUnmarshaller implements Unmarshaller<RdsResponse<TestResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<TestResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RdsResponseConversion.invoke(context.getJsonParser(), TestResponse.class);
    }
}
