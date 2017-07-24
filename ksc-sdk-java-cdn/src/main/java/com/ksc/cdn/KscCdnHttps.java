package com.ksc.cdn;

import com.ksc.cdn.model.domain.domainhttps.*;

/**
 * https证书管理
 *
 * @author yangxueyi@kingsoft.com
 * @date 2017/7/23
 */
public interface KscCdnHttps {

    /**
     * 为单个或多个加速域名配置服务证书
     *
     * @param request
     */
    void configCertificate(HttpsConfCertRequest request) throws Exception;

    /**
     * 更新证书
     *
     * @param request
     */
    void setCertificate(HttpsSetCertRequest request) throws Exception;

    /**
     * 删除一个或多个证书
     * 注意：仅当证书未启用状态才能删除证书
     *
     * @param request
     */
    void removeCertificates(HttpsRemoveCertRequest request) throws Exception;

    /**
     * 分页获得用户证书列表
     *
     * @param request
     */
    HttpsGetCertResponse getCertificates(HttpsGetCertRequest request) throws Exception;
}
