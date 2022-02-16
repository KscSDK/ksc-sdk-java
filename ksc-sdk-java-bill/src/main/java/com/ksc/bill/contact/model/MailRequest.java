package com.ksc.bill.contact.model;

import com.ksc.KscWebServiceRequest;

import java.io.Serializable;

/**
 * see details in
 * https://docs.ksyun.com/documents/40148
 *
 * @author chenhetong
 * @since 2021/7/22
 */
public class MailRequest extends KscWebServiceRequest implements
        Serializable, Cloneable {

    private static final long serialVersionUID = 160630947074972750L;

    /**
     * the begin time of the query.format is "yyyy-MM-dd HH:mm:ss"
     */
    private String StartTime;
    private String EndTime;
    private Integer PageNumber = 1;
    private Integer PageSize = 10;

    private String CategoryId ;
    private String TypeId;

    public MailRequest(String startTime, String endTime) {
        StartTime = startTime;
        EndTime = endTime;
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

    public Integer getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        PageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public String getTypeId() {
        return TypeId;
    }

    public void setTypeId(String typeId) {
        TypeId = typeId;
    }
}
