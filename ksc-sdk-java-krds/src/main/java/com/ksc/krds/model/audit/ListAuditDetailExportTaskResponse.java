package com.ksc.krds.model.audit;

import java.util.List;

public class ListAuditDetailExportTaskResponse {

    private List<ExportTaskResp> taskResps;
    private Integer totalCount;

    private String RequestId;

    public List<ExportTaskResp> getTaskResps() {
        return taskResps;
    }

    public void setTaskResps(List<ExportTaskResp> taskResps) {
        this.taskResps = taskResps;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }
}
