package com.ksc.bill.billunion.model.transform;

import com.ksc.bill.billunion.model.response.InstanceSummaryResponse;
import com.ksc.bill.billunion.model.response.ResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class InstanceSummaryUnmarshaller implements Unmarshaller<InstanceSummaryResponse, JsonUnmarshallerContext> {

    @Override
    public InstanceSummaryResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return ResponseConversion.invokeInstanceSummary(in.getJsonParser());
    }
}
