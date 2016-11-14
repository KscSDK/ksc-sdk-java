package com.ksc.cdn.model.statistic;

/**
 * Created by jiangran on 19/10/2016.
 */
public class FlowResult extends CommonFieldResult {
    private FlowDataByTime[] Datas;

    public FlowDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(FlowDataByTime[] datas) {
        Datas = datas;
    }

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
}
