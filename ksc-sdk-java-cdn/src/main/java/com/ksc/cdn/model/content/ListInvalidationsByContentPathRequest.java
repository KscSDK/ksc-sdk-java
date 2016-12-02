package com.ksc.cdn.model.content;

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
 * ListInvalidationsByContentPathRequest
 * 查询刷新结果
 * @author jiangran@kingsoft.com
 * @date 2016/12/1
 */
@Deprecated
public class ListInvalidationsByContentPathRequest implements GeneralRequest {
    /**
     * 支持模糊查询,查询条件
     */
    private String QueryName;
    /**
     * @see com.ksc.cdn.model.enums.RefreAndLoadType
     */
    @FieldValidate
    private String Type;
    /**
     * 查询开始时间
     */
    @FieldValidate
    private String StartTime;
    /**
     * 查询结束时间
     */
    @FieldValidate
    private String EndTime;
    /**
     * 查询页码
     */
    @FieldValidate
    private String PageIndex;
    /**
     * 单页大小
     */
    @FieldValidate
    private String PageSize;

    public String getQueryName() {
        return QueryName;
    }

    public void setQueryName(String queryName) {
        QueryName = queryName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(String pageIndex) {
        PageIndex = pageIndex;
    }

    public String getPageSize() {
        return PageSize;
    }

    public void setPageSize(String pageSize) {
        PageSize = pageSize;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("ListInvalidationsByContentPath","2015-09-17","/2015-09-17/distribution/content-path");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        Map<String, String> param = new HashMap<String, String>();
        if(StringUtils.isNotBlank(this.getQueryName()))
            param.put("QueryName", this.getQueryName());

        param.put("Type", this.getType());
        param.put("StartTime", this.getStartTime());
        param.put("EndTime", this.getEndTime());
        param.put("PageIndex", this.getPageIndex());
        param.put("PageSize", this.getPageSize());
        return param;
    }
}
