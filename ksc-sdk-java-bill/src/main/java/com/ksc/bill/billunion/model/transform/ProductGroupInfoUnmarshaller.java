package com.ksc.bill.billunion.model.transform;

import com.ksc.bill.billunion.model.response.ProductGroupInfoResponse;
import com.ksc.bill.billunion.model.response.ResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class ProductGroupInfoUnmarshaller implements Unmarshaller<ProductGroupInfoResponse, JsonUnmarshallerContext> {

    @Override
    public ProductGroupInfoResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return ResponseConversion.invokeProductGroupInfo(in.getJsonParser());
    }
}
