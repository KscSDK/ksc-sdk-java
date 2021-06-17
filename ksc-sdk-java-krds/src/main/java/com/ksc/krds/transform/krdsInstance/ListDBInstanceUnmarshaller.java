package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.ListDBInstanceResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListDBInstanceUnmarshaller implements Unmarshaller<RdsResponse<ListDBInstanceResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<ListDBInstanceResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), ListDBInstanceResponse.class);
    }

}
