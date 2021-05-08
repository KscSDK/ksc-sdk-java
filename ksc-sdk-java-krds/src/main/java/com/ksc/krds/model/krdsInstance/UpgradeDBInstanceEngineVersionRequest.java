package com.ksc.krds.model.krdsInstance;

public class UpgradeDBInstanceEngineVersionRequest extends BaseRequest<UpgradeDBInstanceEngineVersionRequest>{

    private String Engine;

    private String EngineVersion;

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
