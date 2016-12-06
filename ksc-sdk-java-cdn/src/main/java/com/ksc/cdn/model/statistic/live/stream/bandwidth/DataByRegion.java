package com.ksc.cdn.model.statistic.live.stream.bandwidth;

/**
 * DataByRegion
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class DataByRegion {
    /**
     * 计费区域
     */
    private String Region;
    /**
     * 边缘带宽（该流名在该计费区域的边缘带宽数据）
     */
    private Long Bw;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }
}
