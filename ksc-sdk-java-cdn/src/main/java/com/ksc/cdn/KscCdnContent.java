package com.ksc.cdn;

import com.ksc.cdn.model.content.*;

/**
 * KscCdnContent
 * 内容刷新与预加载
 * @author jiangran@kingsoft.com
 * @date 2016/11/28
 */
public interface KscCdnContent {
    /**
     * 添加刷新文件
     * @param request
     * @throws Exception
     */
    void addRefreshFiles(RefreshFilesRequest request) throws Exception;

    /**
     * 预加载文件
     * @param request
     * @throws Exception
     */
    void preloadFiles(PreloadFilesRequest request) throws Exception;

    /**
     * 查询当前配额
     * @param request
     * @return
     * @throws Exception
     */
    String getQuotaConfig(GetQuotaConfigRequest request) throws Exception;

    /**
     * 查询当前配额的使用量
     * @param request
     * @return
     * @throws Exception
     */
    String getQuotaUsageAmount(GetQuotaUsageAmountRequest request) throws Exception;

    /**
     * 查询刷新及预加载结果
     * @param request
     * @return
     * @throws Exception
     */
    String listInvalidationsByContentPath(ListInvalidationsByContentPathRequest request) throws Exception;
}
