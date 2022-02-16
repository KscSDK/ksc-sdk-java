package com.ksc.krds.model.database;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.ArrayList;
import java.util.List;

public class ModifyDatabasePrivilegesRequest extends BaseRequest<ModifyDatabasePrivilegesRequest> {

    private String DBInstanceIdentifier;
    private String InstanceDatabaseName;
    private String InstanceDatabaseCollation;
    private String InstanceDatabaseCollationSet;
    private String InstanceDatabaseDescription;
    private List<DatabasePrivilege> InstanceDatabasePrivileges;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

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

    public List<DatabasePrivilege> getInstanceDatabasePrivileges() {
        return InstanceDatabasePrivileges;
    }

    public void setInstanceDatabasePrivileges(List<DatabasePrivilege> instanceDatabasePrivileges) {
        InstanceDatabasePrivileges = instanceDatabasePrivileges;
    }
}
