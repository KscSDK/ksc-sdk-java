package com.ksc.cdn.model.statistic.httpcode;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * HttpCodeDetailResult
 *
 *获取域名的Http状态码详细访问次数及占比数据
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class HttpCodeDetailResult extends CommonFieldResult{

    /**
     * 取值为0：多域名多区域数据做合并返回；1：每个域名每个区域的数据分别返回。
     */
    private String ResultType;
    /**
     * 统计粒度，取值为 5：5分钟粒度；
     * 10：10分钟粒度；
     * 20：20分钟粒度；
     * 60：1小时粒度；
     * 240：4小时粒度；
     * 480：8小时粒度；
     * 1440：1天粒度；
     * 以上粒度的带宽值均取该粒度时间段的峰值
     */
    private String Granularity;

    /**
     * 每个时间粒度的各种Http状态码数据及占比
     */
    private HttpCodeDataByTime[] Datas;

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String resultType) {
        ResultType = resultType;
    }

    public String getGranularity() {
        return Granularity;
    }

    public void setGranularity(String granularity) {
        Granularity = granularity;
    }

    public HttpCodeDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(HttpCodeDataByTime[] datas) {
        Datas = datas;
    }
}
