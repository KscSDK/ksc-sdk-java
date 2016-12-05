package com.ksc.cdn.model.statistic.live.stream.bandwidth;

/**
 * DataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class DataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 边缘带宽（所选流名合并值）
     */
    private Long Bw;
    /**
     * 每个流的详细带宽数据(仅当ResultType取值为1时返回此项数据)
     */
    private DataByStream[] Streams;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }

    public DataByStream[] getStreams() {
        return Streams;
    }

    public void setStreams(DataByStream[] streams) {
        Streams = streams;
    }
}
