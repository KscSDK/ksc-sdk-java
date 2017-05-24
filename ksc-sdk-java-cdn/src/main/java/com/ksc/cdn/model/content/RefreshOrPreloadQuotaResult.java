package com.ksc.cdn.model.content;

import lombok.Data;

/**
 * 获取刷新、预热URL及目录的最大限制数量，及当日剩余刷新、预热URL及目录的条数
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class RefreshOrPreloadQuotaResult {

    /**
     * 文件刷新Url上限条数
     */
    private Long RefreshUrlQuota;

    /**
     * 目录刷新Url上限条数
     */
    private Long RefreshDirQuota;

    /**
     * 预热Url上限条数
     */
    private Long PreloadUrlQuota;

    /**
     * 当日剩余文件刷新 Url 条数
     */
    private Long RefreshUrlSurplus;

    /**
     * 当日剩余目录刷新 Url 条数
     */
    private Long RefreshDirSurplus;

    /**
     * 当日剩余预热 Url 条数
     */
    private Long PreloadUrlSurplus;
}
