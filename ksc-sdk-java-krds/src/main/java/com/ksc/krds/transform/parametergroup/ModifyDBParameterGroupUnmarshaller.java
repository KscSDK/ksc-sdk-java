package com.ksc.krds.transform.parametergroup;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.parametergroup.ResetDBParameterGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ModifyDBParameterGroupUnmarshaller implements Unmarshaller<RdsResponse<ResetDBParameterGroupResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<ResetDBParameterGroupResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), ResetDBParameterGroupResponse.class);
    }

}
