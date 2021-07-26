package com.ksc.bill.billunion.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author chenhetong
 * @since 2021/7/23
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstanceSummaryResponse {

    @JsonProperty("CustomerId")
    private String customerId;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("PageNum")
    private Integer pageNum;
    @JsonProperty("PageSize")
    private Integer pageSize;
    @JsonProperty("TotalCount")
    private Integer totalCount;
    @JsonProperty("RequestId")
    private String requestId;
    @JsonProperty("SummaryOverview")
    private List<InstanceSummaryItem> summaryOverview;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InstanceSummaryItem> getSummaryOverview() {
        return summaryOverview;
    }

    public void setSummaryOverview(List<InstanceSummaryItem> summaryOverview) {
        this.summaryOverview = summaryOverview;
    }

    @Override
    public String toString() {
        return "InstanceSummaryResponse{" +
                "customerId='" + customerId + '\'' +
                ", email='" + email + '\'' +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", requestId='" + requestId + '\'' +
                ", summaryOverview=" + summaryOverview +
                '}';
    }
}
