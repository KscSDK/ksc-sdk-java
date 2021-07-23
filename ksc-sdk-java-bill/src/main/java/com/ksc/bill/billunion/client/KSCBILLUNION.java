package com.ksc.bill.billunion.client;

import com.ksc.bill.billunion.model.request.InstanceSummaryRequest;
import com.ksc.bill.billunion.model.request.SummaryRequest;
import com.ksc.bill.billunion.model.response.*;

public interface KSCBILLUNION {

    SummaryResponse<PayModeSummaryItem> describeBillSummaryByPayMode(SummaryRequest req);

    SummaryResponse<ProductSummaryItem> describeBillSummaryByProduct(SummaryRequest req);

    SummaryResponse<ProjectSummaryItem> describeBillSummaryByProject(SummaryRequest req);

    InstanceSummaryResponse describeInstanceSummaryBills(InstanceSummaryRequest req);

    ProductGroupInfoResponse describeProductCode();
}