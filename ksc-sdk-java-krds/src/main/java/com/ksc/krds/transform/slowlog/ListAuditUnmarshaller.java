package com.ksc.krds.transform.slowlog;

import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.slowlog.ExportListResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListAuditUnmarshaller implements Unmarshaller<ExportListResponse, JsonUnmarshallerContext> {
    @Override
    public ExportListResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke1(in.getJsonParser(), ExportListResponse.class);
    }
}
