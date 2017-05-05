package com.ksc.network.slb.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.ConfigureHealthCheckRequestMarshaller;
import com.ksc.network.slb.model.transform.RegisterInstancesWithListenerRequestMarshaller;

/**
 * <p>
 * Contains the parameters for RegisterInstancesWithListener.
 * </p>
 */
public class RegisterInstancesWithListenerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<RegisterInstancesWithListenerRequest> {


    /**
     * 监听器的ID
     */
    private String ListenerId;
    /**
     * 真实服务器的IP，TCP类型传的是主机的IP，HTTP和HTTPS类型传的是弹性IP
     */
    private String RealServerIp;
    /**
     * 真实服务器的端口，TCP类型传的是主机的端口，HTTP和HTTPS类型传的是弹性IP的端口
     */
    private Integer RealServerPort;
    /**
     * 真实服务器的类型，TCP类型是host，HTTP和HTTPS类型中的IP映射是Ipfwd
     */
    private String RealServerType;
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

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegisterInstancesWithListenerRequest that = (RegisterInstancesWithListenerRequest) o;

        if (ListenerId != null ? !ListenerId.equals(that.ListenerId) : that.ListenerId != null) return false;
        if (RealServerIp != null ? !RealServerIp.equals(that.RealServerIp) : that.RealServerIp != null) return false;
        if (RealServerPort != null ? !RealServerPort.equals(that.RealServerPort) : that.RealServerPort != null)
            return false;
        if (RealServerType != null ? !RealServerType.equals(that.RealServerType) : that.RealServerType != null)
            return false;
        return Weight != null ? Weight.equals(that.Weight) : that.Weight == null;
    }

    @Override
    public int hashCode() {
        int result = ListenerId != null ? ListenerId.hashCode() : 0;
        result = 31 * result + (RealServerIp != null ? RealServerIp.hashCode() : 0);
        result = 31 * result + (RealServerPort != null ? RealServerPort.hashCode() : 0);
        result = 31 * result + (RealServerType != null ? RealServerType.hashCode() : 0);
        result = 31 * result + (Weight != null ? Weight.hashCode() : 0);
        return result;
    }

    @Override
    public RegisterInstancesWithListenerRequest clone() {
        return (RegisterInstancesWithListenerRequest) super.clone();
    }

    @Override
    public Request<RegisterInstancesWithListenerRequest> getDryRunRequest() {
        Request<RegisterInstancesWithListenerRequest> request = new RegisterInstancesWithListenerRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}