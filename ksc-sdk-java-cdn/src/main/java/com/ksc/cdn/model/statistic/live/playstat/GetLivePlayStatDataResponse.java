package com.ksc.cdn.model.statistic.live.playstat;

import java.util.List;

/**
 * GetLivePlayStatDataResponse
 */
public class GetLivePlayStatDataResponse {

    /**
     * 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    private String StartTime;

    /**
     * 域名ID，缺省为当前产品类型下的全部域名，可输入需要查询的域名ID，支持批量域名查询，多个域名ID用逗号（半角）分隔
     */
    private String DomainIds;

    /**
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    private String ResultType;

    /**
     * 计费区域名称
     *
     * @see com.ksc.cdn.model.enums.RegionsEnum
     */
    private String Regions;

    /**
     * Top条数，取值为1-10000，最大10000，默认100
     */
    private String LimitN;

    /**
     * 每个域名粒度的播放统计数据，域名维度
     * */
    private List<PlayStatDataByDomain> Datas;

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

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

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public String getLimitN() {
        return LimitN;
    }

    public void setLimitN(String limitN) {
        LimitN = limitN;
    }

    public List<PlayStatDataByDomain> getDatas() {
        return Datas;
    }

    public void setDatas(List<PlayStatDataByDomain> datas) {
        this.Datas = datas;
    }
}
