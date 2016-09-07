/*
 * Copyright 2010-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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
package com.ksc.internal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ksc.internal.DefaultServiceEndpointBuilder;
import com.ksc.regions.CustomRegionFactory;
import com.ksc.regions.Region;
import com.ksc.regions.Regions;

public class DefaultServiceEndpointBuilderTest {

    @Test
    public void getServiceEndpoint_S3StandardRegion_HttpsProtocol() throws Exception {
        DefaultServiceEndpointBuilder endpointBuilder = new DefaultServiceEndpointBuilder("s3", "https")
                .withRegion(Region.getRegion(Regions.CN_BEIJING_6));
        assertEquals("https://s3.cn-beijing-6.api.ksyun.com", endpointBuilder.getServiceEndpoint().toString());
    }

    @Test
    public void getServiceEndpoint_S3StandardRegion_HttpProtocol() throws Exception {
        DefaultServiceEndpointBuilder endpointBuilder = new DefaultServiceEndpointBuilder("s3", "http")
                .withRegion(Region.getRegion(Regions.CN_BEIJING_6));
        assertEquals("http://s3.cn-beijing-6.api.ksyun.com", endpointBuilder.getServiceEndpoint().toString());
    }

    @Test
    public void getServiceEndpoint_S3NonStandardRegion_HttpProtocol() throws Exception {
        DefaultServiceEndpointBuilder endpointBuilder = new DefaultServiceEndpointBuilder("s3", "http")
                .withRegion(Region.getRegion(Regions.CN_BEIJING_6));
        assertEquals("http://s3.cn-beijing-6.api.ksyun.com", endpointBuilder.getServiceEndpoint().toString());
    }

    @Test
    public void getServiceEndpoint_CustomRegion_HttpProtocol() {
        DefaultServiceEndpointBuilder endpointBuilder = new DefaultServiceEndpointBuilder("s3", "http")
                .withRegion(CustomRegionFactory.getCustomRegion("test-region", "test.domain"));
        assertEquals("http://s3.test-region.test.domain", endpointBuilder.getServiceEndpoint().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getServiceEndpoint_CustomRegion_InvalidEndpoint() {
        DefaultServiceEndpointBuilder endpointBuilder = new DefaultServiceEndpointBuilder("s3", "http")
                .withRegion(CustomRegionFactory.getCustomRegion("test-region", "\\invalid.domain"));
        endpointBuilder.getServiceEndpoint();
    }
}
