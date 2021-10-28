package com.ksc.krds.model.parametergroup;

import java.security.Policy;
import java.util.List;
import java.util.Map;

/***
 * @ClassName: DescribeDBInstanceParametersResponse
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeDBInstanceParametersResponse {
    private String Engine;
    private String EngineVersion;
    private Map<String, String> Parameters;

    public Map<String, String> getParameters() {
        return Parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        Parameters = parameters;
    }


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








}
