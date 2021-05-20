package com.ksc.krds.transform.database;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.database.DescribeDatabaseResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeDatabaseUnmarshaller implements Unmarshaller<RdsResponse<DescribeDatabaseResponse>, JsonUnmarshallerContext> {
    @Override
    public RdsResponse<DescribeDatabaseResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(),DescribeDatabaseResponse.class);
    }
}
