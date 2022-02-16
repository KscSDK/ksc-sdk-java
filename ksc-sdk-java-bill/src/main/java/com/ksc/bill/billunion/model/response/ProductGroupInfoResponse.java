package com.ksc.bill.billunion.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author chenhetong
 * @since 2021/7/23
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductGroupInfoResponse {
    @JsonProperty("RequestId")
    private String requestId;
    @JsonProperty("ProductGroupSet")
    private List<KvPair> productGroupSet;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<KvPair> getProductGroupSet() {
        return productGroupSet;
    }

    public void setProductGroupSet(List<KvPair> productGroupSet) {
        this.productGroupSet = productGroupSet;
    }

    @Override
    public String toString() {
        return "ProductGroupInfoResponse{" +
                "requestId='" + requestId + '\'' +
                ", productGroupSet=" + productGroupSet +
                '}';
    }
}
