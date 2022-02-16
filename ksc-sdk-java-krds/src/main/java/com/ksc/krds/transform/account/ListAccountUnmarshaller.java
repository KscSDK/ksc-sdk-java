package com.ksc.krds.transform.account;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.account.ListAccountResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListAccountUnmarshaller implements Unmarshaller<RdsResponse<ListAccountResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<ListAccountResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), ListAccountResponse.class);
    }

}
