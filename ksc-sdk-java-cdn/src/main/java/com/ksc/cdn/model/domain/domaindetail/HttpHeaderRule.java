package com.ksc.cdn.model.domain.domaindetail;

/**
 * HttpHeaderRules
 *
 * http头规则类型
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class HttpHeaderRule{
    /**
     * http头规则类型
     * 取值
     * @see com.ksc.cdn.model.enums.HttpHeaderRuleEnum
     */
    private String HttpHeaderRuleType;
    /**
     * 要设置HTTP头参数：
     * 取值：content-type
     * cache-control
     * content-disposition
     * content-language
     * expires
     * access-control-allow-origin
     * access-control-allow-methods
     * access-control-max-age。
     * 支持自定义HTTP头参数，当需要自定义HTTP头时，取值为自定义的HTTP头参数
     */
    private String HeaderKey;
    /**
     * 要设置的HTTP头参数的取值，
     * 当为标准头时，需判断对应HTTP头取值正确性，当为自定义头时，仅判断对应HTTP头的输入合法性
     */
    private String HeaderValue;

    public String getHttpHeaderRuleType() {
        return HttpHeaderRuleType;
    }

    public void setHttpHeaderRuleType(String httpHeaderRuleType) {
        HttpHeaderRuleType = httpHeaderRuleType;
    }

    public String getHeaderKey() {
        return HeaderKey;
    }

    public void setHeaderKey(String headerKey) {
        HeaderKey = headerKey;
    }

    public String getHeaderValue() {
        return HeaderValue;
    }

    public void setHeaderValue(String headerValue) {
        HeaderValue = headerValue;
    }
}
