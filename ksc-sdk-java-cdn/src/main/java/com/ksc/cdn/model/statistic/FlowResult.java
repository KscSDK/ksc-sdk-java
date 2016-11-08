package com.ksc.cdn.model.statistic;

import lombok.Data;

/**
 * Created by jiangran on 19/10/2016.
 */
@Data
public class FlowResult extends CommonFieldResult {
    private FlowDataByTime[] Datas;

    @Data
    public class FlowDataByTime{
        private String Time;
        private Long Flow;
        private Long SrcFlow;
    }
}
