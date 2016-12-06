package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnStatistics;
import com.ksc.cdn.model.enums.*;
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
import com.ksc.cdn.model.statistic.httpcode.HttpCodeDetailRequest;
import com.ksc.cdn.model.statistic.httpcode.HttpCodeDetailResult;
import com.ksc.cdn.model.statistic.httpcode.HttpCodeRequest;
import com.ksc.cdn.model.statistic.httpcode.HttpCodeResult;
import com.ksc.cdn.model.statistic.isp.IspRequest;
import com.ksc.cdn.model.statistic.isp.IspResult;
import com.ksc.cdn.model.statistic.live.domain.LiveOnlineUserByDomainRequest;
import com.ksc.cdn.model.statistic.live.domain.LiveOnlineUserByDomainResult;
import com.ksc.cdn.model.statistic.live.stream.bandwidth.LiveBandwidthByStreamRequest;
import com.ksc.cdn.model.statistic.live.stream.bandwidth.LiveBandwidthByStreamResult;
import com.ksc.cdn.model.statistic.live.stream.flow.DataByTime;
import com.ksc.cdn.model.statistic.live.stream.flow.LiveFlowByStreamRequest;
import com.ksc.cdn.model.statistic.live.stream.flow.LiveFlowByStreamResult;
import com.ksc.cdn.model.statistic.live.stream.top.LiveTopOnlineUserRequest;
import com.ksc.cdn.model.statistic.live.stream.top.LiveTopOnlineUserResult;
import com.ksc.cdn.model.statistic.live.stream.uv.LiveOnlineUserByStreamRequest;
import com.ksc.cdn.model.statistic.live.stream.uv.LiveOnlineUserByStreamResult;
import com.ksc.cdn.model.statistic.live.stream.uv.OnlineUserDataByTime;
import com.ksc.cdn.model.statistic.province.AreaRequest;
import com.ksc.cdn.model.statistic.province.AreaResult;
import com.ksc.cdn.model.statistic.province.isp.bandwidth.ProvinceAndIspBWRequest;
import com.ksc.cdn.model.statistic.province.isp.bandwidth.ProvinceAndIspBandwidthResult;
import com.ksc.cdn.model.statistic.province.isp.flow.ProvinceAndIspFlowRequest;
import com.ksc.cdn.model.statistic.province.isp.flow.ProvinceAndIspFlowResult;
import com.ksc.cdn.model.statistic.pv.PVRequest;
import com.ksc.cdn.model.statistic.pv.PVResult;
import com.ksc.cdn.model.statistic.top.url.TopUrlRequest;
import com.ksc.cdn.model.statistic.top.url.TopUrlResult;
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
        cdnClient=new KscCdnClient("AKTPspL9fjGORbae3XtvgFvT6Q",
                "OJxXnk/vuV4V8780v5KCRPWh68WwX8dveTcKwQERsOTUjJAD/KSIQk/mOLYZ9BdlcA==",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-1",
                "cdn");
    }

    /**
     * 带宽查询
     * 获取域名带宽数据，包括边缘带宽、回源带宽数据，单位：bit\/second
     * 支持按指定的起止时间查询，两者需要同时指定
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔
     * 最多可获取最近一年内93天跨度的数据
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度的带宽值均取该粒度时间段的峰值
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
        statisticsQuery.setDataType(DataTypeEnum.ORIGIN.getValue());//数据类型,边缘或者回源

        BpsResult bandwidthData = (BpsResult) cdnClient.generalGetStatisticsData(statisticsQuery, BpsResult.class);
        Assert.assertNotNull(bandwidthData.getDatas());

    }

    /**
     * 流量查询
     * 获取域名流量数据，包括边缘流量、回源流量数据， 单位：byte
     * 支持按指定的起止时间查询，两者需要同时指定
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔
     * 最多可获取最近一年内93天跨度的数据
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度均取该粒度时间段的流量之和
     *
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

        FlowResult flowDataByApi = (FlowResult) cdnClient.generalGetStatisticsData(statisticsQuery,FlowResult.class);
        Assert.assertNotNull(flowDataByApi);
        Assert.assertTrue(flowDataByApi.getDatas().length>0);

    }

    /**
     * 命中率查询
     * 获取域名某一时间段内流量命中率、请求数命中率数据
     * 支持按指定的起止时间查询，两者需要同时指定
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔
     * 最多可获取最近一年内93天跨度的数据
     * 说明
     * Hit访问次数=边缘请求数-回源请求数
     * Miss访问次数=回源请求数
     * Hit访问流量=边缘流量-回源流量
     * Miss访问流量=回源流量
     * @throws Exception
     */
    @Test
    public void testGetHitRate() throws Exception{
        HitRateRequest request=new HitRateRequest();
        request.setCdnType(CdnTypeEnum.download.getValue());
        request.setStartTime("2016-09-19T08:00+0800");
        request.setEndTime("2016-09-20T08:00+0800");

        HitRateResult hitRate = (HitRateResult) cdnClient.generalGetStatisticsData(request,HitRateResult.class);
        Assert.assertNotNull(hitRate);
        Assert.assertTrue(hitRate.getDatas().length>0);
    }

    /**
     * 命中率详情查询
     * 获取域名流量命中率、请求数命中率数据，单位：百分比
     * 支持按指定的起止时间查询，两者需要同时指定
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔
     * 最多可获取最近三年内93天跨度的数据
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；
     * 时效性：5分钟延迟
     *
     * 说明:
     * 请求数命中率=[1-回源请求数\/边缘请求数]*100%
     * 流量命中率=[1-回源流量\/边缘流量]*100%
     * 当边缘请求数或边缘流量为0时，命中率为0
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

        HitRateDetailResult hitRateDetail = (HitRateDetailResult) cdnClient.generalGetStatisticsData(statisticsQuery,HitRateDetailResult.class);
        Assert.assertNotNull(hitRateDetail);
        Assert.assertTrue(hitRateDetail.getDatas().length>0);
    }

    /**
     * 请求数查询
     * 获取域名请求数数据，包括边缘请求数、回源请求数， 单位：次
     * 支持按指定的起止时间查询，两者需要同时指定
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔
     * 支持多区域查询，多个区域用逗号（半角）分隔
     * 最多可获取最近三年内93天跨度的数据
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度均取该粒度时间段的请求数之和
     *
     * 说明：
     * 请求数 ：统计当前域名下资源文件的访问次数
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
//        statisticsQuery.setGranularity("5");

        PVResult pv= (PVResult) cdnClient.generalGetStatisticsData(statisticsQuery,PVResult.class);
        Assert.assertNotNull(pv);
        Assert.assertTrue(pv.getDatas().length>0);
        Assert.assertEquals("10",pv.getGranularity());
    }

    /**
     * 域名排行查询
     * 获取用户维度下所有域名的流量、流量占比、带宽峰值、峰值时间、访问次数，并按流量排行
     * 单天维度，仅指定的单天时间查询
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔
     * 最多可获取最近一年内以天为维度的数据
     * 注：仅展示查询日期内有效域名
     *
     * @throws Exception
     */
    @Test
    public void testGetDomainRankingList() throws Exception{
        DomainRankingRequest request=new DomainRankingRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());

        DomainRankingResult domainRankingList = (DomainRankingResult) cdnClient.generalGetStatisticsData(request,DomainRankingResult.class);
        Assert.assertNotNull(domainRankingList);
        Assert.assertTrue(domainRankingList.getDatas().length>0);
    }

    /**
     * 省份+运营商流量查询
     * 获取域名在中国大陆地区各省市及各运营商的流量数据，仅包括边缘节点数据,单位:byte<p>
     * 支持按指定的起止时间查询，两者需要同时指定<p>
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
     * 最多可获取最近三年内93天跨度的数据<p>
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；**以上粒度均取该粒度时间段的流量之和**<p>
     * 使用场景<p>
     * 客户查询单个域名或多个域名在各个省份及运营商的合并后的实时流量数据<p>
     * 客户查询单个域名的详细流量数据，进行数据保存及数据分析<p>
     * 客户查询某一天或某1小时的详细流量区域分布，用于制作流量数据区域用量表<p>
     * @throws Exception
     */
    @Test
    public void testGetProvinceAndIspFlow() throws Exception{
        ProvinceAndIspFlowRequest request=new ProvinceAndIspFlowRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());
        request.setResultType(ResultTypeEnum.MERGE.getCode());
//        request.setResultType(ResultTypeEnum.ALONE.getCode());

        /*request.setProvinces(StringUtils.join(new String[]{AreaEnum.beijing.getShortName()
                ,AreaEnum.guangdong.getShortName(),
        AreaEnum.anhui.getShortName(),AreaEnum.hebei.getShortName()},","));

        request.setIsps(StringUtils.join(new String[]{IspEnum.CE.getShortName(),IspEnum.CM.getShortName(),
        IspEnum.CT.getShortName(),IspEnum.UN.getShortName()},","));

        request.setDomainIds("2D09QXJ,2D09QXK");*/

        ProvinceAndIspFlowResult provinceAndIspFlow = (ProvinceAndIspFlowResult) cdnClient.generalGetStatisticsData(request,ProvinceAndIspFlowResult.class);
        Assert.assertNotNull(provinceAndIspFlow);
        Assert.assertTrue(provinceAndIspFlow.getDatas().length>0);

    }

    /**
     * 省份+运营商流量查询
     * 获取域名在中国大陆地区各省市及各运营商的流量数据，仅包括边缘节点数据,单位:bit/second<p>
     * 支持按指定的起止时间查询，两者需要同时指定<p>
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
     * 最多可获取最近三年内93天跨度的数据<p>
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；**以上粒度均取该粒度时间段的流量之和**<p>
     * 使用场景<p>
     * 客户查询单个域名或多个域名在各个省份及运营商的合并后的实时流量数据<p>
     * 客户查询单个域名的详细流量数据，进行数据保存及数据分析<p>
     * 客户查询某一天或某1小时的详细流量区域分布，用于制作流量数据区域用量表<p>
     * @throws Exception
     */
    @Test
    public void testGetProvinceAndIspBW() throws Exception {
        ProvinceAndIspBWRequest request=new ProvinceAndIspBWRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());
//        request.setResultType(ResultTypeEnum.MERGE.getCode());
        request.setResultType(ResultTypeEnum.ALONE.getCode());
        request.setGranularity("480");
//        request.setDomainIds("2D09QXK,2D067PE,2D067PD,2D09QXJ,2D067PF,2D09X6A,2D09WUH,2D09QXM,2D09WXK,2D09WXM");

        ProvinceAndIspBandwidthResult provinceAndIspBW = (ProvinceAndIspBandwidthResult) cdnClient.generalGetStatisticsData(request,ProvinceAndIspBandwidthResult.class);
        Assert.assertNotNull(provinceAndIspBW);
        Assert.assertTrue(provinceAndIspBW.getDatas().length>0);
//        Assert.assertTrue(provinceAndIspBW.getDatas()[0].getDomains()[0].getProvinces()[0].getIsps().length>0);

    }

    /**
     * 状态码统计
     * 客户查询单个域名或多个域名一段时间内各状态码访问次数<p>
     * 支持按指定的起止时间查询，两者需要同时指定<p>
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
     * 最多可获取最近三年内93天跨度的数据<p>
     * @throws Exception
     */
    @Test
    public void testGetHttpCodeData() throws Exception{
        HttpCodeRequest request=new HttpCodeRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());

        HttpCodeResult httpCodeData = (HttpCodeResult) cdnClient.generalGetStatisticsData(request,HttpCodeResult.class);
        Assert.assertNotNull(httpCodeData);
        Assert.assertTrue(httpCodeData.getDatas().length>0);
    }

    /**
     * 状态码详情统计
     * 客户查询单个域名或多个域名各状态码详细访问数据<p>
     * 支持按指定的起止时间查询，两者需要同时指定<p>
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
     * 最多可获取最近一年内93天跨度的数据<p>
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度，以上统计粒度均取该粒度内各状态码的访问次数之和<p>
     * @throws Exception
     */
    @Test
    public void testGetHttpCodeDetailedData() throws Exception{
        HttpCodeDetailRequest request=new HttpCodeDetailRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());

        request.setResultType(ResultTypeEnum.MERGE.getCode());//返回类型为分别返回
//        request.setGranularity("480");//时间粒度为8个小时

        HttpCodeDetailResult httpCodeDetailedData = (HttpCodeDetailResult) cdnClient.generalGetStatisticsData(request,HttpCodeDetailResult.class);
        Assert.assertNotNull(httpCodeDetailedData);
//        Assert.assertTrue(httpCodeDetailedData.getDatas().length>0&&httpCodeDetailedData.getDatas()[0].getDomains()[0].getCodes().length>0);
    }

    /**
     * top url 查询
     * 获取单个域名或多个域名某天内某一时段的TOP Url访问数据，仅包含Top200且访问次数大于15次的 Url的访问次数、访问流量，并按次数排序<p>
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
     * 最多可获取最近一年内一天跨度的数据<p>
     * 时效性：30分钟延迟<p>
     * @throws Exception
     */
    @Test
    public void testGetTopUrl() throws Exception{
        TopUrlRequest request=new TopUrlRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());
        request.setLimitN("5");

        TopUrlResult topUrl = (TopUrlResult) cdnClient.generalGetStatisticsData(request,TopUrlResult.class);
        Assert.assertNotNull(topUrl);
        Assert.assertTrue(topUrl.getDatas().length==5);
    }

    /**
     * 用户区域统计
     * 获取国内各省份及运营商流量、访问次数、流量占比，请求数占比，海外地区的流量、访问次数、流量占比、请求数占比。<p>
     * 支持按指定的起止时间查询，两者需要同时指定<p>
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
     * 最多可获取最近一年内93天跨度的数据<p>
     * 说明<p>
     * 运营商包含：电信、联通、移动、铁通、鹏博士、教育网、其他、海外ISP<p>
     * 地区包含：国内32个省、香港、台湾、澳门、其他海外地区统一合并为海外<p>
     * @throws Exception
     */
    @Test
    public void testGetAreaData() throws  Exception{
        AreaRequest request=new AreaRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());

        AreaResult areaData = (AreaResult) cdnClient.generalGetStatisticsData(request,AreaResult.class);
        Assert.assertNotNull(areaData);
        Assert.assertTrue(areaData.getDatas().length>0);
    }

    /**
     * 运营商占比统计
     * 获取各运营商流量、访问次数、流量占比、访问次数占比<p>
     * 支持按指定的起止时间查询，两者需要同时指定<p>
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
     * 最多可获取最近一年内93天跨度的数据<p>
     * 说明<p>
     * 运营商包含：电信、联通、移动、铁通、鹏博士、教育网、其他、海外ISP<p>
     * @throws Exception
     */
    @Test
    public void testGetIspData()throws Exception{
        IspRequest request=new IspRequest();
        request.setStartTime("2016-09-19T00:00+0800");
        request.setEndTime("2016-09-19T23:00+0800");
        request.setCdnType(CdnTypeEnum.download.getValue());

        IspResult ispData = (IspResult) cdnClient.generalGetStatisticsData(request,IspResult.class);
        Assert.assertNotNull(ispData);
        Assert.assertTrue(ispData.getDatas()[0].getFlow()>0);
    }

    /**
     * 直播按流维度查询流量
     * 直播业务，获取按流为维度的流量数据<P>
     * 支持按指定的起止时间查询，两者需要同时指定<P>
     * 支持批量流名过滤查询，多个流名用逗号（半角）分隔<P>
     * 最多可获取最近62天内，7天跨度的数据<P>
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度均取该粒度时间段的求和<P>
     * 只支持直播业务<P>
     * @throws Exception
     */
    @Test
    public void testGetLiveFlowDataByStream() throws Exception{
        LiveFlowByStreamRequest request=new LiveFlowByStreamRequest();
        request.setStartTime("2016-09-22T09:14+0800");
        request.setEndTime("2016-09-24T10:20+0800");
        request.setStreamUrl("rtmp://realflv3.plu.cn/live/ffea40ea2f8e4a5e95096e0f89227092");
        request.setResultType(ResultTypeEnum.MERGE.getCode());
//        request.setGranularity("1440");

        LiveFlowByStreamResult liveFlowDataByStream = (LiveFlowByStreamResult) cdnClient.generalGetStatisticsData(request,LiveFlowByStreamResult.class);
        Assert.assertNotNull(liveFlowDataByStream);
        Assert.assertTrue(liveFlowDataByStream.getDatas().length>0);
        Long flow=0L;
        for (DataByTime dt:liveFlowDataByStream.getDatas()
             ) {
            flow+=dt.getFlow();
        }
        System.out.print(flow);
        Assert.assertTrue(flow>0L);
    }

    /**
     * 直播按流维度查询带宽
     * 直播业务，获取按流为维度的带宽数据，带宽单位bit\/second<p>
     * 支持按指定的起止时间查询，两者需要同时指定<p>
     * 支持批量流名过滤查询，多个流名用逗号（半角）分隔<p>
     * 最多可获取最近62天内，7天跨度的数据<p>
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度的带宽值均取该粒度时间段的峰值<p>
     * 只支持直播业务<p>
     * @throws Exception
     */
    @Test
    public void testGetLiveBandwidthDataByStream() throws Exception{
        LiveBandwidthByStreamRequest request=new LiveBandwidthByStreamRequest();
        request.setStartTime("2016-09-22T09:14+0800");
        request.setEndTime("2016-09-24T10:20+0800");
        request.setStreamUrl("rtmp://realflv3.plu.cn/live/ffea40ea2f8e4a5e95096e0f89227092");
        request.setResultType(ResultTypeEnum.ALONE.getCode());
        request.setGranularity("1440");

        LiveBandwidthByStreamResult liveBandwidthDataByStream = (LiveBandwidthByStreamResult) cdnClient.generalGetStatisticsData(request,LiveBandwidthByStreamResult.class);
        Assert.assertNotNull(liveBandwidthDataByStream);
        Assert.assertTrue(liveBandwidthDataByStream.getDatas().length>0);
    }

    /**
     * 直播按域名维度统计在线人数
     * 获取按域名维度的直播在线人数数据， 单位：每分钟的在线人数<p>
     * 支持按指定的起止时间查询，两者需要同时指定<p>
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
     * 支持多计费区域查询，多个计费区域用逗号（半角）分隔<p>
     * 最多可获取最近1年93天跨度的数据<p>
     * 统计粒度：1分钟粒度（默认）；5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度均取该粒度时间段的在线人数的**峰值。<p>
     * 只支持直播业务<p>
     * @throws Exception
     */
    @Test
    public void testGetLiveOnlineUserDataByDomain()throws Exception{
        LiveOnlineUserByDomainRequest request=new LiveOnlineUserByDomainRequest();
        request.setStartTime("2016-09-22T09:14+0800");
        request.setEndTime("2016-09-24T10:20+0800");
//        request.setGranularity("1440");
        request.setResultType(ResultTypeEnum.MERGE.getCode());

        LiveOnlineUserByDomainResult liveOnlineUserDataByDomain = (LiveOnlineUserByDomainResult) cdnClient.generalGetStatisticsData(request,LiveOnlineUserByDomainResult.class);
        Assert.assertNotNull(liveOnlineUserDataByDomain);
        Assert.assertTrue(liveOnlineUserDataByDomain.getDatas().length>0);

    }

    /**
     * 获取按流维度的直播在线人数数据， 单位：每分钟的在线人数<p>
     * 支持按指定的起止时间查询，两者需要同时指定<p>
     * 支持批量流名过滤查询，多个流名用逗号（半角）分隔<p>
     * 支持多计费区域查询，多个计费区域用逗号（半角）分隔<p>
     * 最多可获取最近62天内，7天跨度的数据。（注意： 按流名维度的数据，只保留2个月）<p>
     * 统计粒度：1分钟粒度；5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度的在线人数均取该粒度时间段的在线人数的峰值 (注意： 需要按统计粒度来汇聚，用于在界面上展示。)<p>
     * 说明:<p>
     * 按流名维度的数据，返回时并不按照“域名”维度汇聚。如果需要按域名维度的数据，请按单个域名过滤<p>
     * @throws Exception
     */
    @Test
    public void testGetLiveOnlineUserDataByStream() throws Exception{
        LiveOnlineUserByStreamRequest request=new LiveOnlineUserByStreamRequest();
        request.setStartTime("2016-09-22T09:14+0800");
        request.setEndTime("2016-09-24T10:20+0800");
        request.setGranularity("1440");
        request.setResultType(ResultTypeEnum.ALONE.getCode());
        request.setStreamUrl("rtmp://realflv3.plu.cn/live/ffea40ea2f8e4a5e95096e0f89227092");

        LiveOnlineUserByStreamResult liveOnlineUserDataByStream = (LiveOnlineUserByStreamResult) cdnClient.generalGetStatisticsData(request,LiveOnlineUserByStreamResult.class);
        Assert.assertNotNull(liveOnlineUserDataByStream);
        Assert.assertTrue(liveOnlineUserDataByStream.getDatas().length>0);
        Long onlineUser=0l;
        for (OnlineUserDataByTime dt:liveOnlineUserDataByStream.getDatas()
             ) {
            onlineUser+=dt.getOnlineUser();
        }
        Assert.assertTrue(onlineUser>0l);
    }

    /**
     * 获取按流维度的直播在线人数排行， 单位：每分钟的在线人数<p>
     * 只设置起始时间，代表起始时间这1分钟的数据。<p>
     * 支持批量域名过滤查询，多个域名ID用逗号（半角）分隔<p>
     * 支持多计费区域查询，多个计费区域用逗号（半角）分隔<p>
     * 最多可获取最近62天内的数据。（注意： 按流维度的数据，只保留2个月）<p>
     * 说明：<p>
     * 按流名维度的数据，返回时并不按照“域名”维度汇聚。如果需要按域名维度的数据，请按单个域名过滤<p>
     * @throws Exception
     */
    @Test
    public void testGetLiveTopOnlineUserData()throws Exception{
        LiveTopOnlineUserRequest request=new LiveTopOnlineUserRequest();
        request.setStartTime("2016-10-20T00:00+0800");
        request.setResultType(ResultTypeEnum.ALONE.getCode());
        request.setLimitN("5");

        LiveTopOnlineUserResult liveTopOnlineUserData = (LiveTopOnlineUserResult) cdnClient.generalGetStatisticsData(request,LiveTopOnlineUserResult.class);
        Assert.assertNotNull(liveTopOnlineUserData);
        Assert.assertTrue(liveTopOnlineUserData.getDatas().length==5);
    }

}
