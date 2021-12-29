package com.ksc.krds.transform.krdsBackup;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsBackup.GetTableRestorableTimeResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class GetTableRestorableTimeUnmarshaller implements Unmarshaller<GetTableRestorableTimeResponse, JsonUnmarshallerContext> {

    @Override
    public GetTableRestorableTimeResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke1(in.getJsonParser(), GetTableRestorableTimeResponse.class);
    }
}