package com.ksc.krds.transform.auditstatistic;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.auditstatistic.AuditHotDurationResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.util.ArrayList;
import java.util.List;

public class DescribeAuditHotDurationUnmarshaller implements Unmarshaller<RdsResponse<List<AuditHotDurationResponse>>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<List<AuditHotDurationResponse>> unmarshall(JsonUnmarshallerContext in) throws Exception {
        List<AuditHotDurationResponse> list = new ArrayList<AuditHotDurationResponse>();
        return (RdsResponse<List<AuditHotDurationResponse>>) RdsResponseConversion.invoke(in.getJsonParser(), list.getClass());
    }

}
