package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.InstanceResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;


public class InstanceUnmarshaller implements Unmarshaller<RdsResponse<InstanceResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<InstanceResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), InstanceResponse.class);
    }
}
