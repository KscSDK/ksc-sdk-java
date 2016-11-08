package com.ksc.cdn;

import com.ksc.cdn.model.statistic.BpsResult;
import com.ksc.cdn.model.statistic.FlowResult;
import com.ksc.cdn.model.statistic.StatisticsQuery;

/**
 * Created by murongyifei on 03/11/2016.
 */
public interface KscCdnStatistics {
    /**
     * 带宽查询
     */
    String BANDWIDTH_URL = "/2016-09-01/statistics/GetBandwidthData";
    String BANDWIDTH_VERSION = "2016-09-01";
    String BANDWIDTH_ACTION = "GetBandwidthData";

    /**
     * 流量查询
     */
    String FLOW_URL = "/2016-09-01/statistics/GetFlowData";
    String FLOW_VERSION = "2016-09-01";
    String FLOW_ACTION = "GetFlowData";

    /**
     * 查询带宽
     * @param statisticsQuery
     * @return
     * @throws Exception
     */
    BpsResult getBandwidthData(StatisticsQuery statisticsQuery) throws Exception;

    /**
     * 查询流量
     * @param statisticsQuery
     * @return
     * @throws Exception
     */
    FlowResult getFlowDataByApi(StatisticsQuery statisticsQuery) throws Exception;

}
