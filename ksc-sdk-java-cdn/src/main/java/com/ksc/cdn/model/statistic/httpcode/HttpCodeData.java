package com.ksc.cdn.model.statistic.httpcode;

/**
 * HttpCodeData
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class HttpCodeData {
    /**
     * 各类Http状态码，取值为：2XX，3XX，4XX，5XX
     */
    private String CodeType;
    /**
     * 各种状态码访问占比，如：200占2XX的百分比
     */
    private Double Proportion;
    /**
     * 本状态码的的访问次数
     */
    private Long Pv;
    /**
     * 本类状态码下，各种详细状态码数据
     */
    private HttpCode[] Codes;

    public String getCodeType() {
        return CodeType;
    }

    public void setCodeType(String codeType) {
        CodeType = codeType;
    }

    public Double getProportion() {
        return Proportion;
    }

    public void setProportion(Double proportion) {
        Proportion = proportion;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }

    public HttpCode[] getCodes() {
        return Codes;
    }

    public void setCodes(HttpCode[] codes) {
        Codes = codes;
    }
}
