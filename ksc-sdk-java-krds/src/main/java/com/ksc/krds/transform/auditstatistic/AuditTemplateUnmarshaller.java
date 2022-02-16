package com.ksc.krds.transform.auditstatistic;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        AuditTemplateResponse<List<AuditTemplateData>> response = new AuditTemplateResponse<List<AuditTemplateData>>();
        ObjectMapper objectMapper = RdsResponseConversion.createObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(in.getJsonParser());
        JsonNode data = jsonNode.get("data");
        List<AuditTemplateData> list = new ArrayList<AuditTemplateData>();
        response.setData(objectMapper.convertValue(data, list.getClass()));
        JsonNode size = jsonNode.get("size");
        if (size != null) {
            response.setSize(size.asInt());
        }
        JsonNode totalSize = jsonNode.get("totalSize");
        if (totalSize != null) {
            response.setTotalSize(totalSize.asInt());
        }
        JsonNode page = jsonNode.get("page");
        if (page != null) {
            response.setPage(page.asInt());
        }
        return response;
    }


}
