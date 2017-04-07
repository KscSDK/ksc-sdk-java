package com.ksc.cdn.model.statistic.billing;

import lombok.AllArgsConstructor;

/**
 * Created by JIANGYANG1 on 2017/3/21.
 */
@AllArgsConstructor
public class BillingData {
    /**
     * 区域
     */
    private String Region;
    /**
     * 每个区域的计费数据
     */
    private Long BillingData;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Long getBillingData() {
        return BillingData;
    }

    public void setBillingData(Long billingData) {
        BillingData = billingData;
    }
}
