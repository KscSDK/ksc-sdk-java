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

import org.junit.*;

import com.ksc.*;
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;

public class RegionsTest {

    @Test
    public void testDefaultDomain() {
        Region region = new Region(new InMemoryRegionImpl("region", null));
        Assert.assertEquals("api.ksyun.com", region.getDomain());
    }

    @Test
    public void testSetEndpointByRegion() {

        InMemoryRegionImpl regionImpl = new InMemoryRegionImpl("region", "example.com");
        regionImpl.addEndpoint("service",
                "service-region.example.com");
        Region region = new Region(regionImpl);

        // This should use the configured region.
        KsyunServiceClient service = new KsyunServiceClient();
        service.setRegion(region);
        Assert.assertEquals("http://service-region.example.com",
                            service.getEndpoint());

        // This should guess at an endpoint based on the region's domain.
        KsyunUnknownServiceClient unknown = new KsyunUnknownServiceClient();
        unknown.setRegion(region);
        Assert.assertEquals("http://unknownservice.region.example.com",
                            unknown.getEndpoint());
    }

    private static class KsyunServiceClient extends KscWebServiceClient {
        
        public KsyunServiceClient() {
            super(new ClientConfiguration());
        }

        public String getEndpoint() {
            return endpoint.toString();
        }
    }

    private static class KsyunUnknownServiceClient
            extends KscWebServiceClient {

        public KsyunUnknownServiceClient() {
            super(new ClientConfiguration());
        }

        public String getEndpoint() {
            return endpoint.toString();
        }
    }
}
