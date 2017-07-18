package com.ksc.cdn.model.domain.domainhttps;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页获取证书列表返回参数
 * Created by YANGXUEYI on 2017/7/13.
 */
public class HttpsGetCertResponse {

    /**
     * 总数
     */
    private Long TotalCount;

    /**
     * 返回list
     */
    private List<HttpsCertificate> Certificates = new ArrayList<HttpsCertificate>();

    public Long getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Long totalCount) {
        TotalCount = totalCount;
    }

    public List<HttpsCertificate> getCertificates() {
        return Certificates;
    }

    public void setCertificates(List<HttpsCertificate> certificates) {
        Certificates = certificates;
    }

}
