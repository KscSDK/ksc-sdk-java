package com.ksc.network.slb.model;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateListeners.
 * </p>
 */
@ToString
public class CreateListenersResult implements Serializable, Cloneable {


    private String CreateTime;

    private String ListenerId;

    private String Method;

    private String ListenerName;

    private String LoadBalancerId;

    private String ListenerProtocol;

    private String ListenerPort;

    private String RequestId;

    private Session Session;

    private String ListenerState;

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
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

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateListenersResult that = (CreateListenersResult) o;

        if (CreateTime != null ? !CreateTime.equals(that.CreateTime) : that.CreateTime != null) return false;
        if (ListenerId != null ? !ListenerId.equals(that.ListenerId) : that.ListenerId != null) return false;
        if (Method != null ? !Method.equals(that.Method) : that.Method != null) return false;
        if (ListenerName != null ? !ListenerName.equals(that.ListenerName) : that.ListenerName != null) return false;
        if (LoadBalancerId != null ? !LoadBalancerId.equals(that.LoadBalancerId) : that.LoadBalancerId != null)
            return false;
        if (ListenerProtocol != null ? !ListenerProtocol.equals(that.ListenerProtocol) : that.ListenerProtocol != null)
            return false;
        if (ListenerPort != null ? !ListenerPort.equals(that.ListenerPort) : that.ListenerPort != null) return false;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (Session != null ? !Session.equals(that.Session) : that.Session != null) return false;
        return ListenerState != null ? ListenerState.equals(that.ListenerState) : that.ListenerState == null;
    }

    @Override
    public int hashCode() {
        int result = CreateTime != null ? CreateTime.hashCode() : 0;
        result = 31 * result + (ListenerId != null ? ListenerId.hashCode() : 0);
        result = 31 * result + (Method != null ? Method.hashCode() : 0);
        result = 31 * result + (ListenerName != null ? ListenerName.hashCode() : 0);
        result = 31 * result + (LoadBalancerId != null ? LoadBalancerId.hashCode() : 0);
        result = 31 * result + (ListenerProtocol != null ? ListenerProtocol.hashCode() : 0);
        result = 31 * result + (ListenerPort != null ? ListenerPort.hashCode() : 0);
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (Session != null ? Session.hashCode() : 0);
        result = 31 * result + (ListenerState != null ? ListenerState.hashCode() : 0);
        return result;
    }

    @Override
    public CreateListenersResult clone() {
        try {
            return (CreateListenersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }	
}