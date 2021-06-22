package com.ksc.krds.model.krdsInstance;

import com.ksc.krds.transform.BaseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DescribeDBEngineVersionsResponse extends InstancesResponse {

    private Data data;

    private String RequestId;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public class Data extends BaseData {
        private Map<String, List<DBEngineVersions>> Engines = new HashMap<String, List<DBEngineVersions>>();

        public void addEngines(String name, String Engine, String EngineVersion) {
            if (this.Engines.get(name) == null) {
                this.Engines.put(name, new ArrayList<DBEngineVersions>());
            }
            List<DBEngineVersions> dbEngineVersionsList = this.Engines.get(name);
            DBEngineVersions a = new DBEngineVersions(Engine, EngineVersion);
            dbEngineVersionsList.add(a);

        }
    }

    public class DBEngineVersions {
        private String Engine;
        private String EngineVersion;

        public DBEngineVersions(String engine, String engineVersion) {
            Engine = engine;
            EngineVersion = engineVersion;
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
}
