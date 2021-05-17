package com.ksc.krds.transform.parametergroup;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.parametergroup.DescribeEngineDefaultParametersResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeEngineDefaultParametersUnmarshaller implements Unmarshaller<RdsResponse<DescribeEngineDefaultParametersResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<DescribeEngineDefaultParametersResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), DescribeEngineDefaultParametersResponse.class);
    }

}
