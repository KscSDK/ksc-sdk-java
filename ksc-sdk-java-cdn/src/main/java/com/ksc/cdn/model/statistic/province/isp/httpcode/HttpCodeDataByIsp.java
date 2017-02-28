package com.ksc.cdn.model.statistic.province.isp.httpcode;

/**
 * HttpCodeDataByIsp
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class HttpCodeDataByIsp {
    /**
     * 运营商
     */
    private String Isp;
    /**
     * 该域名在该省份区域该运营商的Http状态码详细数据
     */
    private HttpCode[] Codes;

    public String getIsp() {
        return Isp;
    }

    public void setIsp(String isp) {
        Isp = isp;
    }

    public HttpCode[] getCodes() {
        return Codes;
    }

    public void setCodes(HttpCode[] codes) {
        Codes = codes;
    }
}

