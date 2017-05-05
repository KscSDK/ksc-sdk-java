
package com.ksc.network.slb.model;

import java.io.Serializable;

import lombok.ToString;

/**
 * <p>
 * Contains the output of ConfigureHealthCheck.
 * </p>
 */
@ToString
public class RegisterInstancesWithListenerResult implements Serializable, Cloneable {

	private String RequestId;

	private String RealServerIp;

    private Integer RealServerPort;

    private String RealServerState;

    private String RealServerType;

    private String RegisterId;

    private String ListenerId;

    private Integer Weight;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
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

    public String getRealServerState() {
        return RealServerState;
    }

    public void setRealServerState(String realServerState) {
        RealServerState = realServerState;
    }

    public String getRealServerType() {
        return RealServerType;
    }

    public void setRealServerType(String realServerType) {
        RealServerType = realServerType;
    }

    public String getRegisterId() {
        return RegisterId;
    }

    public void setRegisterId(String registerId) {
        RegisterId = registerId;
    }

    public String getListenerId() {
        return ListenerId;
    }

    public void setListenerId(String listenerId) {
        ListenerId = listenerId;
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

        RegisterInstancesWithListenerResult that = (RegisterInstancesWithListenerResult) o;

        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (RealServerIp != null ? !RealServerIp.equals(that.RealServerIp) : that.RealServerIp != null) return false;
        if (RealServerPort != null ? !RealServerPort.equals(that.RealServerPort) : that.RealServerPort != null)
            return false;
        if (RealServerState != null ? !RealServerState.equals(that.RealServerState) : that.RealServerState != null)
            return false;
        if (RealServerType != null ? !RealServerType.equals(that.RealServerType) : that.RealServerType != null)
            return false;
        if (RegisterId != null ? !RegisterId.equals(that.RegisterId) : that.RegisterId != null) return false;
        if (ListenerId != null ? !ListenerId.equals(that.ListenerId) : that.ListenerId != null) return false;
        return Weight != null ? Weight.equals(that.Weight) : that.Weight == null;
    }

    @Override
    public int hashCode() {
        int result = RequestId != null ? RequestId.hashCode() : 0;
        result = 31 * result + (RealServerIp != null ? RealServerIp.hashCode() : 0);
        result = 31 * result + (RealServerPort != null ? RealServerPort.hashCode() : 0);
        result = 31 * result + (RealServerState != null ? RealServerState.hashCode() : 0);
        result = 31 * result + (RealServerType != null ? RealServerType.hashCode() : 0);
        result = 31 * result + (RegisterId != null ? RegisterId.hashCode() : 0);
        result = 31 * result + (ListenerId != null ? ListenerId.hashCode() : 0);
        result = 31 * result + (Weight != null ? Weight.hashCode() : 0);
        return result;
    }

    @Override
    public RegisterInstancesWithListenerResult clone() {
        try {
            return (RegisterInstancesWithListenerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}