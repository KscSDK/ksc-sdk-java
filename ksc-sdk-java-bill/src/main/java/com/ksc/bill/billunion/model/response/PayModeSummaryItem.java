package com.ksc.bill.billunion.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author chenhetong
 * @since 2021/7/23
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayModeSummaryItem {

    @JsonProperty("PayMode")
    private String payMode;

    @JsonProperty("RealTotalCost")
    private String realTotalCost;

    @JsonProperty("BillMonth")
    private String billMonth;

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getRealTotalCost() {
        return realTotalCost;
    }

    public void setRealTotalCost(String realTotalCost) {
        this.realTotalCost = realTotalCost;
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
    }

    @Override
    public String toString() {
        return "PayModeSummaryItem{" +
                "payMode='" + payMode + '\'' +
                ", realTotalCost='" + realTotalCost + '\'' +
                ", billMonth='" + billMonth + '\'' +
                '}';
    }
}
