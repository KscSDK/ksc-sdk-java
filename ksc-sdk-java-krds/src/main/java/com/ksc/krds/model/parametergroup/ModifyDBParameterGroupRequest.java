package com.ksc.krds.model.parametergroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.Map;

public class ModifyDBParameterGroupRequest extends BaseRequest<ModifyDBParameterGroupRequest> {

    private String DBParameterGroupId;

    private Map<String,String> Parameters;

    private String Description;

    private String DBParameterGroupName;

    public String getDBParameterGroupId() {
        return DBParameterGroupId;
    }

    public void setDBParameterGroupId(String DBParameterGroupId) {
        this.DBParameterGroupId = DBParameterGroupId;
    }

    public Map<String, String> getParameters() {
        return Parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        Parameters = parameters;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDBParameterGroupName() {
        return DBParameterGroupName;
    }

    public void setDBParameterGroupName(String DBParameterGroupName) {
        this.DBParameterGroupName = DBParameterGroupName;
    }
}
