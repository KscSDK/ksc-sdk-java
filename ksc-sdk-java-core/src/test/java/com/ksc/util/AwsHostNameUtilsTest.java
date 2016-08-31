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
package com.ksc.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.URI;

import org.junit.Test;

import com.ksc.util.KscHostNameUtils;

/** Unit tests for the utility methods that parse information from AWS URLs. */
public class AwsHostNameUtilsTest {

    private static final URI IAM_ENDPOINT              = URI.create("https://iam.api.ksyun.com");
    private static final URI IAM_REGION_ENDPOINT       = URI.create("https://iam.cn-shanghai-2.api.ksyun.com");
    private static final URI KEC_REGION_ENDPOINT       = URI.create("https://kec.cn-shanghai-2.api.ksyun.com");

    @SuppressWarnings("deprecation")
	@Test
    public void testParseServiceName() {
        // Verify that parseServiceName keeps working the way it used to.
        assertEquals("iam", KscHostNameUtils.parseServiceName(IAM_ENDPOINT));
        assertEquals("iam", KscHostNameUtils.parseServiceName(IAM_REGION_ENDPOINT));
        assertEquals("kec", KscHostNameUtils.parseServiceName(KEC_REGION_ENDPOINT));
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testStandardNoHint() {
        // Verify that standard endpoints parse correctly without a service hint
        assertEquals("cn-shanghai-2", KscHostNameUtils.parseRegionName("iam.cn-shanghai-2.api.ksyun.com", null));
        assertEquals("cn-shanghai-2", KscHostNameUtils.parseRegionName("kec.cn-shanghai-2.api.ksyun.com", null));
       /* assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("iam.us-west-2.amazonaws.com", null));
        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName("ec2.us-west-2.amazonaws.com", null));*/
        
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testStandard() {
        // Verify that standard endpoints parse correctly with a service hint
    	assertEquals("cn-shanghai-2", KscHostNameUtils.parseRegionName("iam.cn-shanghai-2.ksyun.com", "iam"));
        assertEquals("cn-shanghai-2", KscHostNameUtils.parseRegionName("kec.cn-shanghai-2.ksyun.com", "kec"));
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testBJS() {
        // Verify that BJS endpoints parse correctly even though they're non-standard.
        assertEquals("cn-shanghai-2", KscHostNameUtils.parseRegionName("iam.cn-shanghai-2.ksyun.com.cn", "iam"));
    }
    

    @Test
    public void testParseRegionWithStandardEndpointsNoHint() {
        // Verify that standard endpoints parse correctly without a service hint
        assertEquals("cn-shanghai-2", KscHostNameUtils.parseRegion("iam.cn-shanghai-2.api.ksyun.com", null));
        assertEquals("cn-shanghai-2", KscHostNameUtils.parseRegion("kec.cn-shanghai-2.api.ksyun.com", null));
    }

    @Test
    public void testParseRegionWithStandardEndpointsWithServiceHint() {
        // Verify that standard endpoints parse correctly with a service hint
    	assertEquals("cn-shanghai-2", KscHostNameUtils.parseRegion("iam.cn-shanghai-2.ksyun.com", "iam"));
        assertEquals("cn-shanghai-2", KscHostNameUtils.parseRegion("kec.cn-shanghai-2.ksyun.com", "kec"));
    }
    

    @Test
    public void testParseRegionWithIpv4() {
        assertNull(KscHostNameUtils.parseRegion("54.231.16.200", null));
    }
}
