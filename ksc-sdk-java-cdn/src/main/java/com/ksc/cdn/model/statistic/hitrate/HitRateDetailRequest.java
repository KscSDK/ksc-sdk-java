package com.ksc.cdn.model.statistic.hitrate;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * HitRateDetailRequest
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
}
