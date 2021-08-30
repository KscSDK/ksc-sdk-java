package com.ksc.bill.contact.client;

import com.ksc.bill.contact.model.ContactResponse;
import com.ksc.bill.contact.model.MailRequest;
import com.ksc.bill.contact.model.MailResult;

public interface KSCCONTACT {

    /**
     * see details in https://docs.ksyun.com/documents/40148
     *
     * @return the mailbox result object
     */
    ContactResponse<MailResult> queryMailInList(MailRequest request);
}
