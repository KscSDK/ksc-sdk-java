package com.ksc.cdn;

import com.ksc.cdn.model.statistic.GeneralRequest;

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
