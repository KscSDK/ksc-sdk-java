package com.ksc.krds.model.database;

import java.util.List;

public class InstanceDatabase {

    private String InstanceDatabaseName;
    private String InstanceDatabaseCollation;
    private String InstanceDatabaseCollationSet;
    private String InstanceDatabaseDescription;
    private String InstanceDatabaseStatus;
    private String Created;
    private List<DatabasePrivilege> InstanceDatabasePrivileges;

    public String getInstanceDatabaseName() {
        return InstanceDatabaseName;
    }

    public void setInstanceDatabaseName(String instanceDatabaseName) {
        InstanceDatabaseName = instanceDatabaseName;
    }

    public String getInstanceDatabaseCollation() {
        return InstanceDatabaseCollation;
    }

    public void setInstanceDatabaseCollation(String instanceDatabaseCollation) {
        InstanceDatabaseCollation = instanceDatabaseCollation;
    }

    public String getInstanceDatabaseCollationSet() {
        return InstanceDatabaseCollationSet;
    }

    public void setInstanceDatabaseCollationSet(String instanceDatabaseCollationSet) {
        InstanceDatabaseCollationSet = instanceDatabaseCollationSet;
    }

    public String getInstanceDatabaseDescription() {
        return InstanceDatabaseDescription;
    }

    public void setInstanceDatabaseDescription(String instanceDatabaseDescription) {
        InstanceDatabaseDescription = instanceDatabaseDescription;
    }

    public String getInstanceDatabaseStatus() {
        return InstanceDatabaseStatus;
    }

    public void setInstanceDatabaseStatus(String instanceDatabaseStatus) {
        InstanceDatabaseStatus = instanceDatabaseStatus;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public List<DatabasePrivilege> getInstanceDatabasePrivileges() {
        return InstanceDatabasePrivileges;
    }

    public void setInstanceDatabasePrivileges(List<DatabasePrivilege> instanceDatabasePrivileges) {
        InstanceDatabasePrivileges = instanceDatabasePrivileges;
    }
}
