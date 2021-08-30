package com.ksc.bill.billunion.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author chenhetong
 * @since 2021/7/23
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstanceSummaryItem {
    @JsonProperty("BillsNo")
    private String billsNo;
    @JsonProperty("CustomerBillMonth")
    private String customerBillMonth;
    @JsonProperty("BillMonth")
    private String billMonth;
    @JsonProperty("ProductName")
    private String productName;
    @JsonProperty("ProductSubTyeName")
    private String productSubTypeName;
    @JsonProperty("InstanceId")
    private String instanceId;
    @JsonProperty("InstanceName")
    private String instanceName;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("DetailBillStartTime")
    private String detailBillStartTime;
    @JsonProperty("DetailBillEndTime")
    private String detailBillEndTime;
    @JsonProperty("ServiceBillStartTime")
    private String serviceBillStartTime;
    @JsonProperty("PayMode")
    private String payMode;
    @JsonProperty("BillTypeName")
    private String billTypeName;
    @JsonProperty("RegionCode")
    private String regionCode;
    @JsonProperty("RegionName")
    private String regionName;
    @JsonProperty("ZoneCode")
    private String zoneCode;
    @JsonProperty("ZoneName")
    private String zoneName;
    @JsonProperty("BillDetailTypeName")
    private String billDetailTypeName;
    @JsonProperty("ProjectName")
    private String projectName;
    @JsonProperty("Duration")
    private String duration;
    @JsonProperty("Remark")
    private String remark;
    @JsonProperty("Cost")
    private String cost;
    @JsonProperty("RealCost")
    private String realCost;
    @JsonProperty("ConfigSet")
    private List<DetailItem> configSet;
    @JsonProperty("ProviderSet")
    private List<DetailItem> providerSet;
    @JsonProperty("ConsumeResources")
    private List<KvPair> consumeResources;
    @JsonProperty("ExtraSet")
    private List<KvPair> extraSet;
    @JsonProperty("TagSet")
    private List<KvPair> tagSet;

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public String getBillDetailTypeName() {
        return billDetailTypeName;
    }

    public void setBillDetailTypeName(String billDetailTypeName) {
        this.billDetailTypeName = billDetailTypeName;
    }

    public String getBillsNo() {
        return billsNo;
    }

    public void setBillsNo(String billsNo) {
        this.billsNo = billsNo;
    }

    public String getCustomerBillMonth() {
        return customerBillMonth;
    }

    public void setCustomerBillMonth(String customerBillMonth) {
        this.customerBillMonth = customerBillMonth;
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSubTypeName() {
        return productSubTypeName;
    }

    public void setProductSubTypeName(String productSubTypeName) {
        this.productSubTypeName = productSubTypeName;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDetailBillStartTime() {
        return detailBillStartTime;
    }

    public void setDetailBillStartTime(String detailBillStartTime) {
        this.detailBillStartTime = detailBillStartTime;
    }

    public String getDetailBillEndTime() {
        return detailBillEndTime;
    }

    public void setDetailBillEndTime(String detailBillEndTime) {
        this.detailBillEndTime = detailBillEndTime;
    }

    public String getServiceBillStartTime() {
        return serviceBillStartTime;
    }

    public void setServiceBillStartTime(String serviceBillStartTime) {
        this.serviceBillStartTime = serviceBillStartTime;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getBillTypeName() {
        return billTypeName;
    }

    public void setBillTypeName(String billTypeName) {
        this.billTypeName = billTypeName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getRealCost() {
        return realCost;
    }

    public void setRealCost(String realCost) {
        this.realCost = realCost;
    }

    public List<DetailItem> getConfigSet() {
        return configSet;
    }

    public void setConfigSet(List<DetailItem> configSet) {
        this.configSet = configSet;
    }

    public List<DetailItem> getProviderSet() {
        return providerSet;
    }

    public void setProviderSet(List<DetailItem> providerSet) {
        this.providerSet = providerSet;
    }

    public List<KvPair> getConsumeResources() {
        return consumeResources;
    }

    public void setConsumeResources(List<KvPair> consumeResources) {
        this.consumeResources = consumeResources;
    }

    public List<KvPair> getExtraSet() {
        return extraSet;
    }

    public void setExtraSet(List<KvPair> extraSet) {
        this.extraSet = extraSet;
    }

    public List<KvPair> getTagSet() {
        return tagSet;
    }

    public void setTagSet(List<KvPair> tagSet) {
        this.tagSet = tagSet;
    }

    @Override
    public String toString() {
        return "InstanceSummaryItem{" +
                "billsNo='" + billsNo + '\'' +
                ", customerBillMonth='" + customerBillMonth + '\'' +
                ", billMonth='" + billMonth + '\'' +
                ", productName='" + productName + '\'' +
                ", productSubTypeName='" + productSubTypeName + '\'' +
                ", instanceId='" + instanceId + '\'' +
                ", instanceName='" + instanceName + '\'' +
                ", currency='" + currency + '\'' +
                ", detailBillStartTime='" + detailBillStartTime + '\'' +
                ", detailBillEndTime='" + detailBillEndTime + '\'' +
                ", serviceBillStartTime='" + serviceBillStartTime + '\'' +
                ", payMode='" + payMode + '\'' +
                ", billTypeName='" + billTypeName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", zoneName='" + zoneName + '\'' +
                ", projectName='" + projectName + '\'' +
                ", duration='" + duration + '\'' +
                ", remark='" + remark + '\'' +
                ", cost='" + cost + '\'' +
                ", realCost='" + realCost + '\'' +
                ", configSet=" + configSet +
                ", providerSet=" + providerSet +
                ", consumeResources=" + consumeResources +
                ", extraSet=" + extraSet +
                ", tagSet=" + tagSet +
                '}';
    }
}
