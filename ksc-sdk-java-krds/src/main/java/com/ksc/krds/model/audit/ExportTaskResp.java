package com.ksc.krds.model.audit;

import java.util.List;

public class ExportTaskResp {

    private String startTime;

    private String endTime;

    private Integer status;

    private Long createTime;

    private Long recordNumber;

    private List<String> s3FileNames;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(Long recordNumber) {
        this.recordNumber = recordNumber;
    }

    public List<String> getS3FileNames() {
        return s3FileNames;
    }

    public void setS3FileNames(List<String> s3FileNames) {
        this.s3FileNames = s3FileNames;
    }
}
