package com.ksc.cdn.model.statistic.httpcode;

/**
 * SrcHttpCode
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class SrcHttpCode {

    /**
     * 各种回源Http状态码，如：200，206，302，403,504
     */
    private String SrcCode;

    /**
     * 各种状态码访问占比，如：200占2XX的百分比
     */
    private Double Proportion;

    /**
     * 本状态码的的访问次数
     */
    private Long Pv;

    public String getSrcCode() {
        return SrcCode;
    }

    public void setSrcCode(String srcCode) {
        SrcCode = srcCode;
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
}
