package com.ksc.network.kcm;

import com.ksc.network.kcm.model.*;

public interface KSCKCM {

    /**
     * 创建证书
     */
    public CreateCertificateResult createCertificate(CreateCertificateRequest createCertificateRequest);

    /**
     * 删除证书
     */
    public DeleteCertificateResult deleteCertificate(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * 修改证书
     */
    public ModifyCertificateResult modifyCertificate(ModifyCertificateRequest modifyCertificateRequest);

    /**
     * 描述证书列表
     */
    public DescribeCertificatesResult describeCertificates(DescribeCertificatesRequest describeCertificatesRequest);

}
