package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.DescribeInstanceResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeUnmarshaller implements Unmarshaller<RdsResponse<DescribeInstanceResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<DescribeInstanceResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), DescribeInstanceResponse.class);
    }

}
