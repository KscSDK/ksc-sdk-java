package com.ksc.krds.transform.log;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.log.DescribeDBLogFilesResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeDBLogFilesUnmarshaller implements Unmarshaller<RdsResponse<DescribeDBLogFilesResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<DescribeDBLogFilesResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(),DescribeDBLogFilesResponse.class);
    }

}
