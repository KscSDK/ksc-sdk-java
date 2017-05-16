package com.ksc.cdn.model.statistic.billing;

/**
 * Created by JIANGYANG1 on 2017/3/21.
 */
public class BillingModeWebResponse {
    private String BillingMode;
    private String Describe;

    public String getBillingMode() {
        return BillingMode;
    }

    public void setBillingMode(String billingMode) {
        BillingMode = billingMode;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }
}
