package com.ksc.krds;

import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsInstance.ListKrdsRequest;
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

    public RdsResponse<ResetDBParameterGroupResponse> modifyDBParameterGroup(ModifyDBParameterGroupRequest request) {
        return invoke(new BaseMarshaller<ModifyDBParameterGroupRequest>(),
                new ModifyDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse deleteDBParameterGroup(DeleteDBParameterGroupRequest request) {
        return invoke(new BaseMarshaller<DeleteDBParameterGroupRequest>(),
                new DeleteDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<ModifyDBParameterGroupResponse> resetDBParameterGroup(ResetDBParameterGroupRequest request){
        return invoke(new BaseMarshaller<ResetDBParameterGroupRequest>(),
                new ResetDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeDBParameterGroupResponse> describeDBParameterGroup(DescribeDBParameterGroupRequest request){
        return invoke(new BaseMarshaller<DescribeDBParameterGroupRequest>(),
                new DescribeDBParameterGroupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeEngineDefaultParametersResponse> describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest request){
        return invoke(new BaseMarshaller<DescribeEngineDefaultParametersRequest>(),
                new DescribeEngineDefaultParametersUnmarshaller(), request).getKscResponse();
    }
    /*
     *   查看当前实例数据库参数运行值列表
     */
    public RdsResponse<DescribeDBInstanceParametersResponse> DescribeDBInstanceParameters(DescribeDBInstanceParametersRequest request){
        return invoke(new BaseMarshaller<DescribeDBInstanceParametersRequest>(),
                new DescribeDBInstanceParametersUnmarshaller(), request).getKscResponse();
    }
    /*
     *   参数组修改历史记录查询
     */
    public TDescribeDBParameterGroupModifyHistoryResponse DescribeEngineParametersModifyHistory(DescribeEngineParametersModifyHistoryRequest request){
        return invoke(new BaseMarshaller<DescribeEngineParametersModifyHistoryRequest>(),
                new DescribeEngineParametersModifyHistoryUnmarshaller(), request).getKscResponse();
    }

}
