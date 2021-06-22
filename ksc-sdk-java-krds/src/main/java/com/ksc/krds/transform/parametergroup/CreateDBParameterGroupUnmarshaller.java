package com.ksc.krds.transform.parametergroup;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.parametergroup.CreateDBParameterGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CreateDBParameterGroupUnmarshaller implements Unmarshaller<RdsResponse<CreateDBParameterGroupResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<CreateDBParameterGroupResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), CreateDBParameterGroupResponse.class);
    }
}
