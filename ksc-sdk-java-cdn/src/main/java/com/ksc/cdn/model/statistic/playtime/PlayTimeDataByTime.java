package com.ksc.cdn.model.statistic.playtime;

import lombok.Data;

import java.util.List;

/**
 * Created by JIANGYANG1 on 2017/3/13.
 */
@Data
public class PlayTimeDataByTime {
    /**
     * 时间点
     * */
    private String Time;
    /**
     * 访问次数总和
     * */
    private Long TotalSv;
    /**
     * 总播放时长
     * */
    private Long TotalPlayTime;
    /**
     * 平均播放时长，单位毫秒
     * */
    private Long PlayTime;
    /**
     * 每个流名的观看时长数据 (仅当ResultType取值为1时返回此数据)
     * */
    private List<PlayTimeDataByStream> Streams;
}
