package com.ksc.cdn.model.statistic.billing;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by JIANGYANG1 on 2017/3/21.
 */
@AllArgsConstructor
@Data
public class BillingData {
    /***
     *区域
     */
    private String Region;
    /**
     * 每个区域的计费数据
     * */
    private Long BillingData;
}
