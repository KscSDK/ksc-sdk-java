package com.ksc.krds.transform.krdsInstance;

import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.SwitchHARequest;
import com.ksc.krds.transform.ActionEnum;

public class SwitchHAMarshaller extends BaseMarshaller<SwitchHARequest> {

    public SwitchHAMarshaller(ActionEnum action, HttpMethodName method) {
        super(action, method);
    }

    @Override
    public Request<SwitchHARequest> marshall(SwitchHARequest in) throws Exception {
        return super.marshall(in);
    }

    public static SwitchHAMarshaller instance() {
        return new SwitchHAMarshaller(ActionEnum.SWITCH_HA, HttpMethodName.GET);
    }

}
