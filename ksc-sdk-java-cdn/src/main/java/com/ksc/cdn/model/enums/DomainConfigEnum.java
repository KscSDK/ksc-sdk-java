package com.ksc.cdn.model.enums;

/**
 * DomainConfigEnum
 *
 * @author jiangran@kingsoft.com
 * @date 08/11/2016
 */
public enum DomainConfigEnum {

    cache_expired("cache_expired", "缓存策略"),
    ip("ip", "IP防盗链配置"),
    http_header("http_header", "设置http头"),
    page_compress("page_compress", "智能压缩"),
    ignore_query_string("ignore_query_string", "过滤参数"),
    range("range", "设置range回源"),
    referer("referer", "Refer防盗链功能"),
    req_auth("req_auth", "设置URL鉴权"),
    src_host("src_host", "设置回源host"),
    video_seek("video_seek", "设置拖拽"),
    src_advanced("src_advanced", "设置高级回源"),
    src_probe("src_probe", "设置回源探测"),
    test_url("test_url", "设置测试URL"),
    error_page("error_page", "自定义404错误页面跳转"),
    optimize("optimize", "页面优化"),
    waf("waf", "Waf防护功能"),
    notify_url("notify_url", "视频直播notify url"),
    redirect_type("redirect_type", "强制访问跳转方式");

    private String value;
    private String desc;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    DomainConfigEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static DomainConfigEnum getByValue(String value) {
        for (DomainConfigEnum domainConfig : DomainConfigEnum.values()
                ) {
            if (domainConfig.getValue().equals(value))
                return domainConfig;
        }
        return null;
    }
}
