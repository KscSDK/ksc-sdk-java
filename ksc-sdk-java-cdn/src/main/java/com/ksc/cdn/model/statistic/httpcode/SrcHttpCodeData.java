package com.ksc.cdn.model.statistic.httpcode;

/**
 * SrcHttpCodeData
 * 获取域名一段时间内的回源Http状态码访问次数及占比数据
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class SrcHttpCodeData {

    /**
     * 各类Http状态码，取值为：2xx，3xx，4xx，5xx
     */
    private String SrcCodeType;

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
    private SrcHttpCode[] SrcCodes;

    public String getSrcCodeType() {
        return SrcCodeType;
    }

    public void setSrcCodeType(String srcCodeType) {
        SrcCodeType = srcCodeType;
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

    public SrcHttpCode[] getSrcCodes() {
        return SrcCodes;
    }

    public void setSrcCodes(SrcHttpCode[] srcCodes) {
        SrcCodes = srcCodes;
    }
}
