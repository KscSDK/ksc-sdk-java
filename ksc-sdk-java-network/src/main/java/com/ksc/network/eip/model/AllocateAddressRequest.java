package com.ksc.network.eip.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.eip.model.transform.AllocateAddressRequestMarshaller;
import com.ksc.network.vpc.model.subnet.CreateSubnetRequest;
import com.ksc.network.vpc.transform.SecurityGroups.AuthorizeSecurityGroupEntryRequestMarshaller;
import com.ksc.network.vpc.transform.SecurityGroups.CreateSecurityGroupRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.CreateSubnetRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.DescribeVpcsRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AuthorizeSecurityGroupEntry.
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((BandWidth == null) ? 0 : BandWidth.hashCode());
		result = prime * result
				+ ((ChargeType == null) ? 0 : ChargeType.hashCode());
		result = prime * result + ((LineId == null) ? 0 : LineId.hashCode());
		result = prime * result
				+ ((PurchaseTime == null) ? 0 : PurchaseTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AllocateAddressRequest other = (AllocateAddressRequest) obj;
		if (BandWidth == null) {
			if (other.BandWidth != null)
				return false;
		} else if (!BandWidth.equals(other.BandWidth))
			return false;
		if (ChargeType == null) {
			if (other.ChargeType != null)
				return false;
		} else if (!ChargeType.equals(other.ChargeType))
			return false;
		if (LineId == null) {
			if (other.LineId != null)
				return false;
		} else if (!LineId.equals(other.LineId))
			return false;
		if (PurchaseTime == null) {
			if (other.PurchaseTime != null)
				return false;
		} else if (!PurchaseTime.equals(other.PurchaseTime))
			return false;
		return true;
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