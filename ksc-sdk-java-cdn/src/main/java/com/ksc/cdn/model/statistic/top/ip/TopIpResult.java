package com.ksc.cdn.model.statistic.top.ip;

/**
 * Created by qichao on 2017/2/27.
 */

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * 获取域名某天内某一时段的TOP IP访问数据，仅包含Top 200且访问次数大于15次的独立请求的IP的访问次数、访问流量，并按次数排序
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class TopIpResult extends CommonFieldResult {

    /**
     * 独立请求的IP数，取值为1-200，最大200，默认100
     */
    private String LimitN;

    /**
     * 独立请求的IP列表
     */
    private IpList[] Datas;

    public String getLimitN() {
        return LimitN;
    }

    public void setLimitN(String limitN) {
        LimitN = limitN;
    }

    public IpList[] getDatas() {
        return Datas;
    }

    public void setDatas(IpList[] datas) {
        Datas = datas;
    }
}
