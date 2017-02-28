package com.ksc.cdn;

import com.ksc.cdn.model.content.*;

/**
 * KscCdnContent
 * 内容刷新与预加载
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/28
 */
public interface KscCdnContent {
    /**
     * 刷新节点上的文件内容。刷新指定URL内容至Cache节点，支持URL、目录批量刷新。
     *
     * @param request
     * @throws Exception
     */
    RefreshCachesResult refreshCaches(RefreshCachesRequest request) throws Exception;

    /**
     * 将源站的内容主动预热到Cache节点上，用户首次访问可直接命中缓存，缓解源站压力。
     *
     * @param request
     * @throws Exception
     */
    PreloadCachesResult preloadCaches(PreloadCachesRequest request) throws Exception;

    /**
     * 本接口用于获取刷新、预热任务进度百分比及状态，查看任务是否在全网生效
     *
     * @param request
     * @throws Exception
     */
    RefreshOrPreloadTaskResult getRefreshOrPreloadTask(RefreshOrPreloadTaskRequest request) throws Exception;

    /**
     * 获取刷新、预热URL及目录的最大限制数量，及当日剩余刷新、预热URL及目录的条数
     *
     * @param request
     * @throws Exception
     */
    RefreshOrPreloadQuotaResult getRefreshOrPreloadQuota(RefreshOrPreloadQuotaRequest request) throws Exception;
//    /**
//     * 预加载文件
//     * @param request
//     * @throws Exception
//     */
//    void preloadFiles(PreloadFilesRequest request) throws Exception;
//
//    /**
//     * 查询当前配额
//     * @param request
//     * @return
//     * @throws Exception
//     */
//    String getQuotaConfig(GetQuotaConfigRequest request) throws Exception;
//
//    /**
//     * 查询当前配额的使用量
//     * @param request
//     * @return
//     * @throws Exception
//     */
//    String getQuotaUsageAmount(GetQuotaUsageAmountRequest request) throws Exception;
//
//    /**
//     * 查询刷新及预加载结果
//     * @param request
//     * @return
//     * @throws Exception
//     */
//    String listInvalidationsByContentPath(ListInvalidationsByContentPathRequest request) throws Exception;
}
