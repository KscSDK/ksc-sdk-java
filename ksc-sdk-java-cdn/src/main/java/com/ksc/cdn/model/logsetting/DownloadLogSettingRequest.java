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
 * DownloadLogSettingRequest
 * 日志下载
 * @author jiangran@kingsoft.com
 * @date 2016/11/30
 */
@Deprecated
public class DownloadLogSettingRequest implements GeneralRequest {
    /**
     * 要下载的域名
     */
    @FieldValidate
    private String domain;
    /**
     * 页码（可选，默认为0）
     */
    private String pageIndex;
    /**
     * 每页大小（可选，默认为10）
     */
    private String pageSize;
    /**
     * 日志创建的开始时间（时间戳，以毫秒为单位）（可选，默认为32天前）
     */
    private String startTime;
    /**
     * endTime: 结束时间（时间戳，以毫秒为单位）（可选，默认为当前时间）
     */
    private String endTime;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetLog","2016-05-20","/2016-05-20/log");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        Map<String, String> params = new HashMap<String, String>();

        if (StringUtils.isNotBlank(startTime)) {
            params.put("startTime", startTime);
        }
        if (StringUtils.isNotBlank(endTime)) {
            params.put("endTime", endTime);
        }
        if (StringUtils.isNotBlank(pageIndex)) {
            params.put("pageIndex", pageIndex);
        }
        if (StringUtils.isNotBlank(pageSize)) {
            params.put("pageSize", pageSize);
        }
        return params;
    }
}
