package com.ksc.cdn.model.statistic.httpcode;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * HttpCodeResult
 * 获取域名一段时间内的Http状态码访问次数及占比数据
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class HttpCodeResult extends CommonFieldResult {
    /**
     * 所选时间段内的各种Http状态码求和数据、各种状态码及占比
     */
    private HttpCodeData[] Datas;

    public HttpCodeData[] getDatas() {
        return Datas;
    }

    public void setDatas(HttpCodeData[] datas) {
        Datas = datas;
    }
}
