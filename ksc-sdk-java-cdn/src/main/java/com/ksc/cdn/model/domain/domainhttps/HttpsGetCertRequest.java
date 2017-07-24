package com.ksc.cdn.model.domain.domainhttps;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.FieldValidate;

import java.text.ParseException;
import java.util.Map;

/**
 * 分页获得用户证书列表参数
 * <p>
 * Created by YANGXUEYI on 2017/7/13.
 */
public class HttpsGetCertRequest implements GeneralRequest {

    /**
     * 一页展示条数
     */
    @FieldValidate
    private Long PageSize;

    /**
     * 当前页码
     */
    @FieldValidate
    private Long PageNum;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetCertificates", "2016-09-01", "/2016-09-01/cert/GetCertificates");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }

    public Long getPageSize() {
        return PageSize;
    }

    public void setPageSize(Long pageSize) {
        PageSize = pageSize;
    }

    public Long getPageNum() {
        return PageNum;
    }

    public void setPageNum(Long pageNum) {
        PageNum = pageNum;
    }


}
