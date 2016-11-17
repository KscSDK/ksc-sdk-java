package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnStatistics;
import com.ksc.cdn.model.enums.*;
import com.ksc.cdn.model.statistic.*;
import com.ksc.cdn.model.statistic.bandwidth.BpsRequest;
import com.ksc.cdn.model.statistic.bandwidth.BpsResult;
import com.ksc.cdn.model.statistic.flow.DomainRankingRequest;
import com.ksc.cdn.model.statistic.flow.DomainRankingResult;
import com.ksc.cdn.model.statistic.flow.FlowRequest;
import com.ksc.cdn.model.statistic.flow.FlowResult;
import com.ksc.cdn.model.statistic.hitrate.HitRateDetailRequest;
import com.ksc.cdn.model.statistic.hitrate.HitRateDetailResult;
import com.ksc.cdn.model.statistic.hitrate.HitRateRequest;
import com.ksc.cdn.model.statistic.hitrate.HitRateResult;
import com.ksc.cdn.model.statistic.province.isp.ProvinceAndIspRequest;
import com.ksc.cdn.model.statistic.province.isp.flow.ProvinceAndIspFlowResult;
import com.ksc.cdn.model.statistic.pv.PVRequest;
import com.ksc.cdn.model.statistic.pv.PVResult;
import org.apache.commons.lang3.StringUtils;
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
        cdnClient=new KscCdnClient("AKTPhJhBITP7Tp2Z4pBn7P4Alg",
                "OL3qj7nJ+epuuVG8MKhHMtRKZO0aiShL476SrfOCMVGsrhSRK3mRtaKP78Ij/YKDNQ==",
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
        BpsRequest statisticsQuery=new BpsRequest();
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
        FlowRequest statisticsQuery=new FlowRequest();
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
        HitRateDetailRequest statisticsQuery=new HitRateDetailRequest();
        statisticsQuery.setStartTime("2016-09-19T08:00+0800");
        statisticsQuery.setEndTime("2016-09-20T08:00+0800");
        statisticsQuery.setCdnType(CdnTypeEnum.download.getValue());
        statisticsQuery.setResultType(ResultTypeEnum.MERGE.getCode());
        statisticsQuery.setHitType(HitTypeEnum.FLOW_HIT_RATE.getValue());//数据类型,按流量或者请求数统计

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
        PVRequest statisticsQuery=new PVRequest();
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

    /**
     * 域名排行查询
     * @throws Exception
     */
    @Test
    public void testGetDomainRankingList() throws Exception{
        DomainRankingRequest request=new DomainRankingRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());

        DomainRankingResult domainRankingList = cdnClient.getDomainRankingList(request);
        Assert.assertNotNull(domainRankingList);
        Assert.assertTrue(domainRankingList.getDatas().length>0);
    }
    @Test
    public void testGetProvinceAndIspFlow() throws Exception{
        ProvinceAndIspRequest request=new ProvinceAndIspRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());
//        request.setResultType(ResultTypeEnum.MERGE.getCode());
        request.setResultType(ResultTypeEnum.ALONE.getCode());

        request.setProvinces(StringUtils.join(new String[]{AreaEnum.beijing.getShortName()
                ,AreaEnum.guangdong.getShortName(),
        AreaEnum.anhui.getShortName(),AreaEnum.hebei.getShortName()},","));

        request.setIsps(StringUtils.join(new String[]{IspEnum.CE.getShortName(),IspEnum.CM.getShortName(),
        IspEnum.CT.getShortName(),IspEnum.UN.getShortName()},","));

        request.setDomainIds("2D09QXJ,2D09QXK");

        ProvinceAndIspFlowResult provinceAndIspFlow = cdnClient.getProvinceAndIspFlow(request);
        Assert.assertNotNull(provinceAndIspFlow);
//        Assert.assertTrue(provinceAndIspFlow.getDatas().length>0);

    }
}
