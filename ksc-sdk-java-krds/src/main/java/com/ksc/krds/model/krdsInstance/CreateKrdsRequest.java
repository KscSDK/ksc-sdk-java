package com.ksc.krds.model.krdsInstance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.krdsInstance.CreateKrdsMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CreateKrdsRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<CreateKrdsRequest> {

    private String DBInstanceClass;
    private String DBInstanceName;
    private String Engine;
    private String EngineVersion;
    private String MasterUserPassword;
    private String MasterUserName;
    private String DBInstanceType;
    private String VpcId;
    private String SubnetId;

    public Request<CreateKrdsRequest> getDryRunRequest() {
        Request<CreateKrdsRequest> request = new CreateKrdsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}