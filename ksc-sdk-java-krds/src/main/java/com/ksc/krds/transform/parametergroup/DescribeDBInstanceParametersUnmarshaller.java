package com.ksc.krds.transform.parametergroup;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.parametergroup.DescribeDBInstanceParametersResponse;
import com.ksc.krds.model.parametergroup.DescribeEngineDefaultParametersResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: DescribeDBInstanceParametersUnmarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeDBInstanceParametersUnmarshaller implements Unmarshaller<RdsResponse<DescribeDBInstanceParametersResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<DescribeDBInstanceParametersResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), DescribeDBInstanceParametersResponse.class);
    }
}
