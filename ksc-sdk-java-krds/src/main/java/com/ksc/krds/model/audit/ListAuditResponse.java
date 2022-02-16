package com.ksc.krds.model.audit;

import java.util.ArrayList;
import java.util.List;

public class ListAuditResponse {
    private List<AuditDataBean> AuditRows = new ArrayList<AuditDataBean>();
    private Long TotalCount;
    private Long Marker;

    public List<AuditDataBean> getAuditRows() {
        return AuditRows;
    }

    public void setAuditRows(List<AuditDataBean> auditRows) {
        AuditRows = auditRows;
    }

    public Long getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Long totalCount) {
        TotalCount = totalCount;
    }

    public Long getMarker() {
        return Marker;
    }

    public void setMarker(Long marker) {
        Marker = marker;
    }
}
