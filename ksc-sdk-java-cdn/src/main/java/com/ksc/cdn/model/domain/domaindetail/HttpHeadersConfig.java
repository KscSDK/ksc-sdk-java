package com.ksc.cdn.model.domain.domaindetail;

/**
 * HttpHeadersConfig
 *
 * HTTP头设置
 * 注意:更新加速域名的http头为覆盖更新，需要对全部的规则进行修改，不能仅提交需要修改的部分
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class HttpHeadersConfig {
    private HttpHeaderRule[] HttpHeaderRules;
}
