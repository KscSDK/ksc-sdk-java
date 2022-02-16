package com.ksc.krds.model.krdsInstance;

import java.util.List;

public class StatisticDBInstancesRequest extends BaseRequest<StatisticDBInstancesRequest>{

    private Integer ExpiryDateLessThan;
    private String GroupId;
    private String[] DBInstanceType;
    private String DBInstanceStatus;
    private String Keyword;
    private List<String> DBType;

    public Integer getExpiryDateLessThan() {
        return ExpiryDateLessThan;
    }

    public void setExpiryDateLessThan(Integer expiryDateLessThan) {
        ExpiryDateLessThan = expiryDateLessThan;
    }

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public String[] getDBInstanceType() {
        return DBInstanceType;
    }

    public void setDBInstanceType(String[] DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    public String getDBInstanceStatus() {
        return DBInstanceStatus;
    }

    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }

    public List<String> getDBType() {
        return DBType;
    }

    public void setDBType(List<String> DBType) {
        this.DBType = DBType;
    }
}
