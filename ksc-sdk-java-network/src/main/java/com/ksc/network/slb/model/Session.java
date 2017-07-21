package com.ksc.network.slb.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by LIUHONGMING on 2017/4/20.
 */
@ToString
@EqualsAndHashCode
public class Session {
    /**
     * 会话保持的状态
     */
    private String SessionState;

    /**
     * 会话保持超时时间
     */
    private Long SessionPersistencePeriod;

    /**
     * 会话类型，tcp类型监听器没有此参数，http类型监听器才有。植入cookie（ImplantCookie ）、重写cookie（RewriteCookie）
     */
    private String CookieType;

    /**
     * Cookie的名称，tcp类型监听器没有此参数，http类型监听器且CookieType为RewriteCookie才需要填写。
     */
    private String CookieName;

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
}
