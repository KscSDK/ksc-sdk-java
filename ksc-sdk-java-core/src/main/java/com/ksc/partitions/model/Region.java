/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.ksc.partitions.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ksc.util.ValidationUtils;

/**
 * Metadata about a region in partition.
 */
public class Region {

    /**
     * description of the region.
     */
    private final String description;

    public Region(@JsonProperty(value = "description") String description) {
        this.description = ValidationUtils.assertNotNull(description, "Region description");;
    }

    public String getDescription() {
        return description;
    }
}
