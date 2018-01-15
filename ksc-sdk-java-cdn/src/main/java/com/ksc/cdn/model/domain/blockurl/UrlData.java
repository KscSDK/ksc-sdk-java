package com.ksc.cdn.model.domain.blockurl;

/**
 * description：
 * author：YANGXUEYI
 * date: 2017/7/18
 * mail：yangxueyi@kingsoft.com
 */
public class UrlData {
    /**
     * 屏蔽的Url地址
     */
    private String Url;

    /**
     * 任务进度百分比数值。状态为屏蔽中时，为屏蔽的进度；状态为解除屏蔽中时，为解除屏蔽的进度；状态为刷新中时，为刷新的进度。
     */
    private Double Progress;

    /**
     * 屏蔽中 - blocking
     * 屏蔽完成 - block_success
     * 屏蔽失败 - block_fail
     * 解除屏蔽中 - unblocking
     * 解除屏蔽完成（该API不返回）- unblock_success
     * 解除屏蔽失败 - ublock_fail
     * 刷新中 - refreshing
     * 刷新完成（该API不返回） - refresh_success
     * 刷新失败 - refresh_fail
     * 已失效（该API不返回） - block_invalid
     */
    private String BlockUrlStatus;

    /**
     * URL开始屏蔽的时间
     */
    private String BlockTime;

    /**
     * 过期自动解除屏蔽的时间
     */
    private String ExpireTime;

    /**
     * 屏蔽提交者，取值为：customer：客户提交；ksyun：金山云封禁；ISMS：信息安全管理系统封禁
     */
    private String Submitter;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Double getProgress() {
        return Progress;
    }

    public void setProgress(Double progress) {
        Progress = progress;
    }

    public String getBlockUrlStatus() {
        return BlockUrlStatus;
    }

    public void setBlockUrlStatus(String blockUrlStatus) {
        BlockUrlStatus = blockUrlStatus;
    }

    public String getBlockTime() {
        return BlockTime;
    }

    public void setBlockTime(String blockTime) {
        BlockTime = blockTime;
    }

    public String getExpireTime() {
        return ExpireTime;
    }

    public void setExpireTime(String expireTime) {
        ExpireTime = expireTime;
    }

    public String getSubmitter() {
        return Submitter;
    }

    public void setSubmitter(String submitter) {
        Submitter = submitter;
    }
}
