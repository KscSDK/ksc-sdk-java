package com.ksc.network.slb.model;

import java.io.Serializable;

import lombok.ToString;

/**
 * Created by LIUHONGMING on 2017/4/26.
 */
@ToString
public class ModifyListenersResult implements Serializable, Cloneable {

    /**
     * 监听器创建时间
     */
    private String CreateTime;

    /**
     * 健康检查信息
     */
    private HealthCheck HealthCheck;

    /**
     * 监听器的ID
     */
    private String ListenerId;

    /**
     * 监听器的转发方式
     */
    private String Method;

    /**
     * 真实服务器信息
     */
    private RealServer RealServer;

    /**
     * 监听器的名称
     */
    private String ListenerName;

    /**
     * 负载均衡的ID
     */
    private String LoadBalancerId;

    /**
     * 监听器的协议
     */
    private String ListenerProtocol;

    /**
     * 监听器的协议端口
     */
    private String ListenerPort;

    /**
     * 会话保持信息
     */
    private Session Session;

    /**
     * 监听器的状态
     */
    private String ListenerState;

    /**
     * 请求ID
     */
    private String RequestId;

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public com.ksc.network.slb.model.HealthCheck getHealthCheck() {
        return HealthCheck;
    }

    public void setHealthCheck(com.ksc.network.slb.model.HealthCheck healthCheck) {
        HealthCheck = healthCheck;
    }

    public String getListenerId() {
        return ListenerId;
    }

    public void setListenerId(String listenerId) {
        ListenerId = listenerId;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public com.ksc.network.slb.model.RealServer getRealServer() {
        return RealServer;
    }

    public void setRealServer(com.ksc.network.slb.model.RealServer realServer) {
        RealServer = realServer;
    }

    public String getListenerName() {
        return ListenerName;
    }

    public void setListenerName(String listenerName) {
        ListenerName = listenerName;
    }

    public String getLoadBalancerId() {
        return LoadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        LoadBalancerId = loadBalancerId;
    }

    public String getListenerProtocol() {
        return ListenerProtocol;
    }

    public void setListenerProtocol(String listenerProtocol) {
        ListenerProtocol = listenerProtocol;
    }

    public String getListenerPort() {
        return ListenerPort;
    }

    public void setListenerPort(String listenerPort) {
        ListenerPort = listenerPort;
    }

    public com.ksc.network.slb.model.Session getSession() {
        return Session;
    }

    public void setSession(com.ksc.network.slb.model.Session session) {
        Session = session;
    }

    public String getListenerState() {
        return ListenerState;
    }

    public void setListenerState(String listenerState) {
        ListenerState = listenerState;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyListenersResult that = (ModifyListenersResult) o;

        if (CreateTime != null ? !CreateTime.equals(that.CreateTime) : that.CreateTime != null) return false;
        if (HealthCheck != null ? !HealthCheck.equals(that.HealthCheck) : that.HealthCheck != null) return false;
        if (ListenerId != null ? !ListenerId.equals(that.ListenerId) : that.ListenerId != null) return false;
        if (Method != null ? !Method.equals(that.Method) : that.Method != null) return false;
        if (RealServer != null ? !RealServer.equals(that.RealServer) : that.RealServer != null) return false;
        if (ListenerName != null ? !ListenerName.equals(that.ListenerName) : that.ListenerName != null) return false;
        if (LoadBalancerId != null ? !LoadBalancerId.equals(that.LoadBalancerId) : that.LoadBalancerId != null)
            return false;
        if (ListenerProtocol != null ? !ListenerProtocol.equals(that.ListenerProtocol) : that.ListenerProtocol != null)
            return false;
        if (ListenerPort != null ? !ListenerPort.equals(that.ListenerPort) : that.ListenerPort != null) return false;
        if (Session != null ? !Session.equals(that.Session) : that.Session != null) return false;
        if (ListenerState != null ? !ListenerState.equals(that.ListenerState) : that.ListenerState != null)
            return false;
        return RequestId != null ? RequestId.equals(that.RequestId) : that.RequestId == null;
    }

    @Override
    public int hashCode() {
        int result = CreateTime != null ? CreateTime.hashCode() : 0;
        result = 31 * result + (HealthCheck != null ? HealthCheck.hashCode() : 0);
        result = 31 * result + (ListenerId != null ? ListenerId.hashCode() : 0);
        result = 31 * result + (Method != null ? Method.hashCode() : 0);
        result = 31 * result + (RealServer != null ? RealServer.hashCode() : 0);
        result = 31 * result + (ListenerName != null ? ListenerName.hashCode() : 0);
        result = 31 * result + (LoadBalancerId != null ? LoadBalancerId.hashCode() : 0);
        result = 31 * result + (ListenerProtocol != null ? ListenerProtocol.hashCode() : 0);
        result = 31 * result + (ListenerPort != null ? ListenerPort.hashCode() : 0);
        result = 31 * result + (Session != null ? Session.hashCode() : 0);
        result = 31 * result + (ListenerState != null ? ListenerState.hashCode() : 0);
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        return result;
    }

    @Override
    public ModifyListenersResult clone() {
        try {
            return (ModifyListenersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
