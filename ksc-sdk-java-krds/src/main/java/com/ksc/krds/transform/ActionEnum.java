package com.ksc.krds.transform;

import com.ksc.krds.model.account.*;
import com.ksc.krds.model.account.CreateAccountRequest;
import com.ksc.krds.model.account.DeleteAccountRequest;
import com.ksc.krds.model.account.DescribeAccountRequest;
import com.ksc.krds.model.account.ModifyAccountRequest;
import com.ksc.krds.model.audit.*;
import com.ksc.krds.model.auditstatistic.AuditHotStatisticRequest;
import com.ksc.krds.model.auditstatistic.AuditTemplateRequest;
import com.ksc.krds.model.auditstatistic.DescribeAuditHotDurationRequest;
import com.ksc.krds.model.auditstatistic.SqlAuditLineChartRequest;
import com.ksc.krds.model.database.*;
import com.ksc.krds.model.krdsBackup.CreateDBBackupRequest;
import com.ksc.krds.model.krdsBackup.DeleteDBBackupRequest;
import com.ksc.krds.model.krdsBackup.ModifyDBInstanceRequest;
import com.ksc.krds.model.krdsInstance.*;
import com.ksc.krds.model.log.DeleteDBBinlogRequest;
import com.ksc.krds.model.log.DescribeDBLogFilesRequest;
import com.ksc.krds.model.log.DescribeDBLogRequest;
import com.ksc.krds.model.parametergroup.*;
import com.ksc.krds.model.securityGroup.*;
import com.ksc.krds.model.slowlog.SlowLogDetailRequest;
import com.ksc.krds.model.slowlog.SlowLogLineChartRequest;
import com.ksc.krds.model.slowlog.SlowLogReportRequest;

public enum ActionEnum {
    /** -------------------instance------------------- **/
    MODIFY(ModifyInstanceRequest.class, "ModifyDBInstance"),
    CREATE(BaseRequest.class, "CreateDBInstance"),
    CREATE_READ_REPLICA(CreateReadReplicaRequest.class, "CreateDBInstanceReadReplica"),
    DELETE(BaseRequest.class, "DeleteDBInstance"),
    LOCK(LockDBInstanceRequest.class, "LockDBInstance"),
    UN_LOCK(UnLockDBInstanceRequest.class, "UnLockDBInstance"),
    REBOOT(RebootDBInstanceRequest.class, "RebootDBInstance"),
    DESCRIBE(ListKrdsRequest.class, "DescribeDBInstances"),
    GENERATE_ADMIN_URL(GenerateDBAdminURLRequest.class, "GenerateDBAdminURL"),
    DESCRIBE_RESTORE_TIME(DescribeDBInstanceRestoredTimeRequest.class, "DescribeDBInstanceRestorableTime"),
    RESTORE_TO_POINT_IN_TIME(SDKRestoreDBInstanceToPointInTimeRequest.class, "RestoreDBInstanceToPointInTime"),
    RESTORE_FROM_BACKUP(SDKRestoreDBInstanceFromDBBackupRequest.class, "RestoreDBInstanceFromDBBackup"),
    MODIFY_SPEC(ModifyDBInstanceSpecRequest.class, "ModifyDBInstanceSpec"),
    UPGRADE_ENGINE_VERSION(UpgradeDBInstanceEngineVersionRequest.class, "UpgradeDBInstanceEngineVersion"),
    MODIFY_TYPE(ModifyInstanceTypeRequest.class, "ModifyDBInstanceType"),
    OVERRIDE(OverrideDBInstanceRequest.class, "OverrideDBInstance"),
    DESCRIBE_ENGINE_VERSIONS(DescribeDBEngineVersionsRequest.class, "DescribeDBEngineVersions"),
    DESCRIBE_PARAMETERS(DescribeDBInstanceParametersRequest.class, "DescribeDBInstanceParameters"),
    LIST(ListDBInstanceRequest.class, "ListDBInstance"),
    LIST_ZONE(ListZoneRequest.class, "ListZone"),
    SWITCH_HA(SwitchHARequest.class, "SwitchDBInstanceHA"),
    MODIFY_AVAILABILITY_ZONE(ModifyDBInstanceAvailabilityZoneRequest.class, "ModifyDBInstanceAvailabilityZone"),
    STATISTIC(StatisticDBInstancesRequest.class, "StatisticDBInstances"),
    CREATE_ORDER(CreateInstanceOrderRequest.class, "CreateInstanceOrder"),
    CURRENT_INFO(GetCurrentDatabaseInfoReq.class, "GetCurrentDatabaseInfo"),
    TABLE_RESTORE_TIME(BaseRequest.class, "GetTableRestorableTime"),
    HISTORY_DATABASE_INFO(BaseRequest.class, "GetHistoryDatabaseInfo"),
    OVERRIDE_POINT_IN_TIME(BaseRequest.class, "OverrideDBInstanceByPointInTime"),
    ALLOCATE_INNER_EIP(GetCurrentDatabaseInfoReq.class, "AllocateDBInstanceInnerEip"),
    RELEASE_INNER_EIP(AllocateDBInstanceInnerEipRequest.class, "ReleaseDBInstanceInnerEip"),

    /** -------------------securityGroup------------------- **/
    CREATE_SECURITY_GROUP(CreateSecurityGroupRequest.class,"CreateSecurityGroup"),
    DELETE_SECURITY_GROUP(DeleteSecurityGroupRequest.class,"DeleteSecurityGroup"),
    MODIFY_SECURITY_GROUP(CreateSecurityGroupRequest.class,"ModifySecurityGroup"),
    CLONE_SECURITY_GROUP(CreateSecurityGroupRequest.class,"CloneSecurityGroup"),
    DESCRIBE_SECURITY_GROUP(BaseRequest.class,"DescribeSecurityGroup"),
    MODIFY_SECURITY_GROUP_RULE(ModifySecurityGroupRuleRequest.class,"ModifySecurityGroupRule"),
    SECURITY_GROUP_RELATION(SecurityGroupRelationRequest.class,"SecurityGroupRelation"),
    MODIFY_SECURITY_GROUP_RULE_NAME(ModifySecurityGroupRuleNameRequest.class,"ModifySecurityGroupRuleName"),

    /** -------------------parameterGroup------------------- **/
    CREATE_PARAMETER_GROUP(CreateDBParameterGroupRequest.class,"CreateDBParameterGroup"),
    MODIFY_PARAMETER_GROUP(ModifyDBParameterGroupRequest.class,"ModifyDBParameterGroup"),
    DELETE_PARAMETER_GROUP(DeleteDBParameterGroupRequest.class,"DeleteDBParameterGroup"),
    RESET_PARAMETER_GROUP(ResetDBParameterGroupRequest.class,"ResetDBParameterGroup"),
    DESCRIBE_PARAMETER_GROUP(DescribeDBParameterGroupRequest.class,"DescribeDBParameterGroup"),
    DESCRIBE_ENGINE_DEFAULT_PARAMETERS(DescribeEngineDefaultParametersRequest.class,"DescribeEngineDefaultParameters"),

    /** -------------------backup------------------- **/
    CREATE_BACKUP(CreateDBBackupRequest.class,"CreateDBBackup"),
    DELETE_BACKUP(DeleteDBBackupRequest.class,"DeleteDBBackup"),
    DESCRIBE_BACKUPS(BaseRequest.class,"DescribeDBBackups"),
    MODIFY_BACKUP_POLICY(ModifyDBInstanceRequest.class,"ModifyDBInstance"),

    /** -------------------parameterGroup------------------- **/
    START_AUDIT(StartAuditRequest.class,"StartAudit"),
    STOP_AUDIT(StopAuditRequest.class,"StopAudit"),
    LIST_AUDIT(ListAuditRequest.class,"ListAudit"),
    AUDIT_STATISTIC(AuditStatisticRequest.class,"AuditStatistic"),
    START_AUDIT_DETAIL_EXPORT_TASK(StartAuditDetailExportTaskRequest.class,"StartAuditDetailExportTask"),
    LIST_AUDIT_DETAIL_EXPORT_TASK(ListAuditDetailExportTaskRequest.class,"ListAuditDetailExportTask"),

    /** -------------------log------------------- **/
    DESCRIBE_LOG_FILES(DescribeDBLogFilesRequest.class, "DescribeDBLogFiles"),
    DELETE_BIN_LOG(DeleteDBBinlogRequest.class,"DeleteDBBinlog"),
    DESCRIBE_LAST_LOG(DescribeDBLogRequest.class,"DescribeLastLog"),

    /** -------------------auditStatistic------------------- **/
    DESCRIBE_AUDIT_HOT_COUNT(AuditHotStatisticRequest.class, "DescribeAuditHotCount"),
    DESCRIBE_AUDIT_HOT_DURATION(DescribeAuditHotDurationRequest.class, "DescribeAuditHotDuration"),
    SQL_AUDIT_REPORT(AuditTemplateRequest.class,"SqlAuditReport"),
    SQL_AUDIT_LINE_CHART(SqlAuditLineChartRequest.class,"SqlAuditLineChart"),

    /** -------------------account------------------- **/
    LIST_ACCOUNT(ListAccountRequest.class,"ListAccount"),
    CREATE_ACCOUNT(CreateAccountRequest.class,"CreateAccount"),
    DESCRIBE_ACCOUNT(DescribeAccountRequest.class, "DescribeAccount"),
    MODIFY_ACCOUNT(ModifyAccountRequest.class,"ModifyAccount"),
    LIST_ACCOUNT_SUPPORT_PRIVILEGES(ListAccountSupportPrivilegesRequest.class,"ListAccountSupportPrivileges"),
    DELETE_ACCOUNT(DeleteAccountRequest.class,"DeleteAccount"),
    ModifyInstanceAccountPrivilegesAction(ModifyInstanceAccountPrivilegesActionRequest.class,"ModifyInstanceAccountPrivilegesAction"),
    CreateInstanceAccountAction(CreateInstanceAccountActionRequest.class,"CreateInstanceAccountAction"),

    /** -------------------database------------------- **/
    CreateInstanceAccount(com.ksc.krds.model.database.CreateAccountRequest.class,"CreateInstanceAccount"),
    DescribeInstanceAccounts(com.ksc.krds.model.database.DescribeAccountRequest.class,"DescribeInstanceAccounts"),
    ModifyInstanceAccountInfo(ModifyAccountPasswordRequest.class,"ModifyInstanceAccountInfo"),
    ModifyInstanceAccountPrivileges(com.ksc.krds.model.database.ModifyAccountRequest.class,"ModifyInstanceAccountPrivileges"),
    DeleteInstanceAccount(com.ksc.krds.model.database.DeleteAccountRequest.class,"DeleteInstanceAccount"),
    DescribeCollations(InstanceRequest.class,"DescribeCollations"),
    CreateInstanceDatabase(CreateDatabaseRequest.class,"CreateInstanceDatabase"),
    ModifyInstanceDatabasePrivileges(ModifyDatabasePrivilegesRequest.class,"ModifyInstanceDatabasePrivileges"),
    DescribeInstanceDatabases(DescribeDatabaseRequest.class,"DescribeInstanceDatabases"),
    DeleteInstanceDatabase(DeleteDatabaseRequest.class,"DeleteInstanceDatabase"),
    ModifyInstanceDatabaseInfo(ModifyDatabaseInfoRequest.class,"ModifyInstanceDatabaseInfo"),

    /** -------------------eip------------------- **/
    ALLOCATE_EIP(AllocateDBInstanceEipRequest.class, "AllocateDBInstanceEip"),
    RELEASE_EIP(ReleaseDBInstanceEipRequest.class, "ReleaseDBInstanceEip"),
    ModifyDBNetwork(ModifyDBNetworkRequest.class, "ModifyDBNetwork"),

    /** -------------------slowLog------------------- **/
    SlowLogLineChart(SlowLogLineChartRequest.class,"SlowLogLineChart"),
    SlowLogReport(SlowLogReportRequest.class,"SlowLogReport"),
    SlowLogDetail(SlowLogDetailRequest.class, "SlowLogDetail"),
    StartSlowLogDetailExportTask(com.ksc.krds.model.slowlog.StartAuditDetailExportTaskRequest.class,"StartSlowLogDetailExportTask"),
    ListSlowLogDetailExportTask(com.ksc.krds.model.slowlog.ListAuditRequest.class,"ListSlowLogDetailExportTask"),
    ;
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
