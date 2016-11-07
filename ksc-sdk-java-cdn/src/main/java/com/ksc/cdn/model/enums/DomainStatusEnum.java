package com.ksc.cdn.model.enums;

import lombok.Getter;

/**
 * Created by CrazyHorse on 9/20/16.
 * 域名状态
 */
@Getter
public enum DomainStatusEnum {

    ONLINE("online", "运行中"),
    OFFLINE("offline", "已停止"),
    CONFIGURING("configuring", "配置中"),
    CONFIGURE_FAILED("configure_failed", "配置失败"),
    ICP_CHECKING("icp_checking", "审核中"),
    ICP_CHECK_FAILED("icp_check_failed", "审核失败");

    private String value;

    private String desc;

    DomainStatusEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static DomainStatusEnum value(String value) {
        for (DomainStatusEnum domainStatusEnum : DomainStatusEnum.values()) {
            if (domainStatusEnum.getValue().equals(value)) {
                return domainStatusEnum;
            }
        }
        return null;
    }
}
