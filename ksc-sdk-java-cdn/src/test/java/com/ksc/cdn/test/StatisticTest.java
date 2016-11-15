package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnStatistics;
import com.ksc.cdn.model.enums.*;
import com.ksc.cdn.model.statistic.*;
import com.ksc.cdn.model.statistic.bandwidth.BpsResult;
import com.ksc.cdn.model.statistic.flow.FlowResult;
import com.ksc.cdn.model.statistic.hitrate.HitRateDetailResult;
import com.ksc.cdn.model.statistic.hitrate.HitRateRequest;
import com.ksc.cdn.model.statistic.hitrate.HitRateResult;
import com.ksc.cdn.model.statistic.pv.PVResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * StatisticTest
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class StatisticTest {
    KscCdnStatistics cdnClient;

    @Before
    public void setup(){
        cdnClient=new KscCdnClient("AKTPhQTez3knSli_7pM7sCqavg",
                "OB+w9v3uUERPoLmzNocPz7hLgNqqlYWCKQ97LpTYvyTDkwVvhwe0slOVmLYbwdNAsQ==",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-1",
                "cdn");
    }

    /**
     * 带宽查询
     * @throws Exception
     */
    @Test
    public void testGetBandwidthData() throws Exception{
        StatisticsQuery statisticsQuery=new StatisticsQuery();
        statisticsQuery.setStartTime("2016-09-19T08:00+0800");//查询开始时间
        statisticsQuery.setEndTime("2016-09-20T08:00+0800");//查询结束时间
        statisticsQuery.setCdnType(CdnTypeEnum.download.getValue());//加速类型
        statisticsQuery.setResultType(ResultTypeEnum.MERGE.getCode());//带宽数据返回类型
        statisticsQuery.setRegions(RegionsEnum.CN.getValue());//查询区域
        statisticsQuery.setDataType(DataTypeEnum.EDGE.getValue());//数据类型,边缘或者回源

        BpsResult bandwidthData = cdnClient.getBandwidthData(statisticsQuery);
        Assert.assertNotNull(bandwidthData.getDatas());
    }

    /**
     * 流量查询
     * @throws Exception
     */
    @Test
    public void testGetFlowDataByApi() throws Exception{
        StatisticsQuery statisticsQuery=new StatisticsQuery();
        statisticsQuery.setStartTime("2016-09-19T08:00+0800");
        statisticsQuery.setEndTime("2016-09-20T08:00+0800");
        statisticsQuery.setCdnType(CdnTypeEnum.download.getValue());
        statisticsQuery.setResultType(ResultTypeEnum.MERGE.getCode());
        statisticsQuery.setRegions(RegionsEnum.CN.getValue());
        statisticsQuery.setDataType(DataTypeEnum.EDGE.getValue());

        FlowResult flowDataByApi = cdnClient.getFlowDataByApi(statisticsQuery);
        Assert.assertNotNull(flowDataByApi);
        Assert.assertTrue(flowDataByApi.getDatas().length>0);

    }

    /**
     * 命中率查询
     * @throws Exception
     */
    @Test
    public void testGetHitRate() throws Exception{
        HitRateRequest request=new HitRateRequest();
        request.setCdnType(CdnTypeEnum.download.getValue());
        request.setStartTime("2016-09-19T08:00+0800");
        request.setEndTime("2016-09-20T08:00+0800");

        HitRateResult hitRate = cdnClient.getHitRate(request);
        Assert.assertNotNull(hitRate);
        Assert.assertTrue(hitRate.getDatas().length>0);
    }

    /**
     * 命中率详情查询
     * @throws Exception
     */
    @Test
    public void testGetHitRateDetail() throws Exception {
        StatisticsQuery statisticsQuery=new StatisticsQuery();
        statisticsQuery.setStartTime("2016-09-19T08:00+0800");
        statisticsQuery.setEndTime("2016-09-20T08:00+0800");
        statisticsQuery.setCdnType(CdnTypeEnum.download.getValue());
        statisticsQuery.setResultType(ResultTypeEnum.MERGE.getCode());
        statisticsQuery.setHitType(HitTypeEnum.FLOW_HIT_RATE.getValue());//数据类型,按流量或者请求数统计
        statisticsQuery.setRegions(RegionsEnum.CN.getValue());
        statisticsQuery.setDataType(DataTypeEnum.EDGE.getValue());

        HitRateDetailResult hitRateDetail = cdnClient.getHitRateDetail(statisticsQuery);
        Assert.assertNotNull(hitRateDetail);
        Assert.assertTrue(hitRateDetail.getDatas().length>0);
    }

    /**
     * 请求数查询
     * @throws Exception
     */
    @Test
    public void testGetPV() throws Exception{
        StatisticsQuery statisticsQuery=new StatisticsQuery();
        statisticsQuery.setStartTime("2016-09-19T08:00+0800");
        statisticsQuery.setEndTime("2016-09-20T08:00+0800");
        statisticsQuery.setCdnType(CdnTypeEnum.download.getValue());
        statisticsQuery.setResultType(ResultTypeEnum.MERGE.getCode());
        statisticsQuery.setDataType(DataTypeEnum.EDGE.getValue());
        statisticsQuery.setRegions(RegionsEnum.CN.getValue());

        PVResult pv = cdnClient.getPV(statisticsQuery);
        Assert.assertNotNull(pv);
        Assert.assertTrue(pv.getDatas().length>0);
    }
}
