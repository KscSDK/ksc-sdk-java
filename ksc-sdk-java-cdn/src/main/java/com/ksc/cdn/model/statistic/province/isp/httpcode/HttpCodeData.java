package com.ksc.cdn.model.statistic.province.isp.httpcode;

/**
 * HttpCodeData
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class HttpCodeData {

    /**
     * 各类Http状态码，取值为：2xx，3xx，4xx，5xx
     */
    private String CodeType;

    /**
     * 本类状态码占比全部状态码的比例，如2XX占全部状态码访问次数的百分比
     */
    private Double Proportion;

    /**
     * 本类状态码访问次数，如2XX访问次数为200、206等状态码访问次数之和
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
