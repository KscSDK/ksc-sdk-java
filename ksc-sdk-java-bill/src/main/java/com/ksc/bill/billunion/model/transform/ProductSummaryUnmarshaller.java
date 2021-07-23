package com.ksc.bill.billunion.model.transform;

import com.ksc.bill.billunion.model.response.ProductSummaryItem;
import com.ksc.bill.billunion.model.response.ResponseConversion;
import com.ksc.bill.billunion.model.response.SummaryResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class ProductSummaryUnmarshaller implements Unmarshaller<SummaryResponse<ProductSummaryItem>, JsonUnmarshallerContext> {

    @Override
    public SummaryResponse<ProductSummaryItem> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return ResponseConversion.invoke(in.getJsonParser(), ProductSummaryItem.class);
    }
}
