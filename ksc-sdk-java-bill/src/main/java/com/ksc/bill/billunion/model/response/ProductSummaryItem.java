package com.ksc.bill.billunion.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author chenhetong
 * @since 2021/7/23
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSummaryItem {

    @JsonProperty("ProductCode")
    private String productCode;

    @JsonProperty("ProductName")
    private String productName;

    @JsonProperty("RealTotalCost")
    private String realTotalCost;

    @JsonProperty("BillMonth")
    private String billMonth;

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductSummaryItem{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", realTotalCost='" + realTotalCost + '\'' +
                ", billMonth='" + billMonth + '\'' +
                '}';
    }
}
