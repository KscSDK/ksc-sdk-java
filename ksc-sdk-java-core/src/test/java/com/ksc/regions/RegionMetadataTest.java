/*
 * Copyright 2010-2016 ksyun.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.ksc.regions;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.InMemoryRegionsProvider;
import com.ksc.regions.Region;
import com.ksc.regions.RegionMetadata;

public class RegionMetadataTest {

    private static RegionMetadata metadata;

    @BeforeClass
    public static void setUp() {
        Region cn_beijing_6_region = new Region(new InMemoryRegionImpl
                ("cn-beijing-6",
                null).addEndpoint("kec", "kec.cn-beijing-6.api.ksyun.com"));

        Region cn_shanghai_2_region = new Region(new InMemoryRegionImpl
                ("cn-shanghai-2", null).addEndpoint("kec", "kec.cn-shanghai-2.api.ksyun.com"));

        Region cn_beijing_1_region = new Region(new InMemoryRegionImpl("cn-beijing-1",
                "kec.api.ksyun.com"));

        metadata = new RegionMetadata(new InMemoryRegionsProvider(Arrays
                .asList(cn_beijing_6_region, cn_shanghai_2_region,cn_beijing_1_region)));
    }

    @Test
    public void testGetRegion() {
        Region region = metadata.getRegion("cn-beijing-6");
        Assert.assertNotNull(region);
        Assert.assertEquals("cn-beijing-6", region.getName());

        region = metadata.getRegion("cn-shanghai-2");
        Assert.assertNotNull(region);
        Assert.assertEquals("cn-shanghai-2", region.getName());

        region = metadata.getRegion("cn-beijing-1");
        Assert.assertNotNull(region);
        Assert.assertEquals("cn-beijing-1", region.getName());

        region = metadata.getRegion("bogus-monkeys");
        Assert.assertNull(region);
    }

    @Test
    public void testGetRegionsForService() {
        List<Region> regions = metadata.getRegionsForService("kec");
        Assert.assertNotNull(regions);
        Assert.assertEquals(2, regions.size());

        Assert.assertEquals("cn-beijing-6", regions.get(0).getName());
        Assert.assertEquals("cn-shanghai-2", regions.get(1).getName());

        regions = metadata.getRegionsForService("bogus-monkeys");
        Assert.assertNotNull(regions);
        Assert.assertTrue(regions.isEmpty());
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testGetRegionByEndpoint() {
        Region region =
            metadata.getRegionByEndpoint("kec.cn-beijing-6.api.ksyun.com");

        Assert.assertNotNull(region);
        Assert.assertEquals("cn-beijing-6", region.getName());

        try {
            metadata.getRegionByEndpoint("bogus-monkeys");
            Assert.fail("Expected an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
}
