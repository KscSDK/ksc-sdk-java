package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.CreateRedisMarshaller;

import java.io.Serializable;

public class CreateRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateRedisRequest> {
    private String name;
    private String passWord;
    private Byte mode = 2;
    private Integer capacity = 1;
    private Integer slaveNum = 0;
    private String vpcId;
    private String vnetId;
    private Integer billType = 1;
    private Integer productWhat = 1;
    private Integer duration = 1;
    private String expirationDate;
    private String protocol;
    private String iamProjectId = "0";
    private Byte netType = 2;
    private Integer port = 6379;
    private String securityGroupId;
    private String slaveVip;
    private String vip;


    private String cacheId;
    private Integer orderUse;
    private String durationUnit = "月";
    private Integer num = 1;
    private String subOrderId;
    private String packageCode;
    private String iamProjectName;
    private String backupTimezone;
    private Integer area;
    private Integer slave_area;
    private Integer ro_area = area;
    public void setNetType(Byte netType) {
        this.netType = netType;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Integer getOrderUse() {
        return orderUse;
    }

    public void setOrderUse(Integer orderUse) {
        this.orderUse = orderUse;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getIamProjectName() {
        return iamProjectName;
    }

    public void setIamProjectName(String iamProjectName) {
        this.iamProjectName = iamProjectName;
    }

    public String getBackupTimezone() {
        return backupTimezone;
    }

    public void setBackupTimezone(String backupTimezone) {
        this.backupTimezone = backupTimezone;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getSlave_area() {
        return slave_area;
    }

    public void setSlave_area(Integer slave_area) {
        this.slave_area = slave_area;
    }

    public Integer getRo_area() {
        return ro_area;
    }

    public void setRo_area(Integer ro_area) {
        this.ro_area = ro_area;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Byte getMode() {
        return mode;
    }

    public void setMode(Byte mode) {
        this.mode = mode;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getSlaveNum() {
        return slaveNum;
    }

    public void setSlaveNum(Integer slaveNum) {
        this.slaveNum = slaveNum;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVnetId() {
        return vnetId;
    }

    public void setVnetId(String vnetId) {
        this.vnetId = vnetId;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public Integer getProductWhat() {
        return productWhat;
    }

    public void setProductWhat(Integer productWhat) {
        this.productWhat = productWhat;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getIamProjectId() {
        return iamProjectId;
    }

    public void setIamProjectId(String iamProjectId) {
        this.iamProjectId = iamProjectId;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Byte getNetType() {
        return netType;
    }

    public Integer getPort() {
        return port;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSlaveVip() {
        return slaveVip;
    }

    public void setSlaveVip(String slaveVip) {
        this.slaveVip = slaveVip;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }



    public Request<CreateRedisRequest> getDryRunRequest() {
        Request<CreateRedisRequest> request = new CreateRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
