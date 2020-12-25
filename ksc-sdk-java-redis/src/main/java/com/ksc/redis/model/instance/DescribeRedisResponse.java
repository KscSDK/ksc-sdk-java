package com.ksc.redis.model.instance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DescribeRedisResponse {
    private String cacheId;
    private String az;
    private String name;
    private String engine;
    private Byte mode;
    private Integer size;
    private Integer port;
    private String vip;
    private String slaveVip;
    private Integer slaveNum;
    private Byte status;
    private Date createTime;
    private Byte netType;
    private String vpcId;
    private String vnetId;
    private String timingSwitch;
    private String timezone;
    private BigDecimal usedMemory;
    private String subOrderId;
    private String productId;
    private Integer billType;
    private Integer orderType;
    private Integer orderUse;
    private Byte source;
    private Integer serviceStatus;
    private Date serviceBeginTime;
    private Date serviceEndTime;
    private String protocol;
    private String iamProjectId;
    private String iamProjectName;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Byte getMode() {
        return mode;
    }

    public void setMode(Byte mode) {
        this.mode = mode;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
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

    public Integer getSlaveNum() {
        return slaveNum;
    }

    public void setSlaveNum(Integer slaveNum) {
        this.slaveNum = slaveNum;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getNetType() {
        return netType;
    }

    public void setNetType(Byte netType) {
        this.netType = netType;
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

    public String getTimingSwitch() {
        return timingSwitch;
    }

    public void setTimingSwitch(String timingSwitch) {
        this.timingSwitch = timingSwitch;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public BigDecimal getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(BigDecimal usedMemory) {
        this.usedMemory = usedMemory;
    }

    public String getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderUse() {
        return orderUse;
    }

    public void setOrderUse(Integer orderUse) {
        this.orderUse = orderUse;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Integer getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Integer serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public Date getServiceBeginTime() {
        return serviceBeginTime;
    }

    public void setServiceBeginTime(Date serviceBeginTime) {
        this.serviceBeginTime = serviceBeginTime;
    }

    public Date getServiceEndTime() {
        return serviceEndTime;
    }

    public void setServiceEndTime(Date serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getIamProjectId() {
        return iamProjectId;
    }

    public void setIamProjectId(String iamProjectId) {
        this.iamProjectId = iamProjectId;
    }

    public String getIamProjectName() {
        return iamProjectName;
    }

    public void setIamProjectName(String iamProjectName) {
        this.iamProjectName = iamProjectName;
    }
}
