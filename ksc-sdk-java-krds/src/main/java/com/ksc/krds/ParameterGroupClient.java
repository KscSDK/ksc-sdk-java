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
        return invoke(new BaseMarshaller<CreateDBParameterGroupRequest>(CREATE_PARAMETER_GROUP),
                new CreateDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyDBParameterGroup(ModifyDBParameterGroupRequest request) {
        return invoke(new BaseMarshaller<ModifyDBParameterGroupRequest>(MODIFY_PARAMETER_GROUP),
                new ModifyDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse deleteDBParameterGroup(DeleteDBParameterGroupRequest request) {
        return invoke(new BaseMarshaller<DeleteDBParameterGroupRequest>(DELETE_PARAMETER_GROUP),
                new DeleteDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse resetDBParameterGroup(ResetDBParameterGroupRequest request){
        return invoke(new BaseMarshaller<ResetDBParameterGroupRequest>(RESET_PARAMETER_GROUP),
                new ResetDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeDBParameterGroupResponse> describeDBParameterGroup(DescribeDBParameterGroupRequest request){
        return invoke(new BaseMarshaller<DescribeDBParameterGroupRequest>(DESCRIBE_PARAMETER_GROUP),
                new DescribeDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest request){
        return invoke(new BaseMarshaller<DescribeEngineDefaultParametersRequest>(DESCRIBE_PARAMETER_GROUP),
                new DescribeDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

}
