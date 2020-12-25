package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.internal.SdkInternalList;
import com.ksc.kec.model.transform.DetachKeyRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class DetachKeyRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<DetachKeyRequest>{

    private static final long serialVersionUID = 1L;

    private SdkInternalList<String> InstanceIds;

    private SdkInternalList<String> KeyIds;


    @Override
	public Request<DetachKeyRequest> getDryRunRequest() {
    Request<DetachKeyRequest> request = new DetachKeyRequestMarshaller()
        .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    public void withKeyIds(String... keyIds) {
        if (this.KeyIds == null) {
            setKeyIds(new com.ksc.internal.SdkInternalList<String>());
        }
        for (String ele : keyIds) {
            this.KeyIds.add(ele);
        }
    }

    public void withInstanceIds(String... instanceIds) {
        if (this.InstanceIds == null) {
            setInstanceIds(new com.ksc.internal.SdkInternalList<String>());
        }
        for (String ele : instanceIds) {
            this.InstanceIds.add(ele);
        }
    }

}
