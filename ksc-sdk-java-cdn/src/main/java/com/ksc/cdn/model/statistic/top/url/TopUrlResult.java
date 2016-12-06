package com.ksc.cdn.model.statistic.top.url;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * TopUrlResult
 * 获取单个域名或多个域名某天内某一时段的TOP Url访问数据，
 * 仅包含Top200且访问次数大于15次的 Url的访问次数、访问流量，并按次数排序
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class TopUrlResult extends CommonFieldResult {
    /**
     * 热门Url条数，取值为1-200，最大200，默认100
     */
    private String LimitN;
    /**
     * 热门Url列表
     */
    private UrlList[] Datas;

    public String getLimitN() {
        return LimitN;
    }

    public void setLimitN(String limitN) {
        LimitN = limitN;
    }

    public UrlList[] getDatas() {
        return Datas;
    }

    public void setDatas(UrlList[] datas) {
        Datas = datas;
    }
}
