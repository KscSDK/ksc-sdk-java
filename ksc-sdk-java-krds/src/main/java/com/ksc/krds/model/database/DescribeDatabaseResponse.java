package com.ksc.krds.model.database;

import java.util.List;

public class DescribeDatabaseResponse {

    private List<InstanceDatabase> InstanceDatabases;

    public List<InstanceDatabase> getInstanceDatabases() {
        return InstanceDatabases;
    }

    public void setInstanceDatabases(List<InstanceDatabase> instanceDatabases) {
        InstanceDatabases = instanceDatabases;
    }
}
