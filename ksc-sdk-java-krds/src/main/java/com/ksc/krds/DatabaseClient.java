package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.database.*;
import com.ksc.krds.transform.database.*;
import com.ksc.krds.transform.account.ModifyAccountUnmarshaller;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;

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

    public RdsResponse deleteInstanceAccount(DeleteAccountRequest request){
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

    public RdsResponse deleteInstanceDatabase(DeleteDatabaseRequest request){
        return invoke(new BaseMarshaller<DeleteDatabaseRequest>(),
                new DeleteDatabaseUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyInstanceDatabaseInfo(ModifyDatabaseInfoRequest request){
        return invoke(new BaseMarshaller<ModifyDatabaseInfoRequest>(),
                new ModifyDatabaseInfoUnmarshaller(), request).getKscResponse();
    }
}
