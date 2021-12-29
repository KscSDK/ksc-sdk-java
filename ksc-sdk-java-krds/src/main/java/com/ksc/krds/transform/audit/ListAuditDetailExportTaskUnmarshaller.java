package com.ksc.krds.transform.audit;

import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.audit.ListAuditDetailExportTaskResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListAuditDetailExportTaskUnmarshaller implements Unmarshaller<ListAuditDetailExportTaskResponse, JsonUnmarshallerContext> {

    @Override
    public ListAuditDetailExportTaskResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        ListAuditDetailExportTaskResponse response = RdsResponseConversion.invoke1(in.getJsonParser(),ListAuditDetailExportTaskResponse.class);
        return response;
    }
}