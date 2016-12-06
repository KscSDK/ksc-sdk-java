package com.ksc.cdn.model.statistic.live.stream.flow;

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
     * 流量（所选域名合并值）
     */
    private Long Flow;
    /**
     * 每个流的详细流量数据(仅当ResultType取值为1时返回此项数据)
     */
    private DataByStream[] Streams;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }

    public DataByStream[] getStreams() {
        return Streams;
    }

    public void setStreams(DataByStream[] streams) {
        Streams = streams;
    }
}
