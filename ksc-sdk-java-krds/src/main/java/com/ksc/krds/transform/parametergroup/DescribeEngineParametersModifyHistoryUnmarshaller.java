package com.ksc.krds.transform.parametergroup;

import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.parametergroup.TDescribeDBParameterGroupModifyHistoryResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: DescribeEngineParametersModifyHistoryUnmarshaller
 *
 */
public class DescribeEngineParametersModifyHistoryUnmarshaller implements Unmarshaller<TDescribeDBParameterGroupModifyHistoryResponse, JsonUnmarshallerContext> {

    @Override
    public TDescribeDBParameterGroupModifyHistoryResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke1(in.getJsonParser(), TDescribeDBParameterGroupModifyHistoryResponse.class);
    }
}
