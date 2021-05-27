package com.ksc.krds.model.parametergroup;

import java.util.Map;

public class DescribeEngineDefaultParametersResponse {
    private String Engine;
    private String EngineVersion;
    private Map<String,Parameter> Parameters;

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

    public Map<String, Parameter> getParameters() {
        return Parameters;
    }

    public void setParameters(Map<String, Parameter> parameters) {
        Parameters = parameters;
    }
}
