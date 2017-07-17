package com.ksc.cdn.model.domain.domainhttps;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页获取证书列表返回参数
 * Created by YANGXUEYI on 2017/7/13.
 */
public class HttpsGetCertResponse {
    /**
     * 一页展示条数
     */
    private Long pageSize;
    /**
     * 页码
     */
    private Long pageNum;

    /**
     * 总数
     */
    private Integer TotalCount;

    /**
     * 返回list
     */
    private List<HttpsCertificate> Certificates = new ArrayList<HttpsCertificate>();

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public List<HttpsCertificate> getCertificates() {
        return Certificates;
    }

    public void setCertificates(List<HttpsCertificate> certificates) {
        Certificates = certificates;
    }

}
