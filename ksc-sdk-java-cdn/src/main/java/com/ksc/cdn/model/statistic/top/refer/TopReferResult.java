package com.ksc.cdn.model.statistic.top.refer;

/**
 * Created by qichao on 2017/2/27.
 */

import com.ksc.cdn.model.statistic.CommonFieldResult;
import lombok.ToString;

/**
 * TopReferResult
 * 获取域名某天内某一时段的热门页面访问数据排名，
 * 仅包含Top200且访问数大于15次的热门页面的访问次数、访问流量量，并按次数排序
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@ToString
public class TopReferResult extends CommonFieldResult {

    /**
     * 热门Refer条数，取值为1-200，最大200，默认100
     */
    private String LimitN;

    /**
     * 热门Refer列表
     */
    private ReferList[] Datas;

    public String getLimitN() {
        return LimitN;
    }

    public void setLimitN(String limitN) {
        LimitN = limitN;
    }

    public ReferList[] getDatas() {
        return Datas;
    }

    public void setDatas(ReferList[] datas) {
        Datas = datas;
    }
}
