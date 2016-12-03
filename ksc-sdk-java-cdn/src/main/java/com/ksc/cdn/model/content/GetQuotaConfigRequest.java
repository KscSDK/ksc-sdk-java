package com.ksc.cdn.model.content;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;

import java.text.ParseException;
import java.util.Map;

/**
 * GetQuotaConfigRequest
 * 获取配额配置信息
 * @author jiangran@kingsoft.com
 * @date 2016/12/1
 */
public class GetQuotaConfigRequest implements GeneralRequest{
    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetQuotaConfig","2015-09-17","/2015-09-17/quota/config");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }
}
