package com.ksc.krds.transform.audit;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.audit.AuditStatisticResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class AuditStatisticUnmarshaller implements Unmarshaller<RdsResponse<AuditStatisticResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<AuditStatisticResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        RdsResponse<AuditStatisticResponse> response = new RdsResponse<AuditStatisticResponse>();
        response.setData(RdsResponseConversion.invoke1(in.getJsonParser(), AuditStatisticResponse.class));
        return response;
    }

}
