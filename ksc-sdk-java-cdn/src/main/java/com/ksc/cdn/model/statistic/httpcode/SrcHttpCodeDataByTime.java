package com.ksc.cdn.model.statistic.httpcode;

/**
 * SrcHttpCodeDataByTime
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class SrcHttpCodeDataByTime {

    /**
     * 时间点
     */
    private String Time;

    /**
     * 所选域名详细状态码数据的合并数据，仅当ResultType取值为0是返回此项参数
     */
    private SrcHttpCode[] SrcCodeSum;

    /**
     * 各域名的详细状态码数据， 仅当ResultType取值为1是返回此项参数
     */
    private SrcHttpCodeDataByDomain[] Domains;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public SrcHttpCode[] getSrcCodeSum() {
        return SrcCodeSum;
    }

    public void setSrcCodeSum(SrcHttpCode[] srcCodeSum) {
        SrcCodeSum = srcCodeSum;
    }

    public SrcHttpCodeDataByDomain[] getDomains() {
        return Domains;
    }

    public void setDomains(SrcHttpCodeDataByDomain[] domains) {
        Domains = domains;
    }
}
