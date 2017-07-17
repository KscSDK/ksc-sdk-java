package com.ksc.cdn.model.domain.domainhttps;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.FieldValidate;

import java.text.ParseException;
import java.util.Map;

/**
 * 删除证书参数
 * Created by YANGXUEYI on 2017/7/13.
 */
public class HttpsRemoveCertRequest implements GeneralRequest {
    /**
     * 证书id列表
     */
    @FieldValidate
    private String CertificateIds;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("RemoveCertificates", "2016-09-01", "/2016-09-01/cert/RemoveCertificates");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }

    public String getCertificateIds() {
        return CertificateIds;
    }

    public void setCertificateIds(String certificateIds) {
        CertificateIds = certificateIds;
    }
}
