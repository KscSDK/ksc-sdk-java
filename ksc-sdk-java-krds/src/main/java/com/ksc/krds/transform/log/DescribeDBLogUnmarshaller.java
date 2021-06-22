package com.ksc.krds.transform.log;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.log.DescribeDBLogResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeDBLogUnmarshaller implements Unmarshaller<RdsResponse<DescribeDBLogResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<DescribeDBLogResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(),DescribeDBLogResponse.class);
    }

}
