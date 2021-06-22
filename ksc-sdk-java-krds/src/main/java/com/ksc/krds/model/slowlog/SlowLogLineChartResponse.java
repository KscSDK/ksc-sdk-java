package com.ksc.krds.model.slowlog;

import com.ksc.krds.model.RdsResponse;

public class SlowLogLineChartResponse<T> extends RdsResponse<T> {
    private Long TotalCount;
    private Long QuerySum;

    public Long getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Long totalCount) {
        TotalCount = totalCount;
    }

    public Long getQuerySum() {
        return QuerySum;
    }

    public void setQuerySum(Long querySum) {
        QuerySum = querySum;
    }
}
