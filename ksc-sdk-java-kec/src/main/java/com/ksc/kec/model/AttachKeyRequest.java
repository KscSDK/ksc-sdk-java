package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.AttachKeyRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import com.ksc.internal.SdkInternalList;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class AttachKeyRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<AttachKeyRequest>{

    private static final long serialVersionUID = 1L;

    private SdkInternalList<String> InstanceIds;

    private SdkInternalList<String> KeyIds;


    @Override
	public Request<AttachKeyRequest> getDryRunRequest() {
    Request<AttachKeyRequest> request = new AttachKeyRequestMarshaller()
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
