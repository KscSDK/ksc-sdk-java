package com.ksc.network.eip.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.eip.model.transform.AllocateAddressRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AllocateAddress.
 * </p>
 */
public class AllocateAddressRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AllocateAddressRequest> {


    /**
     * 线路类型的ID
     */
    private String LineId;

    /**
     * 弹性IP的带宽
     */
    private Integer BandWidth;
    
    /**
     * 弹性IP的计费类型，包年包月Monthly，有到期时间，只能升带宽。按峰值月结Peak，无到期时间，可升降带宽。按日月结Daily，无到期时间，可升降带宽。
     */
    private String ChargeType;
    
    /**
     * 购买时长，只有包年包月时不可缺省。
     */
    private Integer PurchaseTime;

    /**
     * 项目的ID
     */
    private String projectId;

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

	public String getChargeType() {
		return ChargeType;
	}

	public void setChargeType(String chargeType) {
		ChargeType = chargeType;
	}

	public Integer getPurchaseTime() {
		return PurchaseTime;
	}

	public void setPurchaseTime(Integer purchaseTime) {
		PurchaseTime = purchaseTime;
	}

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AllocateAddressRequest that = (AllocateAddressRequest) o;

        if (LineId != null ? !LineId.equals(that.LineId) : that.LineId != null) return false;
        if (BandWidth != null ? !BandWidth.equals(that.BandWidth) : that.BandWidth != null) return false;
        if (ChargeType != null ? !ChargeType.equals(that.ChargeType) : that.ChargeType != null) return false;
        if (PurchaseTime != null ? !PurchaseTime.equals(that.PurchaseTime) : that.PurchaseTime != null) return false;
        return projectId != null ? projectId.equals(that.projectId) : that.projectId == null;
    }

    @Override
    public int hashCode() {
        int result = LineId != null ? LineId.hashCode() : 0;
        result = 31 * result + (BandWidth != null ? BandWidth.hashCode() : 0);
        result = 31 * result + (ChargeType != null ? ChargeType.hashCode() : 0);
        result = 31 * result + (PurchaseTime != null ? PurchaseTime.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        return result;
    }

    @Override
    public AllocateAddressRequest clone() {
        return (AllocateAddressRequest) super.clone();
    }
	
    @Override
    public Request<AllocateAddressRequest> getDryRunRequest() {
        Request<AllocateAddressRequest> request = new AllocateAddressRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}