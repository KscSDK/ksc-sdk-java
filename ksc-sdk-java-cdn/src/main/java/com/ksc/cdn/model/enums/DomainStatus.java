package com.ksc.cdn.model.enums;

/**
 * DomainStatus
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public enum DomainStatus {
    ONLINE("online","运行中"),
    OFFLINE("offline","已停止"),
    CONFIGURING("configuring","配置中"),
    CONFIGURE_FAILED("configure_failed","配置失败"),
    ICP_CHECKING("icp_checking","审核中"),
    ICP_CHECK_FAILED("icp_check_failed","审核失败");

    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    DomainStatus(String code, String description){
        this.code=code;
        this.description=description;
    }

    public DomainStatus getBycode(String code){
        for (DomainStatus ds:DomainStatus.values()
             ) {
            if(ds.getCode().equals(code))
                return ds;
        }
        return null;
    }
}
