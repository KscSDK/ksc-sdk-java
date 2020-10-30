package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ImportKeyRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ImportKey.
 * </p>
 */
@Data
public class ImportKeyRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ImportKeyRequest> {

    /**
     * 密钥名称
     */
    private String keyName;
    /**
     * 公钥
     */
    private String publicKey;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ImportKeyRequest that = (ImportKeyRequest) o;
        if (keyName != null ? !keyName.equals(that.keyName) : that.keyName != null)
            return false;
        if (publicKey != null ? !publicKey.equals(that.publicKey) : that.publicKey != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (keyName != null ? keyName.hashCode() : 0);
        result = 31 * result + (publicKey != null ? publicKey.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ImportKeyRequest> getDryRunRequest() {
        Request<ImportKeyRequest> request = new ImportKeyRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ImportKeyRequest clone() {
        return (ImportKeyRequest) super.clone();
    }
}

