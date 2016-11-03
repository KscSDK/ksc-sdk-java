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
 * The returned result of the corresponding request.
 * </p>
 */
public class CreatePreloadResult implements Serializable, Cloneable {

    /**
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the Invalidation ID.
     */
    private String location;

    /**
     * The invalidation's information.
     */
    private Preload preload;

    /**
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the Invalidation ID.
     *
     * @return The fully qualified URI of the distribution and invalidation batch
     *         request, including the Invalidation ID.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the Invalidation ID.
     *
     * @param location The fully qualified URI of the distribution and invalidation batch
     *         request, including the Invalidation ID.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the Invalidation ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location The fully qualified URI of the distribution and invalidation batch
     *         request, including the Invalidation ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePreloadResult withLocation(String location) {
        this.location = location;
        return this;
    }
    
    public Preload getPreload() {
        return preload;
    }

    public void setPreload(Preload preload) {
        this.preload = preload;
    }

    /**
     * The invalidation's information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invalidation The invalidation's information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePreloadResult withPreload(Preload preload) {
        this.preload = preload;
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
        if (getLocation() != null) sb.append("Location: " + getLocation() + ",");
        if (getPreload() != null) sb.append("Preload: " + getPreload() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getPreload() == null) ? 0 : getPreload().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePreloadResult == false) return false;
        CreatePreloadResult other = (CreatePreloadResult)obj;
        
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getPreload() == null ^ this.getPreload() == null) return false;
        if (other.getPreload() != null && other.getPreload().equals(this.getPreload()) == false) return false; 
        return true;
    }
    
    @Override
    public CreatePreloadResult clone() {
        try {
            return (CreatePreloadResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    