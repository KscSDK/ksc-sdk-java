package com.ksc.krds.transform.auditstatistic;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.auditstatistic.AuditHotStatisticResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.util.ArrayList;
import java.util.List;

public class AuditHotStatisticUnmarshaller implements Unmarshaller<RdsResponse<List<AuditHotStatisticResponse>>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<List<AuditHotStatisticResponse>> unmarshall(JsonUnmarshallerContext in) throws Exception {
        List<AuditHotStatisticResponse> list = new ArrayList<AuditHotStatisticResponse>();
        return (RdsResponse<List<AuditHotStatisticResponse>>)RdsResponseConversion.invoke(in.getJsonParser(), list.getClass());
    }

}
