package com.ksc.network.slb.model;

import com.ksc.internal.SdkInternalList;
import com.ksc.network.vpc.model.Nat.AssociateNat;
import com.ksc.network.vpc.model.Nat.NatIp;
import lombok.EqualsAndHashCode;
import lombok.ToString;
/**
 * Created by LIUHONGMING on 2017/4/20.
 */
@ToString
@EqualsAndHashCode
public class Listener {
    /**
     * 监听器创建时间
     */
    private String CreateTime;

    /**
     * 负载均衡的ID
     */
    private String LoadBalancerId;

    /**
     * 监听器的名称
     */
    private String ListenerName;

    /**
     * 监听器的ID
     */
    private String ListenerId;

    /**
     * 监听器的状态，开启（start）、关闭（stop）
     */
    private String ListenerState;

    /**
     * 证书的ID，HTTPS类型监听器创建此参数不可缺省
     */
    private String CertificateId;

    /**
     * 监听器的协议
     */
    private String ListenerProtocol;

    /**
     * 监听器的协议端口
     */
    private String ListenerPort;

    /**
     * 监听器的转发方式，轮询（RoundRobin）、最小连接数（LeastConnections）
     */
    private String Method;

    /**
     * 健康检查信息
     */
    private com.ksc.internal.SdkInternalList<HealthCheck> HealthCheck;

    /**
     * 会话保持信息
     */
    private com.ksc.internal.SdkInternalList<Session> Session;

    /**
     * 真实服务器信息
     */
    private com.ksc.internal.SdkInternalList<RealServer> RealServer;

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getLoadBalancerId() {
        return LoadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        LoadBalancerId = loadBalancerId;
    }

    public String getListenerName() {
        return ListenerName;
    }

    public void setListenerName(String listenerName) {
        ListenerName = listenerName;
    }

    public String getListenerId() {
        return ListenerId;
    }

    public void setListenerId(String listenerId) {
        ListenerId = listenerId;
    }

    public String getListenerState() {
        return ListenerState;
    }

    public void setListenerState(String listenerState) {
        ListenerState = listenerState;
    }

    public String getCertificateId() {
        return CertificateId;
    }

    public void setCertificateId(String certificateId) {
        CertificateId = certificateId;
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

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public SdkInternalList<com.ksc.network.slb.model.HealthCheck> getHealthCheck() {
        return HealthCheck;
    }

    public void setHealthCheck(SdkInternalList<com.ksc.network.slb.model.HealthCheck> healthCheck) {
        HealthCheck = healthCheck;
    }

    public SdkInternalList<com.ksc.network.slb.model.Session> getSession() {
        return Session;
    }

    public void setSession(SdkInternalList<com.ksc.network.slb.model.Session> session) {
        Session = session;
    }

    public SdkInternalList<com.ksc.network.slb.model.RealServer> getRealServer() {
        return RealServer;
    }

    public void setRealServer(SdkInternalList<com.ksc.network.slb.model.RealServer> realServer) {
        RealServer = realServer;
    }

    public void addHealthCheck(HealthCheck... healthChecks) {
        if (HealthCheck == null) {
            HealthCheck = new com.ksc.internal.SdkInternalList<HealthCheck>();
        }
        for (HealthCheck healthCheck : healthChecks) {
            HealthCheck.add(healthCheck);
        }
    }

    public void addSession(Session... sessions) {
        if (Session == null) {
            Session = new com.ksc.internal.SdkInternalList<Session>();
        }
        for (Session session : sessions) {
            Session.add(session);
        }
    }

    public void addRealServer(RealServer... realServers) {
        if (RealServer == null) {
            RealServer = new com.ksc.internal.SdkInternalList<RealServer>();
        }
        for (RealServer realServer : realServers) {
            RealServer.add(realServer);
        }
    }
}
