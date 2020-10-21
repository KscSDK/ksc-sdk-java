package com.ksc.network.slb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class RuleSession {

    /**
     * 会话保持超时时间
     */
    private Long cookieExpirationPeriod;
    /**
     * 会话保持的状态
     */
    private String sessionState;
    /**
     * 会话类型
     */
    private String cookieType;
    /**
     * 健康检查的状态
     */
    private String cookieName;


}
