package com.ksc.krds.transform.krdsInstance;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: ModifyDBNetworkUnmarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class ModifyDBNetworkUnmarshaller  implements Unmarshaller<RdsResponse, JsonUnmarshallerContext> {

    @Override
    public RdsResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(),null);
    }
}
