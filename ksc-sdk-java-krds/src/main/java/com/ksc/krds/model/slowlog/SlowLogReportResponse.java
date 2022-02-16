package com.ksc.krds.model.slowlog;

import com.ksc.krds.model.RdsResponse;

public class SlowLogReportResponse<T> extends RdsResponse<T> {

    private Integer TotalCount;
    private Integer Marker;

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public Integer getMarker() {
        return Marker;
    }

    public void setMarker(Integer marker) {
        Marker = marker;
    }
}
