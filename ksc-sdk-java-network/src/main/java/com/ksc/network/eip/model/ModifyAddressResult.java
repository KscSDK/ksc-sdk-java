package com.ksc.network.eip.model;

import java.io.Serializable;

import com.ksc.network.vpc.model.Nat.AssociateNat;
import com.ksc.network.vpc.model.Nat.NatIp;

import lombok.ToString;

/**
 * <p>
 * Contains the output of CreateSubnet.
 * </p>
 */
@ToString
public class ModifyAddressResult implements Serializable, Cloneable {


    private String CreateTime;

    private String PublicIp;

    private String AllocationId;

    private String State;

    private String LineId;

    private Integer BandWidth;

    private String RequestId;

    private String InstanceType;

    private String InstanceId;

    private String NetworkInterfaceId;

    private String InternetGatewayId;

    private String BandWidthShareId;

    private Boolean IsBandWidthShare;

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getPublicIp() {
        return PublicIp;
    }

    public void setPublicIp(String publicIp) {
        PublicIp = publicIp;
    }

    public String getAllocationId() {
        return AllocationId;
    }

    public void setAllocationId(String allocationId) {
        AllocationId = allocationId;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getLineId() {
        return LineId;
    }

    public void setLineId(String lineId) {
        LineId = lineId;
    }

    public Integer getBandWidth() {
        return BandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        BandWidth = bandWidth;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getInstanceType() {
        return InstanceType;
    }

    public void setInstanceType(String instanceType) {
        InstanceType = instanceType;
    }

    public String getInstanceId() {
        return InstanceId;
    }

    public void setInstanceId(String instanceId) {
        InstanceId = instanceId;
    }

    public String getNetworkInterfaceId() {
        return NetworkInterfaceId;
    }

    public void setNetworkInterfaceId(String networkInterfaceId) {
        NetworkInterfaceId = networkInterfaceId;
    }

    public String getInternetGatewayId() {
        return InternetGatewayId;
    }

    public void setInternetGatewayId(String internetGatewayId) {
        InternetGatewayId = internetGatewayId;
    }

    public String getBandWidthShareId() {
        return BandWidthShareId;
    }

    public void setBandWidthShareId(String bandWidthShareId) {
        BandWidthShareId = bandWidthShareId;
    }

    public Boolean getIsBandWidthShare() {
        return IsBandWidthShare;
    }

    public void setIsBandWidthShare(Boolean bandWidthShare) {
        IsBandWidthShare = bandWidthShare;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyAddressResult that = (ModifyAddressResult) o;

        if (CreateTime != null ? !CreateTime.equals(that.CreateTime) : that.CreateTime != null) return false;
        if (PublicIp != null ? !PublicIp.equals(that.PublicIp) : that.PublicIp != null) return false;
        if (AllocationId != null ? !AllocationId.equals(that.AllocationId) : that.AllocationId != null) return false;
        if (State != null ? !State.equals(that.State) : that.State != null) return false;
        if (LineId != null ? !LineId.equals(that.LineId) : that.LineId != null) return false;
        if (BandWidth != null ? !BandWidth.equals(that.BandWidth) : that.BandWidth != null) return false;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (InstanceType != null ? !InstanceType.equals(that.InstanceType) : that.InstanceType != null) return false;
        if (InstanceId != null ? !InstanceId.equals(that.InstanceId) : that.InstanceId != null) return false;
        if (NetworkInterfaceId != null ? !NetworkInterfaceId.equals(that.NetworkInterfaceId) : that.NetworkInterfaceId != null)
            return false;
        if (InternetGatewayId != null ? !InternetGatewayId.equals(that.InternetGatewayId) : that.InternetGatewayId != null)
            return false;
        if (BandWidthShareId != null ? !BandWidthShareId.equals(that.BandWidthShareId) : that.BandWidthShareId != null)
            return false;
        return IsBandWidthShare != null ? IsBandWidthShare.equals(that.IsBandWidthShare) : that.IsBandWidthShare == null;
    }

    @Override
    public int hashCode() {
        int result = CreateTime != null ? CreateTime.hashCode() : 0;
        result = 31 * result + (PublicIp != null ? PublicIp.hashCode() : 0);
        result = 31 * result + (AllocationId != null ? AllocationId.hashCode() : 0);
        result = 31 * result + (State != null ? State.hashCode() : 0);
        result = 31 * result + (LineId != null ? LineId.hashCode() : 0);
        result = 31 * result + (BandWidth != null ? BandWidth.hashCode() : 0);
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (InstanceType != null ? InstanceType.hashCode() : 0);
        result = 31 * result + (InstanceId != null ? InstanceId.hashCode() : 0);
        result = 31 * result + (NetworkInterfaceId != null ? NetworkInterfaceId.hashCode() : 0);
        result = 31 * result + (InternetGatewayId != null ? InternetGatewayId.hashCode() : 0);
        result = 31 * result + (BandWidthShareId != null ? BandWidthShareId.hashCode() : 0);
        result = 31 * result + (IsBandWidthShare != null ? IsBandWidthShare.hashCode() : 0);
        return result;
    }

    @Override
    public ModifyAddressResult clone() {
        try {
            return (ModifyAddressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}