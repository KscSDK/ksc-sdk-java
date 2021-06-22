package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.InstanceResponse;
import com.ksc.krds.model.krdsInstance.OverrideDBInstanceResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;


public class OverrideUnmarshaller implements Unmarshaller<RdsResponse<OverrideDBInstanceResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<OverrideDBInstanceResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), OverrideDBInstanceResponse.class);
    }
}
