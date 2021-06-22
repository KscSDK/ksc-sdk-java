package com.ksc.krds.transform.database;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.database.DescribeAccountResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeAccountUnmarshaller implements Unmarshaller<RdsResponse<DescribeAccountResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<DescribeAccountResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(),DescribeAccountResponse.class);
    }

}
