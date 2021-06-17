package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsInstance.ListZoneResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListZoneUnmarshaller implements Unmarshaller<RdsResponse<ListZoneResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<ListZoneResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(),ListZoneResponse.class);
    }

}
