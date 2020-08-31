package com.ksc.redis.model.security;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DescribeSecurityGroupsResponse {
    private List<CreateSecurityGroupResponse> list;
    private Integer offset;
    private Integer limit;
    private Integer total;

    public List<CreateSecurityGroupResponse> getList() {
        return list;
    }

    public void setList(List<CreateSecurityGroupResponse> list) {
        this.list = list;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
