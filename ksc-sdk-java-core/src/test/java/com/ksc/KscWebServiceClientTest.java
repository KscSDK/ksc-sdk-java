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
package com.ksc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;

import com.ksc.KscWebServiceClient;
import com.ksc.ClientConfiguration;
import com.ksc.auth.AWS4Signer;
import com.ksc.auth.QueryStringSigner;
import com.ksc.http.IdleConnectionReaper;

public class KscWebServiceClientTest {

    @Test
    public void emptyClient() {
        KscWebServiceClient client =
            new KscWebServiceClient(new ClientConfiguration()) { };

        try {
            client.getServiceName();
        } catch (IllegalStateException exception) {
        }
    }

    @Test
    public void testDefaultSigner() {
    	KsyunTestClient client = new KsyunTestClient();

        Assert.assertEquals("test", client.getServiceName());
        Assert.assertTrue(client.getSigner() instanceof AWS4Signer);
    }

    @Test
    public void testOverrideSigner() {
        ClientConfiguration config = new ClientConfiguration();
        config.setSignerOverride("QueryStringSignerType");

        KsyunTestClient client = new KsyunTestClient(config);

        Assert.assertTrue(client.getSigner() instanceof QueryStringSigner);
    }

    @Test
    public void setServiceNameIntern() {
    	KsyunTestClient client = new KsyunTestClient();
        assertEquals(client.getServiceName(), client.getServiceNameIntern());
        String serviceNameOverride = "foo";
        assertFalse(serviceNameOverride.equals(client.getServiceName()));
        client.setServiceNameIntern(serviceNameOverride);
        assertEquals(serviceNameOverride, client.getServiceName());
    }

    @Test
    public void setEndpointPrefix() {
    	KsyunTestClient client = new KsyunTestClient();
        Assert.assertEquals(client.getServiceName(), client.getEndpointPrefix());
        String endpointPrefixOverride = "foo";
        Assert.assertNotEquals(endpointPrefixOverride, client.getServiceName());
        client.setEndpointPrefix(endpointPrefixOverride);
        Assert.assertEquals(endpointPrefixOverride, client.getEndpointPrefix());
        Assert.assertNotEquals(client.getEndpointPrefix(), client.getServiceName());
    }

    /**
     * A memory leak was introduced in 1.11 that prevented connection managers from being
     * deregistered with the IdleConnectionReaper. This test asserts that any clients registered
     * with the reaper are also deregistered on shutdown of the client.
     *
     * @see <a href="https://github.com/aws/aws-sdk-java/issues/722">Issue #722</a>
     */
    @Test
    public void connectionManagersAreUnregisteredFromIdleConnectionReaper() {
        for (int count = 0; count < 100; count++) {
            new KscWebServiceClient(new ClientConfiguration()) {
            }.shutdown();
        }
        assertEquals(0, IdleConnectionReaper.getRegisteredConnectionManagers().size());
    }

    private static class KsyunTestClient extends KscWebServiceClient {
        public KsyunTestClient() {
            this(new ClientConfiguration());
        }

        public KsyunTestClient(final ClientConfiguration config) {
            super(config);
            super.setEndpoint("test.cn-beijing-6.api.ksyun.com");
        }
    }
}
