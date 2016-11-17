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
     * 每个时间粒度的各种Http状态码数据及占比
     */
    private HttpCodeDataByTime[] Datas;

    public HttpCodeDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(HttpCodeDataByTime[] datas) {
        Datas = datas;
    }
}
