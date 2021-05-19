package com.ksc.krds.transform.auditstatistic;

import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.auditstatistic.AuditTemplateData;
import com.ksc.krds.model.auditstatistic.AuditTemplateResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.util.ArrayList;
import java.util.List;

public class AuditTemplateUnmarshaller implements Unmarshaller<AuditTemplateResponse<List<AuditTemplateData>>, JsonUnmarshallerContext> {
    @Override
    public AuditTemplateResponse<List<AuditTemplateData>> unmarshall(JsonUnmarshallerContext in) throws Exception {
        List<AuditTemplateData> list = new ArrayList<AuditTemplateData>();
        return (AuditTemplateResponse<List<AuditTemplateData>>) RdsResponseConversion.invoke(in.getJsonParser(), list.getClass());
    }
}
