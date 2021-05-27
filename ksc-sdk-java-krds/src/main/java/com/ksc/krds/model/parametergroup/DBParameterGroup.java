package com.ksc.krds.model.parametergroup;

import java.util.Map;

public class DBParameterGroup  {

    private String DBParameterGroupId;

    private String DBParameterGroupName;

    private String EngineVersion;

    private String Description;

    private Map<String, Object> Parameters;

    private String datastore_version_id;

    private String Engine;

    private String CreateTime;

    private String LastModifyTime;

    public String getDBParameterGroupId() {
        return DBParameterGroupId;
    }

    public void setDBParameterGroupId(String DBParameterGroupId) {
        this.DBParameterGroupId = DBParameterGroupId;
    }

    public String getDBParameterGroupName() {
        return DBParameterGroupName;
    }

    public void setDBParameterGroupName(String DBParameterGroupName) {
        this.DBParameterGroupName = DBParameterGroupName;
    }

    public String getEngineVersion() {
        return EngineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        EngineVersion = engineVersion;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Map<String, Object> getParameters() {
        return Parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        Parameters = parameters;
    }

    public String getDatastore_version_id() {
        return datastore_version_id;
    }

    public void setDatastore_version_id(String datastore_version_id) {
        this.datastore_version_id = datastore_version_id;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getLastModifyTime() {
        return LastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        LastModifyTime = lastModifyTime;
    }
}
