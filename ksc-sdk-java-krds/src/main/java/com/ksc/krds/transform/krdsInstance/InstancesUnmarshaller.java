package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.InstancesResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class InstancesUnmarshaller implements Unmarshaller<RdsResponse<InstancesResponse>, JsonUnmarshallerContext> {
    @Override
    public RdsResponse<InstancesResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), InstancesResponse.class);
    }
}
