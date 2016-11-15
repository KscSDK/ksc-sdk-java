package com.ksc.cdn;

import com.ksc.cdn.model.statistic.*;
import com.ksc.cdn.model.statistic.bandwidth.BpsResult;
import com.ksc.cdn.model.statistic.flow.FlowResult;
import com.ksc.cdn.model.statistic.hitrate.HitRateDetailResult;
import com.ksc.cdn.model.statistic.hitrate.HitRateRequest;
import com.ksc.cdn.model.statistic.hitrate.HitRateResult;
import com.ksc.cdn.model.statistic.pv.PVResult;

/**
 * KscCdnStatistics
 * 统计相关接口
 * Created by jiangran@kingsoft.com on 03/11/2016.
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
     * pv查询
     */
    String PV_URL = "/2016-09-01/statistics/GetPvData";
    String PV_VERSION = "2016-09-01";
    String PV_ACTION = "GetPvData";

    /**
     * 命中率查询
     */
    String HITRATE_URL = "/2016-09-01/statistics/GetHitRateData";
    String HITRATE_VERSION = "2016-09-01";
    String HITRATE_ACTION = "GetHitRateData";
    /**
     * 命中率详情查询
     */
    String HITRATE_DETAIL_URL = "/2016-09-01/statistics/GetHitRateDetailedData";
    String HITRATE_DETAIL_VERSION = "2016-09-01";
    String HITRATE_DETAIL_ACTION = "GetHitRateDetailedData";
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

    /**
     * 命中率查询
     * @param hitRateRequest
     * @return
     * @throws Exception
     */
    HitRateResult getHitRate(HitRateRequest hitRateRequest) throws Exception;

    /**
     * 命中率详情查询
     * @param statisticsQuery
     * @return
     * @throws Exception
     */
    HitRateDetailResult getHitRateDetail(StatisticsQuery statisticsQuery) throws Exception;

    /**
     * 请求数查询
     * @param statisticsQuery
     * @return
     * @throws Exception
     */
    PVResult getPV(StatisticsQuery statisticsQuery) throws Exception;
}
