package com.ksc.cdn.model.content;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;

import java.text.ParseException;
import java.util.Map;

/**
 * GetQuotaUsageAmountRequest
 * 获取当前已用配额用量
 * @author jiangran@kingsoft.com
 * @date 2016/12/1
 */
public class GetQuotaUsageAmountRequest implements GeneralRequest{
    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetQuotaUsageAmount","2015-09-17","/2015-09-17/quota/usage-amount");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }
}
