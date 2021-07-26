package com.ksc.bill.contact.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MailItem {
    @JsonProperty("Id")
    private Long id;

    @JsonProperty("CreatedTime")
    private String createdTime;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Content")
    private String content;

    @JsonProperty("CategoryId")
    private String categoryId;

    @JsonProperty("TypeId")
    private String typeId;

    @JsonProperty("TypeName")
    private String typeName;

    @JsonProperty("CategoryName")
    private String categoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "MailItem{" +
                "id=" + id +
                ", createdTime='" + createdTime + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
