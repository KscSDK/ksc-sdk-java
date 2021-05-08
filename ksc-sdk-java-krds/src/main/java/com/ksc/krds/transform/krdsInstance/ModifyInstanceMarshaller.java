package com.ksc.krds.transform.krdsInstance;


import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.ModifyInstanceRequest;
import com.ksc.krds.transform.ActionEnum;

public class ModifyInstanceMarshaller extends BaseMarshaller<ModifyInstanceRequest> {


    private ModifyInstanceMarshaller(ActionEnum action, HttpMethodName method) {
        super(action, method);
    }

    @Override
    public Request<ModifyInstanceRequest> marshall(ModifyInstanceRequest param) throws Exception {
        return super.marshall(param);
    }

    public static ModifyInstanceMarshaller instance(){
        return new ModifyInstanceMarshaller(ActionEnum.MODIFY, HttpMethodName.GET);
    }

}
