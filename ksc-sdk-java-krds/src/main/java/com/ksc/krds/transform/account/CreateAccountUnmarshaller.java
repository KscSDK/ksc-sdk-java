package com.ksc.krds.transform.account;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.account.DescribeAccountResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CreateAccountUnmarshaller implements Unmarshaller<RdsResponse<DescribeAccountResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<DescribeAccountResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), DescribeAccountResponse.class);
    }

}
