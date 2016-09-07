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
package com.ksc.regions;

import org.junit.Assert;
import org.junit.Test;

import com.ksc.regions.Region;
import com.ksc.regions.RegionUtils;
import com.ksc.regions.Regions;

/**
 * Test cases for partition based region implementation and endpoint guessing.
 */
public class PartitionsRegionsTest {

    private static final String KECService = "kec";
    private static final String IAM = "iam";

    @Test
    public void region_name_matches_regionregex_guesses_regionalized_endpoint() {

        final String regionName = "cn-beijing-6";
        Region partitionUsWest = RegionUtils.getRegion(regionName);
        Assert.assertFalse(partitionUsWest.isServiceSupported(KECService));
        Assert.assertFalse(partitionUsWest.hasHttpEndpoint(KECService));
        Assert.assertFalse(partitionUsWest.hasHttpsEndpoint(KECService));
        Assert.assertNull(partitionUsWest.getServiceEndpoint(KECService));
    }

    @Test
    public void region_name_matches_regionregex_guesses_partition_wide_endpoint() {
        final String regionName = "cn-beijing-6";
        Region partitionUsWest = RegionUtils.getRegion(regionName);
        Assert.assertTrue(partitionUsWest.isServiceSupported(IAM));
        Assert.assertTrue(partitionUsWest.hasHttpEndpoint(IAM));
        Assert.assertFalse(partitionUsWest.hasHttpsEndpoint(IAM));
        Assert.assertNotNull(partitionUsWest.getServiceEndpoint(IAM));
    }

    @Test
    public void endpoint_information_for_completely_new_service_returns_null() {
        final Region region = RegionUtils.getRegion(Regions.CN_BEIJING_6
                .getName());
        final String serviceName = "unknown-service";
        Assert.assertNull(region.getServiceEndpoint(serviceName));
        Assert.assertFalse(region.hasHttpEndpoint(serviceName));
        Assert.assertFalse(region.hasHttpsEndpoint(serviceName));
        Assert.assertFalse(region.isServiceSupported(serviceName));
    }

    @Test
    public void region_name_not_matches_regionregex_returns_null() {
        final String regionName = "cn-shanghai";
        Assert.assertNull(RegionUtils.getRegion(regionName));
    }

    @Test
    public void s3_external_endpoint_resolution() {
        final String regionName = "cn-beijing-6";
        Assert.assertNotNull(RegionUtils.getRegion(regionName));
    }
}
