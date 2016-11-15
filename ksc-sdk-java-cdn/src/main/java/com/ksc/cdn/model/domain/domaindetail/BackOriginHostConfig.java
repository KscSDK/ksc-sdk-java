package com.ksc.cdn.model.domain.domaindetail;

/**
 * BackOriginHostConfig
 * 回源host功能设置
 * 注意： 若源站为KS3域名，需将ks3域名设置为回源host（即源站域名），方可正常回源
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class BackOriginHostConfig {
    /**
     * 自定义回源域名，默认为空，表示不需要修改回源Host。
     */
    private String BackOriginHost;

    public String getBackOriginHost() {
        return BackOriginHost;
    }

    public void setBackOriginHost(String backOriginHost) {
        BackOriginHost = backOriginHost;
    }
}
