package com.ksc.krds.model.parametergroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.HashMap;
import java.util.Map;

public class CreateDBParameterGroupRequest extends BaseRequest<CreateDBParameterGroupRequest> {

    private String EngineVersion;

    private String Engine;

    private String Description;

    private String DBParameterGroupName;

    private Map<String,String> Parameters =new HashMap<String,String>();

    public String getEngineVersion() {
        return EngineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        EngineVersion = engineVersion;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
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

    public Map<String, String> getParameters() {
        return Parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        Parameters = parameters;
    }
}
