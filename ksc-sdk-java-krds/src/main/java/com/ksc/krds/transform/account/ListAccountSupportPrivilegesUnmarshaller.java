package com.ksc.krds.transform.account;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.account.ListAccountSupportPrivilegesResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListAccountSupportPrivilegesUnmarshaller implements Unmarshaller<RdsResponse<ListAccountSupportPrivilegesResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<ListAccountSupportPrivilegesResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        RdsResponse<ListAccountSupportPrivilegesResponse> response = RdsResponseConversion.invoke(in.getJsonParser(), null);
        response.setData(RdsResponseConversion.invoke1(in.getJsonParser(), ListAccountSupportPrivilegesResponse.class));
        return response;
    }
}
