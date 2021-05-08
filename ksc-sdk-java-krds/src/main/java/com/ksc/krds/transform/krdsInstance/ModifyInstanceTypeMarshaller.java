package com.ksc.krds.transform.krdsInstance;

import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.transform.ActionEnum;

public class ModifyInstanceTypeMarshaller extends BaseMarshaller<ModifyInstanceTypeMarshaller>{

    public ModifyInstanceTypeMarshaller(ActionEnum action, HttpMethodName method) {
        super(action, method);
    }

    @Override
    public Request<ModifyInstanceTypeMarshaller> marshall(ModifyInstanceTypeMarshaller in) throws Exception {
        return super.marshall(in);
    }

    public static ModifyInstanceTypeMarshaller instance(){
        return new ModifyInstanceTypeMarshaller(ActionEnum.MODIFY_TYPE,HttpMethodName.GET);
    }
}
