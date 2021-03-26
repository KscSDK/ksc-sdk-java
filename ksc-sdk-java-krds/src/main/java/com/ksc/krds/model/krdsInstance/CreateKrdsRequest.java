package com.ksc.krds.model.krdsInstance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.krdsInstance.CreateKrdsMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class CreateKrdsRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<CreateKrdsRequest> {

    private String DBInstanceClass;
    private String DBInstanceName;
    private String Engine;
    private String EngineVersion;
    private String MasterUserPassword;
    private String MasterUserName;
    private String DBInstanceType;
    private String VpcId;
    private String SubnetId;
    private Integer Mem;
    private Integer Disk;
    private String PreferredBackupTime;
    private String DBParameterGroupId;
    private Integer Port;
    private String BillType;
    private String Duration;
    private String DurationUnit;
    private Integer ProjectId;
    private String RequestId;

    public String getDBInstanceClass() {
        return DBInstanceClass;
    }

    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    public String getDBInstanceName() {
        return DBInstanceName;
    }

    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
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

    public String getMasterUserPassword() {
        return MasterUserPassword;
    }

    public void setMasterUserPassword(String masterUserPassword) {
        MasterUserPassword = masterUserPassword;
    }

    public String getMasterUserName() {
        return MasterUserName;
    }

    public void setMasterUserName(String masterUserName) {
        MasterUserName = masterUserName;
    }

    public String getDBInstanceType() {
        return DBInstanceType;
    }

    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }

    public Integer getMem() {
        return Mem;
    }

    public void setMem(Integer mem) {
        Mem = mem;
    }

    public Integer getDisk() {
        return Disk;
    }

    public void setDisk(Integer disk) {
        Disk = disk;
    }

    public String getPreferredBackupTime() {
        return PreferredBackupTime;
    }

    public void setPreferredBackupTime(String preferredBackupTime) {
        PreferredBackupTime = preferredBackupTime;
    }

    public String getDBParameterGroupId() {
        return DBParameterGroupId;
    }

    public void setDBParameterGroupId(String DBParameterGroupId) {
        this.DBParameterGroupId = DBParameterGroupId;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
    }

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getDurationUnit() {
        return DurationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        DurationUnit = durationUnit;
    }

    public Integer getProjectId() {
        return ProjectId;
    }

    public void setProjectId(Integer projectId) {
        ProjectId = projectId;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public Request<CreateKrdsRequest> getDryRunRequest() {
        Request<CreateKrdsRequest> request = new CreateKrdsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}