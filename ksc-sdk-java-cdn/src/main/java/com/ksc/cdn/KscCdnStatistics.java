package com.ksc.cdn;

import com.ksc.cdn.model.statistic.GeneralRequest;
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
import com.ksc.cdn.model.statistic.province.isp.bandwidth.ProvinceAndIspBWRequest;
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
public interface KscCdnStatistics<R> {
    /**
     * 通用获取统计分析数据结果集
     * @param request 请求参数对象
     * @return 返回结果对象
     * @throws Exception
     */
    <R> R generalGetStatisticsData(GeneralRequest request, Class<R> rType) throws Exception;
}
