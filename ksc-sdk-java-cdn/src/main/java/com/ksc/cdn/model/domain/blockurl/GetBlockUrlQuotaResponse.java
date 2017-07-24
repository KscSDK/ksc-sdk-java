package com.ksc.cdn.model.domain.blockurl;

/**
 * description：查询屏蔽url剩余数量
 * author：YANGXUEYI
 * date: 2017/7/18
 * mail：yangxueyi@kingsoft.com
 */
public class GetBlockUrlQuotaResponse {
    /**
     * 	屏蔽URL的上限条数
     */
    private Long BlockUrlQuota;

    /**
     * 剩余屏蔽 Url的 条数
     */
    private Long BlockUrlSurplus;

    public Long getBlockUrlQuota() {
        return BlockUrlQuota;
    }

    public void setBlockUrlQuota(Long blockUrlQuota) {
        BlockUrlQuota = blockUrlQuota;
    }

    public Long getBlockUrlSurplus() {
        return BlockUrlSurplus;
    }

    public void setBlockUrlSurplus(Long blockUrlSurplus) {
        BlockUrlSurplus = blockUrlSurplus;
    }
}
