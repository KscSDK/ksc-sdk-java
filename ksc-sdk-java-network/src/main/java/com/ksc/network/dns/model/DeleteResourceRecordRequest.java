package com.ksc.network.dns.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.dns.model.transform.DeleteResourceRecordRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteResourceRecord.
 * </p>
 */
@Data
public class DeleteResourceRecordRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteResourceRecordRequest> {

    /**
     * 域名记录的ID
     */
    private String resourceRecordId;
    /**
     * 域名的ID
     */
    private String hostedZoneId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteResourceRecordRequest that = (DeleteResourceRecordRequest) o;
        if (resourceRecordId != null ? !resourceRecordId.equals(that.resourceRecordId) : that.resourceRecordId != null)
            return false;
        if (hostedZoneId != null ? !hostedZoneId.equals(that.hostedZoneId) : that.hostedZoneId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (resourceRecordId != null ? resourceRecordId.hashCode() : 0);
        result = 31 * result + (hostedZoneId != null ? hostedZoneId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteResourceRecordRequest> getDryRunRequest() {
        Request<DeleteResourceRecordRequest> request = new DeleteResourceRecordRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteResourceRecordRequest clone() {
        return (DeleteResourceRecordRequest) super.clone();
    }
}

