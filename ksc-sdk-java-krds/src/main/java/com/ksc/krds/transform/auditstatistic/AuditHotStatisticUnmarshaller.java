package com.ksc.krds.transform.auditstatistic;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.auditstatistic.AuditHotStatisticResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class AuditHotStatisticUnmarshaller implements Unmarshaller<RdsResponse<AuditHotStatisticResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<AuditHotStatisticResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), AuditHotStatisticResponse.class);
    }

}
