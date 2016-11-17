package com.ksc.cdn.model.statistic;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CrazyHorse on 8/23/16.
 * 标准统计分析查询类
 * 支持按指定的起止时间查询，两者需要同时指定
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔
 * 最多可获取最近三年内93天跨度的数据
 * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；**以上粒度均取该粒度时间段的流量之和**
 * 时效性：5分钟延迟
 */
public class CommonFieldRequest {

    /**
     * 获取数据起始时间点
     * 格式UTC时间：YYYY-MM-DD Thh:mmZ
     */
    @FieldValidate
    private String StartTime;

    /**
     * 获取数据结束时间点,结束时间应大于起始时间
     * 格式UTC时间：YYYY-MM-DD Thh:mmZ
     */
    @FieldValidate
    private String EndTime;

    /**
     * 产品类型只允许输入一种,下载download,直播live
     * @see com.ksc.cdn.model.enums.CdnTypeEnum
     */
    @FieldValidate
    private String CdnType;

    /**
     * 非必须
     * 缺省为当前产品类型下的全部域名
     */
    private String DomainIds;


    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getCdnType() {
        return CdnType;
    }

    public void setCdnType(String cdnType) {
        CdnType = cdnType;
    }

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
    }

    public Map<String,String> buildParams() throws KscClientException {
        Map<String,String> params=new HashMap<String, String>();
        params.put("CdnType", this.getCdnType());
        params.put("StartTime", this.getStartTime());
        params.put("EndTime", this.getEndTime());
        if (StringUtils.isNotBlank(this.getDomainIds()))
            params.put("DomainIds", this.getDomainIds());

        return params;
    }


}
