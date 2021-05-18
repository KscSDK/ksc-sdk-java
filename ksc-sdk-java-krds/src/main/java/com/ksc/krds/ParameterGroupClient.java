package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.parametergroup.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.krds.transform.parametergroup.*;

import static com.ksc.krds.transform.ActionEnum.*;

public class ParameterGroupClient extends Client {

    public ParameterGroupClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse<CreateDBParameterGroupResponse> createDBParameterGroup(CreateDBParameterGroupRequest request) {
        return invoke(new BaseMarshaller<CreateDBParameterGroupRequest>(),
                new CreateDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyDBParameterGroup(ModifyDBParameterGroupRequest request) {
        return invoke(new BaseMarshaller<ModifyDBParameterGroupRequest>(),
                new ModifyDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse deleteDBParameterGroup(DeleteDBParameterGroupRequest request) {
        return invoke(new BaseMarshaller<DeleteDBParameterGroupRequest>(),
                new DeleteDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse resetDBParameterGroup(ResetDBParameterGroupRequest request){
        return invoke(new BaseMarshaller<ResetDBParameterGroupRequest>(),
                new ResetDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeDBParameterGroupResponse> describeDBParameterGroup(DescribeDBParameterGroupRequest request){
        return invoke(new BaseMarshaller<DescribeDBParameterGroupRequest>(),
                new DescribeDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest request){
        return invoke(new BaseMarshaller<DescribeEngineDefaultParametersRequest>(),
                new DescribeDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

}
