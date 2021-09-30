package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.database.*;
import com.ksc.krds.transform.ActionEnum;
import com.ksc.krds.transform.database.*;
import com.ksc.krds.transform.account.ModifyAccountUnmarshaller;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.krds.transform.krdsInstance.CreateInstanceAccountActionMarshaller;
import com.ksc.krds.transform.krdsInstance.ModifyInstanceAccountPrivilegesActionMarshaller;
import lombok.SneakyThrows;

public class DatabaseClient extends Client{

    public DatabaseClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse createAccount(CreateAccountRequest request){
        return invoke(new BaseMarshaller<CreateAccountRequest>(),
                new CreateAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeAccountResponse> describeAccount(DescribeAccountRequest request){
        return invoke(new BaseMarshaller<DescribeAccountRequest>(),
                new DescribeAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyInstanceAccountPassword(ModifyAccountPasswordRequest request){
        return invoke(new BaseMarshaller<ModifyAccountPasswordRequest>(),
                new ModifyAccountPasswordUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyInstanceAccount(ModifyAccountRequest request){
        return invoke(new BaseMarshaller<ModifyAccountRequest>(),
                new ModifyAccountUnmarshaller(), request).getKscResponse();
    }
    /*
     *数据库帐号-删除   原接口名 [deleteInstanceAccount]
     */
    public RdsResponse DeleteInstanceAccountAction(DeleteAccountRequest request){
        return invoke(new BaseMarshaller<DeleteAccountRequest>(),
                new DeleteAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<GetMysqlCollationsResponse> describeCollations(InstanceRequest request){
        return invoke(new BaseMarshaller<InstanceRequest>(),
                new InstanceUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse createInstanceDatabase(CreateDatabaseRequest request){
        return invoke(new BaseMarshaller<CreateDatabaseRequest>(),
                new CreateDatabaseUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyInstanceDatabasePrivileges(ModifyDatabasePrivilegesRequest request){
        return invoke(new BaseMarshaller<ModifyDatabasePrivilegesRequest>(),
                new ModifyDatabasePrivilegesUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeDatabaseResponse> describeInstanceDatabases(DescribeDatabaseRequest request){
        return invoke(new BaseMarshaller<DescribeDatabaseRequest>(),
                new DescribeDatabaseUnmarshaller(), request).getKscResponse();
    }

    /*
     * 数据库库表-删除数据库  [原接口名]deleteInstanceDatabase
     **/
    public RdsResponse DeleteInstanceDatabaseAction(DeleteDatabaseRequest request){
        return invoke(new BaseMarshaller<DeleteDatabaseRequest>(),
                new DeleteDatabaseUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyInstanceDatabaseInfo(ModifyDatabaseInfoRequest request){
        return invoke(new BaseMarshaller<ModifyDatabaseInfoRequest>(),
                new ModifyDatabaseInfoUnmarshaller(), request).getKscResponse();
    }

    /*
    *    数据库账号 列表
    **/
    public RdsResponse<DescribeInstanceAccountsResponse> DescribeInstanceAccounts(DescribeAccountRequest request){
        return invoke(new BaseMarshaller<DescribeAccountRequest>(),
                new DescribeInstanceAccountsUnmarshaller(), request).getKscResponse();
    }

    /*
     *   数据库账号-修改/重置密码
     **/
    public RdsResponse ModifyInstanceAccountInfo(ModifyAccountPasswordRequest request){
        return invoke(new BaseMarshaller<ModifyAccountPasswordRequest>(),
                new ModifyInstanceAccountInfoUnmarshaller(), request).getKscResponse();
    }

    //TODO  待实现
    /*
    *   数据库账号-创建/克隆
    */
    /*@SneakyThrows
    public RdsResponse CreateInstanceAccountAction(CreateInstanceAccountActionRequest request){
       return invoke((BaseMarshaller<CreateInstanceAccountActionRequest>) new CreateInstanceAccountActionMarshaller().marshall(super.beforeMarshalling(request)),
                new CreateInstanceAccountActionUnmarshaller(), request).getKscResponse();
        *//*return invoke(new CreateInstanceAccountActionMarshaller().marshall(super.beforeMarshalling(request)),
                new CreateInstanceAccountActionUnmarshaller()).getKscResponse();*//*
    }*/

    //TODO   待实现
    /*
     *   数据库账号-授权
     */
    /*@SneakyThrows
    public RdsResponse ModifyInstanceAccountPrivilegesAction(ModifyInstanceAccountPrivilegesActionRequest request){
        return invoke(new ModifyInstanceAccountPrivilegesActionMarshaller(),
                new ModifyInstanceAccountPrivilegesActionUnmarshaller(), request).getKscResponse();

    }*/




}
