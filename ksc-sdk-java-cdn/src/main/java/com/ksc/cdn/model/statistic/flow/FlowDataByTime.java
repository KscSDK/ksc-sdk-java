package com.ksc.cdn.model.statistic.flow;

/**
 * FlowDataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class FlowDataByTime{
    private String Time;
    private Long Flow;
    private Long SrcFlow;

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

    public Long getSrcFlow() {
        return SrcFlow;
    }

    public void setSrcFlow(Long srcFlow) {
        SrcFlow = srcFlow;
    }
}