package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.CreateReadOnlyRedisMarshaller;

import java.io.Serializable;

public class CreateReadOnlyRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateReadOnlyRedisRequest> {
    private String cacheId;


    /**
     * 用于重命名
     */
    private String name;
    private String oldName;
    /**
     * 用于检查更配可行性
     */
    private Integer capacity;
    private Integer oldCapacity;
    private Integer nodeCapacity;
    /**
     * 只读节点ID
     */
    private String nodeId;
    /**
     * 用于缓存数据供方法使用
     */
    private Long id;
    private Byte mode;//缓存服务方式 ：1-集群, 2-单主从
    private Byte status;//缓存服务状态
    private Integer securityGroupId;//安全组ID
    private Integer port;
    private String subOrderId;
    private Integer slaveNum = 0;
    private Integer newSlaveNum;
    private String vip;
    private String slaveVip;//只读节点指定内网ip
    /**
     * Hook parameter
     * isInvokeOrder : 是否调用的订单接口 true=调用， false=不调用
     * isDeletedCache : 是否删除底层已经删除实例的记录 true=是删除， false=没有删除
     */
    private Boolean isInvokeOrder = true;
    private Boolean isDeletedCache = false;
    // 新增版本号
    private String protocol;
    // 申请外网IP实例类型
    private Integer insType;
    /**
     * 为了适配俄罗斯的多可用区（后期会陆续接入其它机房）
     */
    //【更配】主从实例的只读节点所在可用区
    private Integer area;
    //内部使用
    //直连ip是否启用（因为direct_vips字段只要是开启直连，哪怕是关闭直连direct_vips字段会一直存在；0代表未开启直连，1代表已经开启直连）
    private Integer direct_conn_enabled;
    private String message;
    private String vip_ro;
    private String vnet_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getOldCapacity() {
        return oldCapacity;
    }

    public void setOldCapacity(Integer oldCapacity) {
        this.oldCapacity = oldCapacity;
    }

    public Integer getNodeCapacity() {
        return nodeCapacity;
    }

    public void setNodeCapacity(Integer nodeCapacity) {
        this.nodeCapacity = nodeCapacity;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getMode() {
        return mode;
    }

    public void setMode(Byte mode) {
        this.mode = mode;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(Integer securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }

    public Integer getSlaveNum() {
        return slaveNum;
    }

    public void setSlaveNum(Integer slaveNum) {
        this.slaveNum = slaveNum;
    }

    public Integer getNewSlaveNum() {
        return newSlaveNum;
    }

    public void setNewSlaveNum(Integer newSlaveNum) {
        this.newSlaveNum = newSlaveNum;
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

    public Boolean getInvokeOrder() {
        return isInvokeOrder;
    }

    public void setInvokeOrder(Boolean invokeOrder) {
        isInvokeOrder = invokeOrder;
    }

    public Boolean getDeletedCache() {
        return isDeletedCache;
    }

    public void setDeletedCache(Boolean deletedCache) {
        isDeletedCache = deletedCache;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getInsType() {
        return insType;
    }

    public void setInsType(Integer insType) {
        this.insType = insType;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getDirect_conn_enabled() {
        return direct_conn_enabled;
    }

    public void setDirect_conn_enabled(Integer direct_conn_enabled) {
        this.direct_conn_enabled = direct_conn_enabled;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVip_ro() {
        return vip_ro;
    }

    public void setVip_ro(String vip_ro) {
        this.vip_ro = vip_ro;
    }

    public String getVnet_id() {
        return vnet_id;
    }

    public void setVnet_id(String vnet_id) {
        this.vnet_id = vnet_id;
    }




    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Request<CreateReadOnlyRedisRequest> getDryRunRequest() {
        Request<CreateReadOnlyRedisRequest> request = new CreateReadOnlyRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
