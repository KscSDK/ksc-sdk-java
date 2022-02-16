package com.ksc.bill.billunion.model.request;

import com.ksc.KscWebServiceRequest;

/**
 * https://docs.ksyun.com/documents/39112
 * @author chenhetong
 * @since 2021/7/23
 */
public class SummaryRequest extends KscWebServiceRequest {
    /**
     * the begin time of the bill month format is yyyy-MM
     */
    private String BillBeginMonth;
    private String BillEndMonth;

    public SummaryRequest(String billBeginMonth, String billEndMonth) {
        BillBeginMonth = billBeginMonth;
        BillEndMonth = billEndMonth;
    }

    public String getBillBeginMonth() {
        return BillBeginMonth;
    }

    public void setBillBeginMonth(String billBeginMonth) {
        BillBeginMonth = billBeginMonth;
    }

    public String getBillEndMonth() {
        return BillEndMonth;
    }

    public void setBillEndMonth(String billEndMonth) {
        BillEndMonth = billEndMonth;
    }
}
