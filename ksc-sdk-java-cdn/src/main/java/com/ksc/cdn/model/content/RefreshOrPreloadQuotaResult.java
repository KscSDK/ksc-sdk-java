package com.ksc.cdn.model.content;

/**
 * 获取刷新、预热URL及目录的最大限制数量，及当日剩余刷新、预热URL及目录的条数
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
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

    public Long getRefreshUrlQuota() {
        return RefreshUrlQuota;
    }

    public void setRefreshUrlQuota(Long refreshUrlQuota) {
        RefreshUrlQuota = refreshUrlQuota;
    }

    public Long getRefreshDirQuota() {
        return RefreshDirQuota;
    }

    public void setRefreshDirQuota(Long refreshDirQuota) {
        RefreshDirQuota = refreshDirQuota;
    }

    public Long getPreloadUrlQuota() {
        return PreloadUrlQuota;
    }

    public void setPreloadUrlQuota(Long preloadUrlQuota) {
        PreloadUrlQuota = preloadUrlQuota;
    }

    public Long getRefreshUrlSurplus() {
        return RefreshUrlSurplus;
    }

    public void setRefreshUrlSurplus(Long refreshUrlSurplus) {
        RefreshUrlSurplus = refreshUrlSurplus;
    }

    public Long getRefreshDirSurplus() {
        return RefreshDirSurplus;
    }

    public void setRefreshDirSurplus(Long refreshDirSurplus) {
        RefreshDirSurplus = refreshDirSurplus;
    }

    public Long getPreloadUrlSurplus() {
        return PreloadUrlSurplus;
    }

    public void setPreloadUrlSurplus(Long preloadUrlSurplus) {
        PreloadUrlSurplus = preloadUrlSurplus;
    }
}
