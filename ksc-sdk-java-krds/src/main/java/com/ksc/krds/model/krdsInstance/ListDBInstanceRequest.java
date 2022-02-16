package com.ksc.krds.model.krdsInstance;

public class ListDBInstanceRequest extends BaseRequest<ListDBInstanceRequest>{

    private String InstanceCreateTimeFrom;
    private String InstanceCreateTimeTo;
    private String ServiceEndTimeFrom;
    private String ServiceEndTimeTo;
    private String UserId;
    private String UserEmail;
    private String UserName;
    private String UserCompany;
    private String UserTelephone;
    private String ServiceOrderStatus;
    private String DBInstanceRegion;
    private String DBInstanceName;
    private String Vip;
    private String Engine;
    private String EngineVersion;
    private String DBInstanceIdentifier;
    private String DBInstanceStatus;
    private String DBInstanceType;
    private String BillType;
    private Integer Marker;
    private Integer MaxRecords;
    private String ProductWhat;

    public String getInstanceCreateTimeFrom() {
        return InstanceCreateTimeFrom;
    }

    public void setInstanceCreateTimeFrom(String instanceCreateTimeFrom) {
        InstanceCreateTimeFrom = instanceCreateTimeFrom;
    }

    public String getInstanceCreateTimeTo() {
        return InstanceCreateTimeTo;
    }

    public void setInstanceCreateTimeTo(String instanceCreateTimeTo) {
        InstanceCreateTimeTo = instanceCreateTimeTo;
    }

    public String getServiceEndTimeFrom() {
        return ServiceEndTimeFrom;
    }

    public void setServiceEndTimeFrom(String serviceEndTimeFrom) {
        ServiceEndTimeFrom = serviceEndTimeFrom;
    }

    public String getServiceEndTimeTo() {
        return ServiceEndTimeTo;
    }

    public void setServiceEndTimeTo(String serviceEndTimeTo) {
        ServiceEndTimeTo = serviceEndTimeTo;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserCompany() {
        return UserCompany;
    }

    public void setUserCompany(String userCompany) {
        UserCompany = userCompany;
    }

    public String getUserTelephone() {
        return UserTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        UserTelephone = userTelephone;
    }

    public String getServiceOrderStatus() {
        return ServiceOrderStatus;
    }

    public void setServiceOrderStatus(String serviceOrderStatus) {
        ServiceOrderStatus = serviceOrderStatus;
    }

    public String getDBInstanceRegion() {
        return DBInstanceRegion;
    }

    public void setDBInstanceRegion(String DBInstanceRegion) {
        this.DBInstanceRegion = DBInstanceRegion;
    }

    public String getDBInstanceName() {
        return DBInstanceName;
    }

    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    public String getVip() {
        return Vip;
    }

    public void setVip(String vip) {
        Vip = vip;
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

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getDBInstanceStatus() {
        return DBInstanceStatus;
    }

    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    public String getDBInstanceType() {
        return DBInstanceType;
    }

    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }

    public Integer getMarker() {
        return Marker;
    }

    public void setMarker(Integer marker) {
        Marker = marker;
    }

    public Integer getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        MaxRecords = maxRecords;
    }

    public String getProductWhat() {
        return ProductWhat;
    }

    public void setProductWhat(String productWhat) {
        ProductWhat = productWhat;
    }
}
