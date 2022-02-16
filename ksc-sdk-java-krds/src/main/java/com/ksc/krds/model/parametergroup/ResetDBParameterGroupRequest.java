package com.ksc.krds.model.parametergroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class ResetDBParameterGroupRequest extends BaseRequest<ResetDBParameterGroupRequest> {

    private String DBParameterGroupId;

    public String getDBParameterGroupId() {
        return DBParameterGroupId;
    }

    public void setDBParameterGroupId(String DBParameterGroupId) {
        this.DBParameterGroupId = DBParameterGroupId;
    }
}
