package com.ksc.krds.model.parametergroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DeleteDBParameterGroupRequest extends BaseRequest<DeleteDBParameterGroupRequest> {

    private String DBParameterGroupId;

    public String getDBParameterGroupId() {
        return DBParameterGroupId;
    }

    public void setDBParameterGroupId(String DBParameterGroupId) {
        this.DBParameterGroupId = DBParameterGroupId;
    }
}
