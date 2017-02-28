package com.ksc.cdn.model.statistic.province.isp.httpcode;

/**
 * HttpCodeDataByProvince
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class HttpCodeDataByProvince {
    /**
     * 省份区域
     */
    private String Province;
    /**
     * 该域名在该省份区域的Http状态码详细数据
     */
    private Long Flow;
    /**
     * 该域名在该省份每个运营商的Http状态码详细数据
     */
    private HttpCodeDataByIsp[] Isps;

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }

    public HttpCodeDataByIsp[] getIsps() {
        return Isps;
    }

    public void setIsps(HttpCodeDataByIsp[] isps) {
        Isps = isps;
    }
}
