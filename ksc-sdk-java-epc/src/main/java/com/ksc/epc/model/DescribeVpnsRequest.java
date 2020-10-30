package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribeVpnsRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeVpns.
 * </p>
 */
@Data
public class DescribeVpnsRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeVpnsRequest> {

    /**
     * 带外管理ID
     */
    private String remoteManagementId;
    /**
     * 动态码
     */
    private String dynamicCode;
    /**
     * PIN码
     */
    private String pin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeVpnsRequest that = (DescribeVpnsRequest) o;
        if (remoteManagementId != null ? !remoteManagementId.equals(that.remoteManagementId) : that.remoteManagementId != null)
            return false;
        if (dynamicCode != null ? !dynamicCode.equals(that.dynamicCode) : that.dynamicCode != null)
            return false;
        if (pin != null ? !pin.equals(that.pin) : that.pin != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (remoteManagementId != null ? remoteManagementId.hashCode() : 0);
        result = 31 * result + (dynamicCode != null ? dynamicCode.hashCode() : 0);
        result = 31 * result + (pin != null ? pin.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DescribeVpnsRequest> getDryRunRequest() {
        Request<DescribeVpnsRequest> request = new DescribeVpnsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeVpnsRequest clone() {
        return (DescribeVpnsRequest) super.clone();
    }
}

