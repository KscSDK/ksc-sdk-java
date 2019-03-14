package com.ksc.memcached.model.instance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

public class ListMemcachedResponse {
    private Integer offset;
    private Integer limit;
    private Integer total;
    private List<ListRedis> list;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<ListRedis> getList() {
        return list;
    }

    public void setList(List<ListRedis> list) {
        this.list = list;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ListRedis {
        private String cacheId;
        private String region;
        private String az;
        private String name;
        private String securityGroupId;
        private String engine;
        private Byte mode;
        private Integer size;
        private Integer port;
        private String vip;
        private Byte status;
        private Date createTime;
        private Byte netType;
        private String vpcId;
        private String vnetId;
        private Integer billType;
        private Integer orderType;
        private Byte source;
        private Integer serviceStatus;
        private Date serviceBeginTime;
        private Date serviceEndTime;
        private String iamProjectId;
        private String iamProjectName;
        private String protocol;

        public String getCacheId() {
            return cacheId;
        }

        public void setCacheId(String cacheId) {
            this.cacheId = cacheId;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
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

        public String getSecurityGroupId() {
            return securityGroupId;
        }

        public void setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
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

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }
    }
}
