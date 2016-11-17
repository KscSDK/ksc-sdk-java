package com.ksc.cdn.model.statistic.province.isp;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * ProvinceAndIspRequest
 *
 * 获取域名在中国大陆地区各省市及各运营商的带宽、流量数据，仅包括边缘节点数据
 * 使用场景
 * 客户查询单个域名或多个域名在各个省份及运营商的合并后的实时流量数据
 * 客户查询单个域名的详细流量数据，进行数据保存及数据分析
 * 客户查询某一天或某1小时的详细流量区域分布，用于制作流量数据区域用量表
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class ProvinceAndIspRequest extends CommonFieldRequest {
    /**
     * 省份区域名称， 取值详见枚举列表，支持多省份区域查询，多个省份区域用逗号（半角）分隔，缺省为全部省份区域
     * 参考
     * @see com.ksc.cdn.model.enums.AreaEnum
     */
    private String Provinces;
    /**
     * 运营商名称，取值详见枚举列表，支持多运营商查询，多个运营商用逗号（半角）分隔，缺省为全部运营商
     * 参考
     * @see com.ksc.cdn.model.enums.IspEnum
     */
    private String Isps;
    /**
     * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
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
    public Map<String, String> buildParams() throws KscClientException {
        CommonValidUtil.check(this);

        Map<String, String> params = super.buildParams();

        if(StringUtils.isNotBlank(Provinces))
            params.put("Provinces",this.getProvinces());
        if(StringUtils.isNotBlank(Isps))
            params.put("Isps",this.getIsps());

        params.put("ResultType",this.getResultType());

        if(Granularity!=null)
            params.put("Granularity",this.getGranularity());

        return params;
    }
}
