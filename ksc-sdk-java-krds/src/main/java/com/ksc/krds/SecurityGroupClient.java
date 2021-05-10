package com.ksc.krds;

import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsInstance.BaseRequest;
import com.ksc.krds.model.krdsInstance.InstanceResponse;
import com.ksc.krds.model.securityGroup.CreateSecurityGroupRequest;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.krds.transform.securityGroup.DescribeSecurityGroupJsonUnmarshaller;

public class SecurityGroupClient extends Client{

    public SecurityGroupClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }
    public KrdsResponse CreateSecurityGroupRule(CreateSecurityGroupRequest request){
        return null;
    }

    public <T extends BaseRequest> Response<InstanceResponse> doExecute(T in, BaseMarshaller<T> marshaller) {
        return execute(marshaller, new DescribeSecurityGroupJsonUnmarshaller(), in);
    }

}
