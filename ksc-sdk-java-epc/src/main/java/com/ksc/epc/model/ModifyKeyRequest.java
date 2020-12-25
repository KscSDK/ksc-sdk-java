package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ModifyKeyRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyKey.
 * </p>
 */
@Data
public class ModifyKeyRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyKeyRequest> {

    /**
     * 密钥ID
     */
    private String keyId;
    /**
     * 密钥名称
     */
    private String keyName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyKeyRequest that = (ModifyKeyRequest) o;
        if (keyId != null ? !keyId.equals(that.keyId) : that.keyId != null)
            return false;
        if (keyName != null ? !keyName.equals(that.keyName) : that.keyName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (keyId != null ? keyId.hashCode() : 0);
        result = 31 * result + (keyName != null ? keyName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyKeyRequest> getDryRunRequest() {
        Request<ModifyKeyRequest> request = new ModifyKeyRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyKeyRequest clone() {
        return (ModifyKeyRequest) super.clone();
    }
}

