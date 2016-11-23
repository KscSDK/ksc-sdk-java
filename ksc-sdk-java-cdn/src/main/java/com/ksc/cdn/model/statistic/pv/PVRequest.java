package com.ksc.cdn.model.statistic.pv;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.statistic.GeneralRequestParam;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * PVRequest
 * <p>
 * 获取域名请求数数据，包括边缘请求数、回源请求数， 单位：次<p>
 * 支持按指定的起止时间查询，两者需要同时指定<p>
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
 * 支持多区域查询，多个区域用逗号（半角）分隔<p>
 * 最多可获取最近三年内93天跨度的数据<p>
 * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度均取该粒度时间段的请求数之和<p>
 *
 * 说明：<p>
 * 请求数 ：统计当前域名下资源文件的访问次数<p>
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class PVRequest extends CommonFieldRequest {
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
    public Map<String, String> buildParams() throws KscClientException,ParseException {
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

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetPvData","2016-09-01","/2016-09-01/statistics/GetPvData");
    }
}
