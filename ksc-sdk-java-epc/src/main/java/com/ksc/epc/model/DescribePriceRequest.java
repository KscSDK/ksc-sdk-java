package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribePriceRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribePrice.
 * </p>
 */
@Data
public class DescribePriceRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribePriceRequest> {

    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 机型
     */
    private String hostType;
    /**
     * 计费方式
     */
    private String chargeType;
    /**
     * 购买时长
     */
    private String purchaseTime;
    /**
     * 数量
     */
    private Integer amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribePriceRequest that = (DescribePriceRequest) o;
        if (availabilityZone != null ? !availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null)
            return false;
        if (hostType != null ? !hostType.equals(that.hostType) : that.hostType != null)
            return false;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null)
            return false;
        if (purchaseTime != null ? !purchaseTime.equals(that.purchaseTime) : that.purchaseTime != null)
            return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (availabilityZone != null ? availabilityZone.hashCode() : 0);
        result = 31 * result + (hostType != null ? hostType.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (purchaseTime != null ? purchaseTime.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DescribePriceRequest> getDryRunRequest() {
        Request<DescribePriceRequest> request = new DescribePriceRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribePriceRequest clone() {
        return (DescribePriceRequest) super.clone();
    }
}

