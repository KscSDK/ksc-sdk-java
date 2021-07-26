package com.ksc.bill.billunion.model.request;

import com.ksc.KscWebServiceRequest;

/**
 *
 *  https://docs.ksyun.com/documents/39116
 * @author chenhetong
 * @since 2021/7/23
 */
public class InstanceSummaryRequest extends KscWebServiceRequest {
    /**
     * yyyy-MM
     */
    private String BillMonth;
    private String ProductCode;
    private Integer Page = 1;
    private Integer Size = 20;

    public InstanceSummaryRequest(String billMonth) {
        BillMonth = billMonth;
    }

    public String getBillMonth() {
        return BillMonth;
    }

    public void setBillMonth(String billMonth) {
        BillMonth = billMonth;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public Integer getPage() {
        return Page;
    }

    public void setPage(Integer page) {
        Page = page;
    }

    public Integer getSize() {
        return Size;
    }

    public void setSize(Integer size) {
        Size = size;
    }
}
