package com.ksc.cdn.model.statistic.hitrate;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * HitRateDetailRequest
 * <p>
 * 获取域名流量命中率、请求数命中率数据，单位：百分比<p>
 * 支持按指定的起止时间查询，两者需要同时指定<p>
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
 * 最多可获取最近三年内93天跨度的数据<p>
 * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；<p>
 * 时效性：5分钟延迟<p>
 *
 * 说明:<p>
 * 请求数命中率=[1-回源请求数\/边缘请求数]*100%<p>
 * 流量命中率=[1-回源流量\/边缘流量]*100%<p>
 * 当边缘请求数或边缘流量为0时，命中率为0<p>
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class HitRateDetailRequest extends CommonFieldRequest {

    /**
            * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
     */
    @FieldValidate
    private String resultType;

    /**
            * 非必须
     * 统计粒度,单位分钟,缺省为5
     * 粒度均取该粒度时间段的峰值
     */
    private String granularity;

    /**
     * 命中率类型
     * 数据类型， 取值为flowhitrate:流量命中率;reqhitrate:请求数命中率;
     * 支持多类型选择，多个类型用逗号（半角）分隔，缺省为reqhitrate
     */
    private String hitType;

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public String getHitType() {
        return hitType;
    }

    public void setHitType(String hitType) {
        this.hitType = hitType;
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException,ParseException {
        CommonValidUtil.check(this);

        Map params = super.buildParams();

        if (StringUtils.isNotBlank(this.getResultType()))
            params.put("ResultType", this.getResultType());

        if (StringUtils.isNotBlank(this.getGranularity())) {
            params.put("Granularity", this.getGranularity());
        }else {
            params.put("Granularity",getGranularity(this.getStartTime(),this.getEndTime()));
        }

        if (StringUtils.isNotBlank(this.getHitType()))
            params.put("HitType", this.getHitType());

        return params;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetHitRateDetailedData","2016-09-01","/2016-09-01/statistics/GetHitRateDetailedData");
    }
}
