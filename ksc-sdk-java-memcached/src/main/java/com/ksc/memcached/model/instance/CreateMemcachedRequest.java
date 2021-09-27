package com.ksc.memcached.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.instance.CreateMemcachedMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class CreateMemcachedRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateMemcachedRequest> {
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
    private Integer port = 11211;


    private String cacheId;
    /**
     * 为用户指专用的VIP的信息
     */
    private String vip;
    /**
     * 创建主从实例+只读实例时，只读实例指定内网ip的字段
     */
    private String slaveVip;
    /**
     * 默认为1,订单用途 - 1：普通购买, 2：续费, 3：升级, 4：试用购买, 5：转正, 7：退订, 8：延期
     */
    private Integer orderUse;
    /**
     * 时长单位 默认值：月
     */
    private String durationUnit = "月";
    /**
     * 创建服务的数量， 默认为1
     */
    private Integer num = 1;
    private String subOrderId;
    /**
     * 套餐CODE
     */
    private String packageCode;
    private String iamProjectName;
    private String backupTimezone;
    private String securityGroupId;
    //主从实例的主所在可用区，或者集群所在可用区
    private Integer area;
    //主从实例的从所在可用区
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

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getSlaveVip() {
        return slaveVip;
    }

    public void setSlaveVip(String slaveVip) {
        this.slaveVip = slaveVip;
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

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
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

    public Request<CreateMemcachedRequest> getDryRunRequest() {
        Request<CreateMemcachedRequest> request = new CreateMemcachedMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
