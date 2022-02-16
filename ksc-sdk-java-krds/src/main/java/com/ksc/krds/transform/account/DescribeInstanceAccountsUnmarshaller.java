package com.ksc.krds.transform.account;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.database.DescribeInstanceAccountsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeInstanceAccountsUnmarshaller implements Unmarshaller<RdsResponse, JsonUnmarshallerContext> {

    @Override
    public RdsResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), DescribeInstanceAccountsResponse.class);
    }
}
