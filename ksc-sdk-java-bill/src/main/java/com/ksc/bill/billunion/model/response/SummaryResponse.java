package com.ksc.bill.billunion.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author chenhetong
 * @since 2021/7/23
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryResponse <T>{

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("RealTotalCost")
    private String realTotalCost;

    @JsonProperty("RequestId")
    private String requestId;

    @JsonProperty("SummaryOverview")
    private List<T> summaryOverview;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRealTotalCost() {
        return realTotalCost;
    }

    public void setRealTotalCost(String realTotalCost) {
        this.realTotalCost = realTotalCost;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<T> getSummaryOverview() {
        return summaryOverview;
    }

    public void setSummaryOverview(List<T> summaryOverview) {
        this.summaryOverview = summaryOverview;
    }

    @Override
    public String toString() {
        return "SummaryResponse{" +
                "currency='" + currency + '\'' +
                ", realTotalCost='" + realTotalCost + '\'' +
                ", requestId='" + requestId + '\'' +
                ", summaryOverview=" + summaryOverview +
                '}';
    }
}
