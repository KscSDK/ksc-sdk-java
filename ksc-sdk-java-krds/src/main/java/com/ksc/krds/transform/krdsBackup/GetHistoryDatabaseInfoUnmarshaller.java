package com.ksc.krds.transform.krdsBackup;

import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsBackup.GetHistoryDatabaseInfoResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class GetHistoryDatabaseInfoUnmarshaller implements Unmarshaller<GetHistoryDatabaseInfoResponse, JsonUnmarshallerContext> {

    @Override
    public GetHistoryDatabaseInfoResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke1(in.getJsonParser(), GetHistoryDatabaseInfoResponse.class);
    }
}