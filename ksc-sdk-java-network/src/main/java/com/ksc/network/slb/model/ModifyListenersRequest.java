package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.ModifyListenersRequestMarshaller;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/25.
 */
public class ModifyListenersRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyListenersRequest> {

    /**
     * 监听器的ID
     */
    private String ListenerId;

    /**
     * 监听器的名称
     */
    private String ListenerName;

    /**
     * 监听器的状态
     */
    private String ListenerState;

    /**
     * 会话保持的状态
     */
    private String SessionState;

    /**
     * 监听器的转发方式
     */
    private String Method;

    /**
     * 监听器的转发方式
     */
    private Long SessionPersistencePeriod;

    /**
     * 会话类型，tcp类型监听器没有此参数，http类型监听器才有。
     */
    private String CookieType;

    /**
     * Cookie的名称，tcp类型监听器没有此参数，http类型监听器且CookieType为RewriteCookie才需要填写，首次更改CookieType为RewriteCookie时，此参数必填
     */
    private String CookieName;

    public String getListenerId() {
        return ListenerId;
    }

    public void setListenerId(String listenerId) {
        ListenerId = listenerId;
    }

    public String getListenerName() {
        return ListenerName;
    }

    public void setListenerName(String listenerName) {
        ListenerName = listenerName;
    }

    public String getListenerState() {
        return ListenerState;
    }

    public void setListenerState(String listenerState) {
        ListenerState = listenerState;
    }

    public String getSessionState() {
        return SessionState;
    }

    public void setSessionState(String sessionState) {
        SessionState = sessionState;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
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

        ModifyListenersRequest that = (ModifyListenersRequest) o;

        if (ListenerId != null ? !ListenerId.equals(that.ListenerId) : that.ListenerId != null) return false;
        if (ListenerName != null ? !ListenerName.equals(that.ListenerName) : that.ListenerName != null) return false;
        if (ListenerState != null ? !ListenerState.equals(that.ListenerState) : that.ListenerState != null)
            return false;
        if (SessionState != null ? !SessionState.equals(that.SessionState) : that.SessionState != null) return false;
        if (Method != null ? !Method.equals(that.Method) : that.Method != null) return false;
        if (SessionPersistencePeriod != null ? !SessionPersistencePeriod.equals(that.SessionPersistencePeriod) : that.SessionPersistencePeriod != null)
            return false;
        if (CookieType != null ? !CookieType.equals(that.CookieType) : that.CookieType != null) return false;
        return CookieName != null ? CookieName.equals(that.CookieName) : that.CookieName == null;
    }

    @Override
    public int hashCode() {
        int result = ListenerId != null ? ListenerId.hashCode() : 0;
        result = 31 * result + (ListenerName != null ? ListenerName.hashCode() : 0);
        result = 31 * result + (ListenerState != null ? ListenerState.hashCode() : 0);
        result = 31 * result + (SessionState != null ? SessionState.hashCode() : 0);
        result = 31 * result + (Method != null ? Method.hashCode() : 0);
        result = 31 * result + (SessionPersistencePeriod != null ? SessionPersistencePeriod.hashCode() : 0);
        result = 31 * result + (CookieType != null ? CookieType.hashCode() : 0);
        result = 31 * result + (CookieName != null ? CookieName.hashCode() : 0);
        return result;
    }

    @Override
    public ModifyListenersRequest clone() {
        return (ModifyListenersRequest) super.clone();
    }

    @Override
    public Request<ModifyListenersRequest> getDryRunRequest() {
        Request<ModifyListenersRequest> request = new ModifyListenersRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
