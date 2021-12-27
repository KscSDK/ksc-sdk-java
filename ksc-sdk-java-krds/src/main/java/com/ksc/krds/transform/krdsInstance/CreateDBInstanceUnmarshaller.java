package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.CreateDBInstanceResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;


public class CreateDBInstanceUnmarshaller implements Unmarshaller<RdsResponse<CreateDBInstanceResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<CreateDBInstanceResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), CreateDBInstanceResponse.class);
    }
}
