/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.ksc.cdn.model.content;

import java.io.Serializable;

/**
 * <p>
 * Summary of an preload request.
 * </p>
 */
public class PreloadSummary implements Serializable, Cloneable {

    /**
     * The unique ID for an preload request.
     */
    private String id;

    private java.util.Date createTime;

    /**
     * The status of an preload request.
     */
    private String status;

    /**
     * Default constructor for a new PreloadSummary object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PreloadSummary() {}

    /**
     * The unique ID for an preload request.
     *
     * @return The unique ID for an preload request.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique ID for an preload request.
     *
     * @param id The unique ID for an preload request.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique ID for an preload request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The unique ID for an preload request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PreloadSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns the value of the CreateTime property for this object.
     *
     * @return The value of the CreateTime property for this object.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the CreateTime property for this object.
     *
     * @param createTime The new value for the CreateTime property for this object.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Sets the value of the CreateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime The new value for the CreateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PreloadSummary withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * The status of an preload request.
     *
     * @return The status of an preload request.
     */
    public String getStatus() {
        return status;
    }

    /**
     * The status of an preload request.
     *
     * @param status The status of an preload request.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The status of an preload request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of an preload request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PreloadSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PreloadSummary == false) return false;
        PreloadSummary other = (PreloadSummary)obj;

        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null) return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        return true;
    }

    @Override
    public PreloadSummary clone() {
        try {
            return (PreloadSummary) super.clone();

        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!",
                    e);
        }

    }

}
    