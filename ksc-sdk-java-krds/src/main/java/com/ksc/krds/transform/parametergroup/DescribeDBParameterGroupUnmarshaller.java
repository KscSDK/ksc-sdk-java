package com.ksc.krds.transform.parametergroup;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.parametergroup.DescribeDBParameterGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeDBParameterGroupUnmarshaller implements Unmarshaller<RdsResponse<DescribeDBParameterGroupResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<DescribeDBParameterGroupResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), DescribeDBParameterGroupResponse.class);
    }

}
