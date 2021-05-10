package com.ksc.krds.transform;

import com.ksc.krds.model.krdsInstance.*;
import com.ksc.krds.model.securityGroup.CreateSecurityGroupRequest;
import com.ksc.krds.model.securityGroup.DeleteSecurityGroupRequest;

public enum ActionEnum {
    /** -------------------instance------------------- **/
    MODIFY(ModifyInstanceRequest.class, "ModifyDBInstance"),
    CREATE(BaseRequest.class, "CreateDBInstance"),
    CREATE_READ_REPLICA(CreateReadReplicaRequest.class, "CreateDBInstanceReadReplica"),
    DELETE(BaseRequest.class, "DeleteDBInstance"),
    LOCK(BaseRequest.class, "LockDBInstance"),
    UN_LOCK(UnLockDBInstanceRequest.class, "UnLockDBInstance"),
    ALLOCATE_EIP(BaseRequest.class, "AllocateDBInstanceEip"),
    RELEASE_EIP(BaseRequest.class, "ReleaseDBInstanceEip"),
    REBOOT(RebootDBInstanceRequest.class, "RebootDBInstance"),
    DESCRIBE(BaseRequest.class, "DescribeDBInstances"),
    GENERATE_ADMIN_URL(BaseRequest.class, "GenerateDBAdminURL"),
    DESCRIBE_RESTORE_TIME(BaseRequest.class, "DescribeDBInstanceRestorableTime"),
    RESTORE_TO_POINT_IN_TIME(BaseRequest.class, "RestoreDBInstanceToPointInTime"),
    RESTORE_FROM_BACKUP(BaseRequest.class, "RestoreDBInstanceFromDBBackup"),
    MODIFY_SPEC(ModifyDBInstanceSpecRequest.class, "ModifyDBInstanceSpec"),
    UPGRADE_ENGINE_VERSION(UpgradeDBInstanceEngineVersionRequest.class, "UpgradeDBInstanceEngineVersion"),
    MODIFY_TYPE(ModifyInstanceTypeRequest.class, "ModifyDBInstanceType"),
    OVERRIDE(BaseRequest.class, "OverrideDBInstance"),
    DESCRIBE_ENGINE_VERSIONS(DescribeDBEngineVersionsRequest.class, "DescribeDBEngineVersions"),
    DESCRIBE_PARAMETERS(BaseRequest.class, "DescribeDBInstanceParameters"),
    LIST(BaseRequest.class, "ListDBInstance"),
    LIST_ZONE(BaseRequest.class, "ListZone"),
    SWITCH_HA(SwitchHARequest.class, "SwitchDBInstanceHA"),
    MODIFY_AVAILABILITY_ZONE(ModifyDBInstanceAvailabilityZoneRequest.class, "ModifyDBInstanceAvailabilityZone"),
    STATISTIC(BaseRequest.class, "StatisticDBInstances"),
    CREATE_ORDER(BaseRequest.class, "CreateInstanceOrder"),
    CURRENT_INFO(BaseRequest.class, "GetCurrentDatabaseInfo"),
    TABLE_RESTORE_TIME(BaseRequest.class, "GetTableRestorableTime"),
    HISTORY_DATABASE_INFO(BaseRequest.class, "GetHistoryDatabaseInfo"),
    OVERRIDE_POINT_IN_TIME(BaseRequest.class, "OverrideDBInstanceByPointInTime"),
    ALLOCATE_INNER_EIP(BaseRequest.class, "AllocateDBInstanceInnerEip"),
    RELEASE_INNER_EIP(BaseRequest.class, "ReleaseDBInstanceInnerEip"),

    /** -------------------securityGroup------------------- **/
    CREATE_SECURITY_GROUP(CreateSecurityGroupRequest.class,"CreateSecurityGroup"),
    DELETE_SECURITY_GROUP(DeleteSecurityGroupRequest.class,"DeleteSecurityGroup"),
    MODIFY_SECURITY_GROUP(CreateSecurityGroupRequest.class,"ModifySecurityGroup"),
    CLONE_SECURITY_GROUP(CreateSecurityGroupRequest.class,"CloneSecurityGroup"),
    DESCRIBE_SECURITY_GROUP(BaseRequest.class,"DescribeSecurityGroup"),
    MODIFY_SECURITY_GROUP_RULE(BaseRequest.class,"ModifySecurityGroupRule"),
    SECURITY_GROUP_RELATION(BaseRequest.class,"SecurityGroupRelation"),
    MODIFY_SECURITY_GROUP_RULE_NAME(BaseRequest.class,"ModifySecurityGroupRuleName");

    private String val;

    private Class<? extends BaseRequest> req;

    ActionEnum(Class<? extends BaseRequest> req, String val) {
        this.req = req;
        this.val = val;
    }

    public String val() {
        return val;
    }

    public static ActionEnum getByReq(Class<? extends BaseRequest> req) {
        for (ActionEnum value : ActionEnum.values()) {
            if (value.req == req) {
                return value;
            }
        }
        throw new IllegalArgumentException("parameter is illegal");
    }
}
