package com.ksc.cdn.model.statistic.bandwidth;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * BpsRequest
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class BpsRequest extends CommonFieldRequest {
    /**
     * 非必须
     * 缺省为CN
     * 计费区域名称
     */
    private String regions;

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
     * 非必须
     * 数据类型,edge边缘数据origin回源数据
     * 缺省为edge
     */
    private String dataType;

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);

        Map params = super.buildParams();

        if (StringUtils.isNotBlank(this.getRegions()))
            params.put("Regions", this.getRegions());

        if (StringUtils.isNotBlank(this.getResultType()))
            params.put("ResultType", this.getResultType());

        if (StringUtils.isNotBlank(this.getGranularity())) {
            params.put("Granularity", this.getGranularity());
        }else {
            params.put("Granularity",getGranularity(this.getStartTime(),this.getEndTime()));
        }

        if (StringUtils.isNotBlank(this.getDataType()))
            params.put("DataType", this.getDataType());

        return params;
    }
}
