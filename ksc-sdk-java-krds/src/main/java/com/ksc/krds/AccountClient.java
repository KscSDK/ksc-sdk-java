package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.account.*;
import com.ksc.krds.transform.account.*;
import com.ksc.krds.transform.audit.ListAuditUnmarshaller;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;

public class AccountClient extends Client{

    public AccountClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse<ListAccountResponse> listAccount(ListAccountRequest request){
        return invoke(new BaseMarshaller<ListAccountRequest>(),
                new ListAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeAccountResponse> createAccount(CreateAccountRequest request){
        return invoke(new BaseMarshaller<CreateAccountRequest>(),
                new CreateAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeAccountResponse> describeAccount(DescribeAccountRequest request){
        return invoke(new BaseMarshaller<DescribeAccountRequest>(),
                new DescribeAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeAccountResponse> modifyAccount(ModifyAccountRequest request){
        return invoke(new BaseMarshaller<ModifyAccountRequest>(),
                new ModifyAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<ListAccountSupportPrivilegesResponse> listAccountSupportPrivileges(ListAccountSupportPrivilegesRequest request){
        return invoke(new BaseMarshaller<ListAccountSupportPrivilegesRequest>(),
                new ListAccountSupportPrivilegesUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse deleteAccount(DeleteAccountRequest request){
        return invoke(new BaseMarshaller<DeleteAccountRequest>(),
                new DeleteAccountUnmarshaller(), request).getKscResponse();
    }
}
