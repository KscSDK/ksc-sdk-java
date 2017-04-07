package com.ksc.cdn.model.statistic.bandwidth.peak;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * 获取域名带宽峰值，峰值时间点
 * 1、峰值带宽计算方法：在选定时间段内，取每5分钟有效带宽值进行降序排列，最高带宽就是峰值带宽
 * 2、realtime，峰值时间点，取每5分钟一个时间点，最高峰出现的时间点即为峰值时间
 *
 * @author qichao@kingsoft.com
 * @date 2017/03/29
 */
public class PeakBandwidthDataRequest extends CommonFieldRequest {

    /**
     * 非必须
     * 缺省为CN
     * 计费区域名称
     */
    private String regions;

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {

        CommonValidUtil.check(this);

        Map params = super.buildParams();

        if (StringUtils.isNotBlank(this.getRegions()))
            params.put("Regions", this.getRegions());

        return params;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        GeneralRequestParam param = new GeneralRequestParam("GetPeakBandwidthData",
                "2016-09-01",
                "/2016-09-01/statistics/GetPeakBandwidthData");
        return param;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }
}
