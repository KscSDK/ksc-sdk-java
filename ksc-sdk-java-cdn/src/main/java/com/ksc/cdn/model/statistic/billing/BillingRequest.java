package com.ksc.cdn.model.statistic.billing;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * Created by JIANGYANG1 on 2017/3/21.
 */
public class BillingRequest extends CommonFieldRequest {
    /**
     * 区域名称， 取值为CN:中国大陆，HK：香港，TW：台湾，AS：亚洲其他，NA：北美洲，SA：南美洲，EU：欧洲，AU：大洋洲，AF：非洲，支持多区域查询，多个区域用逗号（半角）分隔，每个区域的值单独返回，缺省为 CN
     */
    private String regions;
    /**
     * 计费方式， 取值为 peakbw:峰值计费;peak95bw:95峰值计费;averagebw：日峰值平均值计费；monthflow：流量按月，只允许输入一种计费方式，缺省为 peakbw ；
     */
    private String billingMode;

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {

        CommonValidUtil.check(this);

        Map params = super.buildParams();

        if (StringUtils.isNotBlank(this.getRegions())) {
            params.put("Regions", this.getRegions());
        }
        if (StringUtils.isNotBlank(this.getBillingMode())) {
            params.put("BillingMode", this.getBillingMode());
        }
        return params;
    }


    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetBillingData", "2016-09-01", "/2016-09-01/statistics/GetBillingData");
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }
}
