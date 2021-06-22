package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.InstanceResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class RebootUnmarshaller implements Unmarshaller<RdsResponse<InstanceResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<InstanceResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RdsResponseConversion.invoke(context.getJsonParser(), InstanceResponse.class);
    }
}
