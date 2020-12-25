package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeEpcDeviceAttributes.
 * </p>
 */
@Data
public class DescribeEpcDeviceAttributesResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<DeviceAttribute> EpcDeviceAttributeSet;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeEpcDeviceAttributesResult that = (DescribeEpcDeviceAttributesResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (EpcDeviceAttributeSet != null ? !EpcDeviceAttributeSet.equals(that.EpcDeviceAttributeSet) : that.EpcDeviceAttributeSet != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (EpcDeviceAttributeSet != null ? EpcDeviceAttributeSet.hashCode() : 0);
        result = 31 * result + (NextToken != null ? NextToken.hashCode() : 0);
        return result;
    }

    public void addEpcDeviceAttributeSet(DeviceAttribute... deviceAttributes) {
		if (this.EpcDeviceAttributeSet == null) {
			this.EpcDeviceAttributeSet = new SdkInternalList<DeviceAttribute>();
		}
		for (DeviceAttribute deviceAttribute : deviceAttributes) {
			this.EpcDeviceAttributeSet.add(deviceAttribute);
		}
	}

    public void setEpcDeviceAttributeSet(List<DeviceAttribute> deviceAttributes) {
        this.EpcDeviceAttributeSet = new SdkInternalList<DeviceAttribute>(deviceAttributes);
    }

    @Override
    public DescribeEpcDeviceAttributesResult clone() {
        try {
            return (DescribeEpcDeviceAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
