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

import com.ksc.KscWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront.AmazonCloudFront#createInvalidation(CreatePreloadRequest) CreateInvalidation operation}.
 * <p>
 * Create a new invalidation.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront.AmazonCloudFront#createInvalidation(CreatePreloadRequest)
 */
public class CreatePreloadRequest extends KscWebServiceRequest implements Serializable, Cloneable {

    /**
     * The distribution's id.
     */
    private String distributionId;

    /**
     * The batch information for the invalidation.
     */
    private PreloadBatch preloadBatch;

    /**
     * Default constructor for a new CreateInvalidationRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreatePreloadRequest() {}
    
    /**
     * Constructs a new CreateInvalidationRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param distributionId The distribution's id.
     * @param invalidationBatch The batch information for the invalidation.
     */
    public CreatePreloadRequest(String distributionId, PreloadBatch preloadBatch) {
        setDistributionId(distributionId);
        setPreloadBatch(preloadBatch);
    }

    /**
     * The distribution's id.
     *
     * @return The distribution's id.
     */
    public String getDistributionId() {
        return distributionId;
    }
    
    /**
     * The distribution's id.
     *
     * @param distributionId The distribution's id.
     */
    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }
    
    /**
     * The distribution's id.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param distributionId The distribution's id.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePreloadRequest withDistributionId(String distributionId) {
        this.distributionId = distributionId;
        return this;
    }

    
    public PreloadBatch getPreloadBatch() {
        return preloadBatch;
    }

    public void setPreloadBatch(PreloadBatch preloadBatch) {
        this.preloadBatch = preloadBatch;
    }

    /**
     * The batch information for the invalidation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invalidationBatch The batch information for the invalidation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePreloadRequest withPreloadBatch(PreloadBatch preloadBatch) {
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
        if (getDistributionId() != null) sb.append("DistributionId: " + getDistributionId() + ",");
        if (getPreloadBatch() != null) sb.append("PreloadBatch: " + this.getPreloadBatch() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode()); 
        hashCode = prime * hashCode + ((getPreloadBatch() == null) ? 0 : getPreloadBatch().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePreloadRequest == false) return false;
        CreatePreloadRequest other = (CreatePreloadRequest)obj;
        
        if (other.getDistributionId() == null ^ this.getDistributionId() == null) return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false) return false; 
        if (other.getPreloadBatch() == null ^ this.getPreloadBatch() == null) return false;
        if (other.getPreloadBatch() != null && other.getPreloadBatch().equals(this.getPreloadBatch()) == false) return false; 
        return true;
    }
    
    @Override
    public CreatePreloadRequest clone() {
        
            return (CreatePreloadRequest) super.clone();
    }

}
    