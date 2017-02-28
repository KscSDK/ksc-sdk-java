package com.ksc.cdn.model.content;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;

import java.text.ParseException;
import java.util.Map;

/**
 * 获取刷新、预热URL及目录的最大限制数量，及当日剩余刷新、预热URL及目录的条数
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class RefreshOrPreloadQuotaRequest implements GeneralRequest {

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetRefreshOrPreloadQuota", "2016-09-01", "/2016-09-01/content/GetRefreshOrPreloadQuota");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }
}
