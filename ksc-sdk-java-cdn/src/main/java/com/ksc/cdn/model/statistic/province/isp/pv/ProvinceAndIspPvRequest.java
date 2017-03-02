package com.ksc.cdn.model.statistic.province.isp.pv;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * ProvinceAndIspHttpCodeRequest
 * 获取域名在中国大陆地区各省份及各运营商的请求数数据，包括边缘请求数， 单位：次
 * 支持按指定的起止时间查询，两者需要同时指定
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔
 * 最多可获取最近一年内31天跨度的数据
 * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度均取该粒度时间段的请求数之和
 * 时效性：5分钟延迟
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class ProvinceAndIspPvRequest extends CommonFieldRequest {
    /**
     * 省份区域名称， 取值详见枚举列表，支持多省份区域查询，多个省份区域用逗号（半角）分隔，缺省为全部省份区域
     * 参考
     *
     * @see com.ksc.cdn.model.enums.AreaEnum
     */
    private String Provinces;
    /**
     * 运营商名称，取值详见枚举列表，支持多运营商查询，多个运营商用逗号（半角）分隔，缺省为全部运营商
     * 参考
     *
     * @see com.ksc.cdn.model.enums.IspEnum
     */
    private String Isps;
    /**
     * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
     *
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    @FieldValidate
    private String ResultType;
    /**
     * 非必须
     * 统计粒度,单位分钟,缺省为5
     * 粒度均取该粒度时间段的峰值
     */
    private String Granularity;

    public String getProvinces() {
        return Provinces;
    }

    public void setProvinces(String provinces) {
        Provinces = provinces;
    }

    public String getIsps() {
        return Isps;
    }

    public void setIsps(String isps) {
        Isps = isps;
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

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);

        Map<String, String> params = super.buildParams();

        if (StringUtils.isNotBlank(Provinces))
            params.put("Provinces", this.getProvinces());
        if (StringUtils.isNotBlank(Isps))
            params.put("Isps", this.getIsps());

        params.put("ResultType", this.getResultType());

        if (StringUtils.isNotBlank(this.getGranularity())) {
            params.put("Granularity", this.getGranularity());
        } else {
            params.put("Granularity", getGranularity(this.getStartTime(), this.getEndTime()));
        }
        return params;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetProvinceAndIspPvData", "2016-09-01", "/2016-09-01/statistics/GetProvinceAndIspPvData");
    }
}
