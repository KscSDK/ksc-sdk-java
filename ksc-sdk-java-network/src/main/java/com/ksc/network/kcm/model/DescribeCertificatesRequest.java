package com.ksc.network.kcm.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import lombok.Data;

import java.io.Serializable;

@Data
public class DescribeCertificatesRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeCertificatesRequest> {

    private static final long serialVersionUID = 2681670918913999259L;

    /**
     * <p>
     * 证书的ID
     * </p>
     * <p>
     * Default: 描述region下所有的证书信息
     * </p>
     */
    private com.ksc.internal.SdkInternalList<String> certificateIds;

    @Override
    public Request<DescribeCertificatesRequest> getDryRunRequest() {
        return null;
    }
}
