package com.ksc.krds.model.parametergroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DescribeEngineParametersModifyHistoryRequest extends BaseRequest<DescribeEngineParametersModifyHistoryRequest> {
    private String Engine;
    private String EngineVersion;
    private String DBParameterGroupId;
    private String Marker;
    private String MaxRecords;
    private String Keyword;
    private String name;

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getEngineVersion() {
        return EngineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        EngineVersion = engineVersion;
    }

    public String getDBParameterGroupId() {
        return DBParameterGroupId;
    }

    public void setDBParameterGroupId(String DBParameterGroupId) {
        this.DBParameterGroupId = DBParameterGroupId;
    }

    public String getMarker() {
        return Marker;
    }

    public void setMarker(String marker) {
        Marker = marker;
    }

    public String getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(String maxRecords) {
        MaxRecords = maxRecords;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
