package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.ModifyInstancesWithListenerRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyInstancesWithListener.
 * </p>
 */
public class ModifyInstancesWithListenerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyInstancesWithListenerRequest> {


    /**
     * 监听器和主机绑定的ID
     */
    private String RegisterId;
    /**
     * 真实服务器的端口，TCP类型传的是主机的端口，HTTP类型传的是弹性IP的端口，端口映射是不可以修改的。
     */
    private Integer RealServerPort;
    /**
     * 实例的权重
     */
    private Integer Weight;

    public String getRegisterId() {
        return RegisterId;
    }

    public void setRegisterId(String registerId) {
        RegisterId = registerId;
    }

    public Integer getRealServerPort() {
        return RealServerPort;
    }

    public void setRealServerPort(Integer realServerPort) {
        RealServerPort = realServerPort;
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

        ModifyInstancesWithListenerRequest that = (ModifyInstancesWithListenerRequest) o;

        if (RegisterId != null ? !RegisterId.equals(that.RegisterId) : that.RegisterId != null) return false;
        if (RealServerPort != null ? !RealServerPort.equals(that.RealServerPort) : that.RealServerPort != null)
            return false;
        return Weight != null ? Weight.equals(that.Weight) : that.Weight == null;
    }

    @Override
    public int hashCode() {
        int result = RegisterId != null ? RegisterId.hashCode() : 0;
        result = 31 * result + (RealServerPort != null ? RealServerPort.hashCode() : 0);
        result = 31 * result + (Weight != null ? Weight.hashCode() : 0);
        return result;
    }

    @Override
    public ModifyInstancesWithListenerRequest clone() {
        return (ModifyInstancesWithListenerRequest) super.clone();
    }

    @Override
    public Request<ModifyInstancesWithListenerRequest> getDryRunRequest() {
        Request<ModifyInstancesWithListenerRequest> request = new ModifyInstancesWithListenerRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}