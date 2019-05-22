package com.ksc.cdn.model.domain.domaindetail;

/**
 * description：
 * author：ZHOURONG
 * date: 2019/5/10
 */
public class ErrorPages {

    /**
     * 配置错误的状态码
     */
    private String ErrorHttpCode;

    /**
     * 自定义发生错误后跳转的页面URL
     */
    private String CustomPageUrl;


    public String getErrorHttpCode() {
        return ErrorHttpCode;
    }

    public void setErrorHttpCode(String errorHttpCode) {
        ErrorHttpCode = errorHttpCode;
    }

    public String getCustomPageUrl() {
        return CustomPageUrl;
    }

    public void setCustomPageUrl(String customPageUrl) {
        CustomPageUrl = customPageUrl;
    }
}
