package com.ksc.krds.model.audit;

import java.util.List;

public class ListAuditDetailExportTaskResponse {


    public List<String> getTaskResps() {
        return taskResps;
    }

    public void setTaskResps(List<String> taskResps) {
        this.taskResps = taskResps;
    }

    private List<String> taskResps;
    private Integer totalCount;
   /* private String RequestId;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }*/

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}
