package com.ksc.krds.transform.database;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.database.GetMysqlCollationsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class InstanceUnmarshaller implements Unmarshaller<RdsResponse<GetMysqlCollationsResponse>, JsonUnmarshallerContext> {
    @Override
    public RdsResponse<GetMysqlCollationsResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(),GetMysqlCollationsResponse.class);
    }
}
