package com.ksc.bill.contact.model.transform;

import com.ksc.bill.contact.model.ContactResponse;
import com.ksc.bill.contact.model.ContactResponseConversion;
import com.ksc.bill.contact.model.MailResult;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class MailResultUnmarshaller implements Unmarshaller<ContactResponse<MailResult>, JsonUnmarshallerContext> {

    @Override
    public ContactResponse<MailResult> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return ContactResponseConversion.invoke(in.getJsonParser(), MailResult.class);
    }
}
