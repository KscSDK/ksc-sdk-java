package com.ksc.krds.transform.parametergroup;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.parametergroup.ModifyDBParameterGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ResetDBParameterGroupUnmarshaller implements Unmarshaller<RdsResponse<ModifyDBParameterGroupResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<ModifyDBParameterGroupResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), ModifyDBParameterGroupResponse.class);
    }

}
