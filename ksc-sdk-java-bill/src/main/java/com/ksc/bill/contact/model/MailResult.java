package com.ksc.bill.contact.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MailResult {

    @JsonProperty("List")
    private List<MailItem> list;

    @JsonProperty("Total")
    private Long total;

    public List<MailItem> getList() {
        return list;
    }

    public void setList(List<MailItem> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "MailResult{" +
                "list=" + list +
                ", total=" + total +
                '}';
    }
}
