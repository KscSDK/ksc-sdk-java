package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.DescribeDBInstanceRestoredResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeDBInstanceRestoredUnmarshaller implements Unmarshaller<RdsResponse<DescribeDBInstanceRestoredResponse>, JsonUnmarshallerContext> {
    @Override
    public RdsResponse<DescribeDBInstanceRestoredResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), DescribeDBInstanceRestoredResponse.class);
    }
}
