package com.ksc.network.dns.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateResourceRecord.
 * </p>
 */
@Data
public class CreateResourceRecordResult implements Serializable, Cloneable {

    private String RequestId;
    private ResourceRecord ResourceRecord;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateResourceRecordResult that = (CreateResourceRecordResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (ResourceRecord != null ? !ResourceRecord.equals(that.ResourceRecord) : that.ResourceRecord != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (ResourceRecord != null ? ResourceRecord.hashCode() : 0);
        return result;
    }


    @Override
    public CreateResourceRecordResult clone() {
        try {
            return (CreateResourceRecordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
