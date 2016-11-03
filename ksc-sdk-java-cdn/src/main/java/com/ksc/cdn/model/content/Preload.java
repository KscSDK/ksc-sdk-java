/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An invalidation.
 * </p>
 */
public class Preload implements Serializable, Cloneable {

    /**
     * The identifier for the invalidation request. For example:
     * IDFDVBD632BHDS5.
     */
    private String id;

    /**
     * The status of the invalidation request. When the invalidation batch is
     * finished, the status is Completed.
     */
    private String status;

    /**
     * The date and time the invalidation request was first made.
     */
    private java.util.Date createTime;

    /**
     * The current invalidation information for the batch request.
     */
    private PreloadBatch preloadBatch;

    /**
     * Default constructor for a new Invalidation object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Preload() {}
    
    /**
     * The identifier for the invalidation request. For example:
     * IDFDVBD632BHDS5.
     *
     * @return The identifier for the invalidation request. For example:
     *         IDFDVBD632BHDS5.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier for the invalidation request. For example:
     * IDFDVBD632BHDS5.
     *
     * @param id The identifier for the invalidation request. For example:
     *         IDFDVBD632BHDS5.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier for the invalidation request. For example:
     * IDFDVBD632BHDS5.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The identifier for the invalidation request. For example:
     *         IDFDVBD632BHDS5.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Preload withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The status of the invalidation request. When the invalidation batch is
     * finished, the status is Completed.
     *
     * @return The status of the invalidation request. When the invalidation batch is
     *         finished, the status is Completed.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the invalidation request. When the invalidation batch is
     * finished, the status is Completed.
     *
     * @param status The status of the invalidation request. When the invalidation batch is
     *         finished, the status is Completed.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the invalidation request. When the invalidation batch is
     * finished, the status is Completed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the invalidation request. When the invalidation batch is
     *         finished, the status is Completed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Preload withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The date and time the invalidation request was first made.
     *
     * @return The date and time the invalidation request was first made.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * The date and time the invalidation request was first made.
     *
     * @param createTime The date and time the invalidation request was first made.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * The date and time the invalidation request was first made.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime The date and time the invalidation request was first made.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Preload withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }
    
    
    public PreloadBatch getPreloadBatch() {
        return preloadBatch;
    }

    public void setPreloadBatch(PreloadBatch preloadBatch) {
        this.preloadBatch = preloadBatch;
    }

    /**
     * The current invalidation information for the batch request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invalidationBatch The current invalidation information for the batch request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Preload withPreloadBatch(PreloadBatch preloadBatch) {
        this.preloadBatch = preloadBatch;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() + ",");
        if (getPreloadBatch() != null) sb.append("PreloadBatch: " + getPreloadBatch() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getPreloadBatch() == null) ? 0 : getPreloadBatch().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Preload == false) return false;
        Preload other = (Preload)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getCreateTime() == null ^ this.getCreateTime() == null) return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false) return false; 
        if (other.getPreloadBatch() == null ^ this.getPreloadBatch() == null) return false;
        if (other.getPreloadBatch() != null && other.getPreloadBatch().equals(this.getPreloadBatch()) == false) return false; 
        return true;
    }
    
    @Override
    public Preload clone() {
        try {
            return (Preload) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    