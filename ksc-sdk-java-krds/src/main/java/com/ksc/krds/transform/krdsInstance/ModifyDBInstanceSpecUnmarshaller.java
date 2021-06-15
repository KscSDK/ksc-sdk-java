package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.ModifyInstanceTypeResp;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ModifyDBInstanceSpecUnmarshaller implements Unmarshaller<RdsResponse<ModifyInstanceTypeResp>, JsonUnmarshallerContext> {
    @Override
    public RdsResponse<ModifyInstanceTypeResp> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), ModifyInstanceTypeResp.class);
    }
}
