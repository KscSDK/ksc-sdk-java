package com.ksc.network.slb.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.CreateListenersRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateListeners.
 * </p>
 */
public class CreateListenersRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateListenersRequest> {


    /**
     * 负载均衡的ID
     */
    private String LoadBalancerId;
    /**
     * 监听器的状态
     */
    private String ListenerState;
    /**
     * 监听器的名称
     */
    private String ListenerName;
    /**
     * 监听器协议
     */
    private String ListenerProtocol;
    /**
     * 证书的ID，HTTPS类型监听器创建此参数不可缺省
     */
    private String CertificateId;
    /**
     * 监听器的协议端口
     */
    private String ListenerPort;
    /**
     * 监听器的转发方式
     */
    private String Method;
    /**
     * 会话保持的状态
     */
    private String SessionState;
    /**
     * 会话保持超时时间
     */
    private Long SessionPersistencePeriod;
    /**
     * 会话类型，tcp类型监听器没有此参数，http类型监听器才有。
     */
    private String CookieType;
    /**
     * Cookie的名称，tcp类型监听器没有此参数，http类型监听器且CookieType为RewriteCookie才需要填写。
     */
    private String CookieName;

    public String getLoadBalancerId() {
        return LoadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        LoadBalancerId = loadBalancerId;
    }

    public String getListenerState() {
        return ListenerState;
    }

    public void setListenerState(String listenerState) {
        ListenerState = listenerState;
    }

    public String getListenerName() {
        return ListenerName;
    }

    public void setListenerName(String listenerName) {
        ListenerName = listenerName;
    }

    public String getListenerProtocol() {
        return ListenerProtocol;
    }

    public void setListenerProtocol(String listenerProtocol) {
        ListenerProtocol = listenerProtocol;
    }

    public String getCertificateId() {
        return CertificateId;
    }

    public void setCertificateId(String certificateId) {
        CertificateId = certificateId;
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

    public String getSessionState() {
        return SessionState;
    }

    public void setSessionState(String sessionState) {
        SessionState = sessionState;
    }

    public Long getSessionPersistencePeriod() {
        return SessionPersistencePeriod;
    }

    public void setSessionPersistencePeriod(Long sessionPersistencePeriod) {
        SessionPersistencePeriod = sessionPersistencePeriod;
    }

    public String getCookieType() {
        return CookieType;
    }

    public void setCookieType(String cookieType) {
        CookieType = cookieType;
    }

    public String getCookieName() {
        return CookieName;
    }

    public void setCookieName(String cookieName) {
        CookieName = cookieName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateListenersRequest that = (CreateListenersRequest) o;

        if (LoadBalancerId != null ? !LoadBalancerId.equals(that.LoadBalancerId) : that.LoadBalancerId != null)
            return false;
        if (ListenerState != null ? !ListenerState.equals(that.ListenerState) : that.ListenerState != null)
            return false;
        if (ListenerName != null ? !ListenerName.equals(that.ListenerName) : that.ListenerName != null) return false;
        if (ListenerProtocol != null ? !ListenerProtocol.equals(that.ListenerProtocol) : that.ListenerProtocol != null)
            return false;
        if (CertificateId != null ? !CertificateId.equals(that.CertificateId) : that.CertificateId != null)
            return false;
        if (ListenerPort != null ? !ListenerPort.equals(that.ListenerPort) : that.ListenerPort != null) return false;
        if (Method != null ? !Method.equals(that.Method) : that.Method != null) return false;
        if (SessionState != null ? !SessionState.equals(that.SessionState) : that.SessionState != null) return false;
        if (SessionPersistencePeriod != null ? !SessionPersistencePeriod.equals(that.SessionPersistencePeriod) : that.SessionPersistencePeriod != null)
            return false;
        if (CookieType != null ? !CookieType.equals(that.CookieType) : that.CookieType != null) return false;
        return CookieName != null ? CookieName.equals(that.CookieName) : that.CookieName == null;
    }

    @Override
    public int hashCode() {
        int result = LoadBalancerId != null ? LoadBalancerId.hashCode() : 0;
        result = 31 * result + (ListenerState != null ? ListenerState.hashCode() : 0);
        result = 31 * result + (ListenerName != null ? ListenerName.hashCode() : 0);
        result = 31 * result + (ListenerProtocol != null ? ListenerProtocol.hashCode() : 0);
        result = 31 * result + (CertificateId != null ? CertificateId.hashCode() : 0);
        result = 31 * result + (ListenerPort != null ? ListenerPort.hashCode() : 0);
        result = 31 * result + (Method != null ? Method.hashCode() : 0);
        result = 31 * result + (SessionState != null ? SessionState.hashCode() : 0);
        result = 31 * result + (SessionPersistencePeriod != null ? SessionPersistencePeriod.hashCode() : 0);
        result = 31 * result + (CookieType != null ? CookieType.hashCode() : 0);
        result = 31 * result + (CookieName != null ? CookieName.hashCode() : 0);
        return result;
    }

    @Override
    public CreateListenersRequest clone() {
        return (CreateListenersRequest) super.clone();
    }

    @Override
    public Request<CreateListenersRequest> getDryRunRequest() {
        Request<CreateListenersRequest> request = new CreateListenersRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}