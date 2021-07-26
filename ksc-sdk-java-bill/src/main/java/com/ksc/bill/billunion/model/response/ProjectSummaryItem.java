package com.ksc.bill.billunion.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author chenhetong
 * @since 2021/7/23
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectSummaryItem {

    @JsonProperty("ProjectId")
    private String projectId;

    @JsonProperty("ProjectName")
    private String projectName;

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "ProjectSummaryItem{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", realTotalCost='" + realTotalCost + '\'' +
                ", billMonth='" + billMonth + '\'' +
                '}';
    }
}
