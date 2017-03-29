package com.ksc.cdn.model.statistic.playtime;

import lombok.Data;

/**
 * Created by JIANGYANG1 on 2017/3/14.
 */
@Data
public class WatchLengthDataByRegion {
    /**
     * 区域
     * */
    private String Region;
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
}