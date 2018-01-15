package com.ksc.network.slb.model;


import lombok.EqualsAndHashCode;
import lombok.ToString;
/**
 * Created by LIUHONGMING on 2017/4/20.
 */
@ToString
@EqualsAndHashCode
public class RealServer {
    /**
     * 监听器的ID
     */
    private String ListenerId;

    /**
     * 监听器和主机绑定的ID
     */
    private String RegisterId;

    /**
     * 真实服务器的IP，TCP类型传的是主机的IP，HTTP和HTTPS类型传的是弹性IP
     */
    private String RealServerIp;

    /**
     * 真实服务器的端口，TCP类型传的是主机的端口，HTTP类型传的是弹性的端口。
     */
    private Integer RealServerPort;

    /**
     * 真实服务器的类型，TCP类型是host，HTTP和HTTPS类型中的IP映射是Ipfwd
     */
    private String RealServerType;

    /**
     * 真实服务器的状态，健康（healthy），不健康（unhealthy）
     */
    private String RealServerState;

    /**
     * 实例的权重
     */
    private Integer Weight;

    public String getListenerId() {
        return ListenerId;
    }

    public void setListenerId(String listenerId) {
        ListenerId = listenerId;
    }

    public String getRegisterId() {
        return RegisterId;
    }

    public void setRegisterId(String registerId) {
        RegisterId = registerId;
    }

    public String getRealServerIp() {
        return RealServerIp;
    }

    public void setRealServerIp(String realServerIp) {
        RealServerIp = realServerIp;
    }

    public Integer getRealServerPort() {
        return RealServerPort;
    }

    public void setRealServerPort(Integer realServerPort) {
        RealServerPort = realServerPort;
    }

    public String getRealServerType() {
        return RealServerType;
    }

    public void setRealServerType(String realServerType) {
        RealServerType = realServerType;
    }

    public String getRealServerState() {
        return RealServerState;
    }

    public void setRealServerState(String realServerState) {
        RealServerState = realServerState;
    }

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }
}
