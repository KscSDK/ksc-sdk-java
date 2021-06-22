package com.ksc.krds.transform.audit;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.audit.ListAuditDetailExportTaskResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListAuditDetailExportTaskUnmarshaller implements Unmarshaller<RdsResponse<ListAuditDetailExportTaskResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<ListAuditDetailExportTaskResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        RdsResponse<ListAuditDetailExportTaskResponse> response = RdsResponseConversion.invoke(in.getJsonParser(),null);
        response.setData(RdsResponseConversion.invoke1(in.getJsonParser(), ListAuditDetailExportTaskResponse.class));
        return response;
    }

}