package com.ksc.cdn.model.statistic.playtime;

import java.util.List;

/**
 * Created by JIANGYANG1 on 2017/3/13.
 */
public class PlayTimeDataByTime {
    /**
     * 时间点
     */
    private String Time;
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
     * 每个流名的观看时长数据 (仅当ResultType取值为1时返回此数据)
     */
    private List<PlayTimeDataByStream> Streams;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
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

    public List<PlayTimeDataByStream> getStreams() {
        return Streams;
    }

    public void setStreams(List<PlayTimeDataByStream> streams) {
        Streams = streams;
    }
}
