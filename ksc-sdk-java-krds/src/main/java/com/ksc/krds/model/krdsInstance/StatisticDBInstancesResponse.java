package com.ksc.krds.model.krdsInstance;

import java.util.Map;

public class StatisticDBInstancesResponse {

    private Integer TotalCount;
    private Map<String, Integer> Statistic;

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public Map<String, Integer> getStatistic() {
        return Statistic;
    }

    public void setStatistic(Map<String, Integer> statistic) {
        Statistic = statistic;
    }
}
