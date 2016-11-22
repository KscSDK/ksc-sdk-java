package com.ksc.cdn;

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
import com.ksc.cdn.model.statistic.live.stream.flow.LiveFlowByStreamRequest;
import com.ksc.cdn.model.statistic.live.stream.flow.LiveFlowByStreamResult;
import com.ksc.cdn.model.statistic.live.stream.top.LiveTopOnlineUserRequest;
import com.ksc.cdn.model.statistic.live.stream.top.LiveTopOnlineUserResult;
import com.ksc.cdn.model.statistic.live.stream.uv.LiveOnlineUserByStreamRequest;
import com.ksc.cdn.model.statistic.live.stream.uv.LiveOnlineUserByStreamResult;
import com.ksc.cdn.model.statistic.province.AreaRequest;
import com.ksc.cdn.model.statistic.province.AreaResult;
import com.ksc.cdn.model.statistic.province.isp.ProvinceAndIspRequest;
import com.ksc.cdn.model.statistic.province.isp.bandwidth.ProvinceAndIspBandwidthResult;
import com.ksc.cdn.model.statistic.province.isp.flow.ProvinceAndIspFlowResult;
import com.ksc.cdn.model.statistic.pv.PVRequest;
import com.ksc.cdn.model.statistic.pv.PVResult;
import com.ksc.cdn.model.statistic.top.url.TopUrlRequest;
import com.ksc.cdn.model.statistic.top.url.TopUrlResult;

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
     * 域名排行查询
     */
    String FLOW_RANK_URL = "/2016-09-01/statistics/GetDomainRankingListData";
    String FLOW_RANK_VERSION = "2016-09-01";
    String FLOW_RANK_ACTION = "GetDomainRankingListData";
    /**
     * 省份+运营商流量查询
     */
    String PROVINCE_ISP_FLOW_URL="/2016-09-01/statistics/GetProvinceAndIspFlowData";
    String PROVINCE_ISP_FLOW_VERSION="2016-09-01";
    String PROVINCE_ISP_FLOW_ACTION="GetProvinceAndIspFlowData";
    /**
     * 省份+运营商带宽查询
     */
    String PROVINCE_ISP_BW_URL="/2016-09-01/statistics/GetProvinceAndIspBandwidthData";
    String PROVINCE_ISP_BW_VERSION="2016-09-01";
    String PROVINCE_ISP_BW_ACTION="GetProvinceAndIspBandwidthData";
    /**
     * 状态码统计
     */
    String HTTPCODE_URL="/2016-09-01/statistics/GetHttpCodeData";
    String HTTPCODE_VERSION="2016-09-01";
    String HTTPCODE_ACTION="GetHttpCodeData";
    /**
     * 状态码详情统计
     */
    String HTTPCODE_DETAIL_URL="/2016-09-01/statistics/GetHttpCodeDetailedData";
    String HTTPCODE_DETAIL_VERSION="2016-09-01";
    String HTTPCODE_DETAIL_ACTION="GetHttpCodeDetailedData";
    /**
     * top url 查询
     */
    String TOPURL_URL="/2016-09-01/statistics/GetTopUrlData";
    String TOPURL_VERSION="2016-09-01";
    String TOPURL_ACTION="GetTopUrlData";
    /**
     * 用户区域统计
     */
    String AREA_URL="/2016-09-01/statistics/GetAreaData";
    String AREA_VERSION="2016-09-01";
    String AREA_ACTION="GetAreaData";
    /**
     * 运营商占比统计
     */
    String ISP_URL="/2016-09-01/statistics/GetIspData";
    String ISP_VERSION="2016-09-01";
    String ISP_ACTION="GetIspData";
    /**
     * 直播业务，获取按流为维度的流量数据，流量单位byte
     */
    String LIVE_STREAM_FLOW_URL="/2016-09-01/statistics/GetLiveFlowDataByStream";
    String LIVE_STREAM_FLOW_VERSION="2016-09-01";
    String LIVE_STREAM_FLOW_ACTION="GetLiveFlowDataByStream";

    String LIVE_STREAM_BANDWIDTH_URL="/2016-09-01/statistics/GetLiveBandwidthDataByStream";
    String LIVE_STREAM_BANDWIDTH_VERSION="2016-09-01";
    String LIVE_STREAM_BANDWIDTH_ACTION="GetLiveBandwidthDataByStream";
    /**
     * 获取按域名维度的直播在线人数数据， 单位：每分钟的在线人数
     */
    String LIVE_DOMAIN_ONLINEUSER_URL="/2016-09-01/statistics/GetLiveOnlineUserDataByDomain";
    String LIVE_DOMAIN_ONLINEUSER_VERSION="2016-09-01";
    String LIVE_DOMAIN_ONLINEUSER_ACTION="GetLiveOnlineUserDataByDomain";
    /**
     * 获取按流维度的直播在线人数数据， 单位：每分钟的在线人数
     */
    String LIVE_STREAM_ONLINEUSER_URL="/2016-09-01/statistics/GetLiveOnlineUserDataByStream";
    String LIVE_STREAM_ONLINEUSER_VERSION="2016-09-01";
    String LIVE_STREAM_ONLINEUSER_ACTION="GetLiveOnlineUserDataByStream";
    /**
     * 获取按流维度的直播在线人数排行， 单位：每分钟的在线人数
     */
    String LIVE_STREAM_ONLINEUSER_TOP_URL="/2016-09-01/statistics/GetLiveTopOnlineUserData";
    String LIVE_STREAM_ONLINEUSER_TOP_VERSION="2016-09-01";
    String LIVE_STREAM_ONLINEUSER_TOP_ACTION="GetLiveTopOnlineUserData";
    /**
     * 查询带宽
     * @param statisticsQuery
     * @return
     * @throws Exception
     */
    BpsResult getBandwidthData(BpsRequest statisticsQuery) throws Exception;

    /**
     * 查询流量
     * @param statisticsQuery
     * @return
     * @throws Exception
     */
    FlowResult getFlowDataByApi(FlowRequest statisticsQuery) throws Exception;

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
    HitRateDetailResult getHitRateDetail(HitRateDetailRequest statisticsQuery) throws Exception;

    /**
     * 请求数查询
     * @param statisticsQuery
     * @return
     * @throws Exception
     */
    PVResult getPV(PVRequest statisticsQuery) throws Exception;

    /**
     * 域名排行查询
     * 获取用户维度下所有域名的流量、流量占比、带宽峰值、峰值时间、访问次数，并按流量排行
     * 单天维度，仅指定的单天时间查询
     * @param domainRankingRequest
     * @return
     */
    DomainRankingResult getDomainRankingList(DomainRankingRequest domainRankingRequest) throws Exception;

    /**
     * 获取域名在中国大陆地区各省份及各运营商的流量数据，仅包括边缘节点数据，单位:byte
     * @param provinceAndIspRequest
     * @return
     * @throws Exception
     */
    ProvinceAndIspFlowResult getProvinceAndIspFlow(ProvinceAndIspRequest provinceAndIspRequest) throws Exception;

    /**
     * 获取域名在中国大陆地区各省市及各运营商的带宽数据，仅包括边缘节点数据，单位:bit/second
     * @return
     * @throws Exception
     */
    ProvinceAndIspBandwidthResult getProvinceAndIspBW(ProvinceAndIspRequest provinceAndIspRequest) throws Exception;

    /**
     * 获取域名一段时间内的Http状态码访问次数及占比数据
     *
     * @param request
     * @return
     * @throws Exception
     */
    HttpCodeResult getHttpCodeData(HttpCodeRequest request) throws Exception;

    /**
     * 获取域名的Http状态码详细访问次数及占比数据
     * @param request
     * @return
     * @throws Exception
     */
    HttpCodeDetailResult getHttpCodeDetailedData(HttpCodeDetailRequest request) throws Exception;

    /**
     * 获取单个域名或多个域名某天内某一时段的TOP Url访问数据，
     * 仅包含Top200且访问次数大于15次的 Url的访问次数、访问流量，并按次数排序
     * 注意:
     * 最多可获取最近一年内一天跨度的数据
     * 时效性：30分钟延迟
     * @param request
     * @return
     * @throws Exception
     */
    TopUrlResult getTopUrl(TopUrlRequest request) throws Exception;

    /**
     * 获取国内各省份及运营商流量、访问次数、流量占比，请求数占比，海外地区的流量、访问次数、流量占比、请求数占比。
     * 运营商包含：电信、联通、移动、铁通、鹏博士、教育网、其他、海外ISP
     * 地区包含：国内32个省、香港、台湾、澳门、其他海外地区统一合并为海外
     * @param request
     * @return
     * @throws Exception
     */
    AreaResult getAreaData(AreaRequest request) throws Exception;

    /**
     * 获取各运营商流量、访问次数、流量占比、访问次数占比
     * 运营商包含：电信、联通、移动、铁通、鹏博士、教育网、其他、海外ISP
     * @param request
     * @return
     * @throws Exception
     */
    IspResult getIspData(IspRequest request) throws Exception;

    /**
     * 直播业务，获取按流为维度的流量数据，流量单位byte
     * 支持按指定的起止时间查询，两者需要同时指定
     * 支持批量流名过滤查询，多个流名用逗号（半角）分隔
     * 最多可获取最近62天内，7天跨度的数据
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度均取该粒度时间段的求和
     * 只支持直播业务
     * @param request
     * @return
     * @throws Exception
     */
    LiveFlowByStreamResult getLiveFlowDataByStream(LiveFlowByStreamRequest request) throws Exception;

    /**
     * 直播业务，获取按流为维度的带宽数据，带宽单位bit\/second
     * 支持按指定的起止时间查询，两者需要同时指定
     * 支持批量流名过滤查询，多个流名用逗号（半角）分隔
     * 最多可获取最近62天内，7天跨度的数据
     * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度的带宽值均取该粒度时间段的峰值
     * 只支持直播业务
     * @param request
     * @return
     * @throws Exception
     */
    LiveBandwidthByStreamResult getLiveBandwidthDataByStream(LiveBandwidthByStreamRequest request) throws Exception;

    /**
     * 获取按域名维度的直播在线人数数据， 单位：每分钟的在线人数
     * 支持按指定的起止时间查询，两者需要同时指定
     * 支持批量域名查询，多个域名ID用逗号（半角）分隔
     * 支持多计费区域查询，多个计费区域用逗号（半角）分隔
     * 最多可获取最近1年93天跨度的数据
     * 只支持直播业务
     * @param request
     * @return
     * @throws Exception
     */
    LiveOnlineUserByDomainResult getLiveOnlineUserDataByDomain(LiveOnlineUserByDomainRequest request) throws Exception;

    /**
     * 获取按流维度的直播在线人数数据， 单位：每分钟的在线人数
     * 支持按指定的起止时间查询，两者需要同时指定
     * 支持批量流名过滤查询，多个流名用逗号（半角）分隔
     * 支持多计费区域查询，多个计费区域用逗号（半角）分隔
     * 最多可获取最近62天内，7天跨度的数据。（注意： 按流名维度的数据，只保留2个月）
     * 只支持直播业务
     * @param request
     * @return
     * @throws Exception
     */
    LiveOnlineUserByStreamResult getLiveOnlineUserDataByStream(LiveOnlineUserByStreamRequest request)throws Exception;

    /**
     * 获取按流维度的直播在线人数排行， 单位：每分钟的在线人数
     * 只设置起始时间，代表起始时间这1分钟的数据。
     * 支持批量域名过滤查询，多个域名ID用逗号（半角）分隔
     * 支持多计费区域查询，多个计费区域用逗号（半角）分隔
     * 最多可获取最近62天内的数据。（注意： 按流维度的数据，只保留2个月）
     * 只支持直播业务
     * @param request
     * @return
     * @throws Exception
     */
    LiveTopOnlineUserResult getLiveTopOnlineUserData(LiveTopOnlineUserRequest request) throws Exception;
}
