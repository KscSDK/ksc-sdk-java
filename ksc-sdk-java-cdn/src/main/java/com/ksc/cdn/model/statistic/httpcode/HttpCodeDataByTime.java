package com.ksc.cdn.model.statistic.httpcode;

/**
 * HttpCodeDataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class HttpCodeDataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 所选域名详细状态码数据的合并数据，仅当ResultType取值为0是返回此项参数
     */
    private HttpCode[] CodeSum;
    /**
     * 各域名的详细状态码数据，仅当ResultType取值为1是返回此项参数
     */
    private HttpCodeDataByDomain[] Domains;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public HttpCode[] getCodeSum() {
        return CodeSum;
    }

    public void setCodeSum(HttpCode[] codeSum) {
        CodeSum = codeSum;
    }

    public HttpCodeDataByDomain[] getDomains() {
        return Domains;
    }

    public void setDomains(HttpCodeDataByDomain[] domains) {
        Domains = domains;
    }
}
