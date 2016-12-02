package com.ksc.cdn.model.logsetting;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * DeleteLogSettingRequest
 * 删除日志
 * @author jiangran@kingsoft.com
 * @date 2016/11/30
 */
@Deprecated
public class DeleteLogSettingRequest implements GeneralRequest {
    /**
     * 删除域名(必选)
     */
    @FieldValidate
    private String domain;
    /**
     * 该域名下一组日志id（可选）如果为空将清空域名下的所有日志
     */
    private String ids;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("DeleteLog","2016-05-20","/2016-05-20/log");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        Map<String, String> parameters = new HashMap();
        if (StringUtils.isNotBlank(ids)) {
            parameters.put("ids", ids);
        }
        return parameters;
    }
}
