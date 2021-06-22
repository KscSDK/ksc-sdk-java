package com.ksc.krds.model.slowlog;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.audit.ExportTaskResp;

import java.util.List;

public class ExportListResponse extends RdsResponse {
    private List<ExportTaskResp> taskResps;
    private Integer totalCount;

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
}
