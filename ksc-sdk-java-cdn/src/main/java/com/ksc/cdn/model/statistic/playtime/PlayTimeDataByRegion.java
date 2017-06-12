package com.ksc.cdn.model.statistic.playtime;

/**
 * Created by JIANGYANG1 on 2017/3/13.
 */
public class PlayTimeDataByRegion {
    /**
     * 区域
     */
    private String Region;
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

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
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
}
