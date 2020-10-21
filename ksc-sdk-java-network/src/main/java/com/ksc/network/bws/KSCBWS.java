package com.ksc.network.bws;

import com.ksc.network.bws.model.*;

public interface KSCBWS {
    /**
     * 创建共享带宽
     */
    public CreateBandWidthShareResult createBandWidthShare(CreateBandWidthShareRequest createBandWidthShareRequest);

    /**
     * 修改共享带宽
     */
    public ModifyBandWidthShareResult modifyBandWidthShare(ModifyBandWidthShareRequest modifyBandWidthShareRequest);

    /**
     * 删除共享带宽
     */
    public DeleteBandWidthShareResult deleteBandWidthShare(DeleteBandWidthShareRequest deleteBandWidthShareRequest);

    /**
     * 查询共享带宽
     */
    public DescribeBandWidthSharesResult describeBandWidthShares(DescribeBandWidthSharesRequest describeBandWidthSharesRequest);

    /**
     * 绑定共享带宽
     */
    public AssociateBandWidthShareResult associateBandWidthShare(AssociateBandWidthShareRequest associateBandWidthShareRequest);

    /**
     * 解绑共享带宽
     */
    public DisassociateBandWidthShareResult disassociateBandWidthShare(DisassociateBandWidthShareRequest disassociateBandWidthShareRequest);

}
