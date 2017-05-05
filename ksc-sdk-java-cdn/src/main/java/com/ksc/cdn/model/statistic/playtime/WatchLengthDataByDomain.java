package com.ksc.cdn.model.statistic.playtime;

import java.util.List;

/**
 * Created by JIANGYANG1 on 2017/3/14.
 */
public class WatchLengthDataByDomain {
    /**
     * 域名id
     */
    private String DomainId;
    /**
     * 访问次数总和
     */
    private Long TotalSv;
    /**
     * 总播放时长
     */
    private Long TotalPlayTime;
    /**
     * 平均播放时长，单位毫秒
     */
    private Long PlayTime;

    /**
     * 该域名在每个区域的详细观看时长数据
     */
    private List<WatchLengthDataByRegion> Regions;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public Long getTotalSv() {
        return TotalSv;
    }

    public void setTotalSv(Long totalSv) {
        TotalSv = totalSv;
    }

    public Long getTotalPlayTime() {
        return TotalPlayTime;
    }

    public void setTotalPlayTime(Long totalPlayTime) {
        TotalPlayTime = totalPlayTime;
    }

    public Long getPlayTime() {
        return PlayTime;
    }

    public void setPlayTime(Long playTime) {
        PlayTime = playTime;
    }

    public List<WatchLengthDataByRegion> getRegions() {
        return Regions;
    }

    public void setRegions(List<WatchLengthDataByRegion> regions) {
        Regions = regions;
    }
}
