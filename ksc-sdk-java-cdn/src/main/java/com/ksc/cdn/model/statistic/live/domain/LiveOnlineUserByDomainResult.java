package com.ksc.cdn.model.statistic.live.domain;

import com.ksc.cdn.model.statistic.live.LiveCommonFieldResult;

/**
 * LiveOnlineUserByDomainResult
 *
 * 获取按域名维度的直播在线人数数据， 单位：每分钟的在线人数
 * @author jiangran@kingsoft.com
 * @date 2016/11/21
 */
public class LiveOnlineUserByDomainResult extends LiveCommonFieldResult {
    /**
     * 域名ID，缺省为当前产品类型下的全部域名，可输入需要查询的域名ID，支持批量域名查询，多个域名ID用逗号（半角）分隔
     */
    private String DomainIds;
    /**
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    private String ResultType;
    /**
     * 统计粒度，取值为 1（默认）：1分钟粒度；5：5分钟粒度；10：10分钟粒度；20：20分钟粒度；60：1小时力度；240：4小时粒度；480：8小时粒度；1440：1天粒度；以上粒度均取该粒度时间段的在线人数峰值
     */
    private String Granularity;
    /**
     * 每个时间粒度的在线人数数据
     */
    private OnlineUserDataByTime[] Datas;

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
    }

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

    public OnlineUserDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(OnlineUserDataByTime[] datas) {
        Datas = datas;
    }
}
