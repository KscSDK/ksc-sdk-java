/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.ksc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.RequestClientOptions;
import com.ksc.Response;
import com.ksc.RequestClientOptions.Marker;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.event.ProgressEvent;
import com.ksc.event.ProgressListener;
import com.ksc.event.SyncProgressListener;
import com.ksc.metrics.RequestMetricCollector;

public class KscWebServiceRequestTest {

    @Test
    public void testClone() {
        KscWebServiceRequest root = new KscWebServiceRequest() {};
        assertNull(root.getCloneSource());
        assertNull(root.getCloneRoot());

        KscWebServiceRequest clone = root.clone();
        assertEquals(root, clone.getCloneSource());
        assertEquals(root, clone.getCloneRoot());

        KscWebServiceRequest clone2 = clone.clone();
        assertEquals(clone, clone2.getCloneSource());
        assertEquals(root, clone2.getCloneRoot());
    }

    @SuppressWarnings({ "deprecation", "unused" })
	@Test
    public void copyBaseTo() {
        final ProgressListener listener = new SyncProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
            }
        };
        final AWSCredentials credentials = new BasicAWSCredentials("accesskey",
                "accessid");
        final RequestMetricCollector collector = new RequestMetricCollector() {
            @Override
            public void collectMetrics(Request<?> request, Response<?> response) {
            }
        };

        final KscWebServiceRequest from = new KscWebServiceRequest() {
        };
        from.setGeneralProgressListener(listener);
        from.setRequestCredentials(credentials);
        from.setRequestMetricCollector(collector);
        from.putCustomRequestHeader("k1", "v1");
        from.putCustomRequestHeader("k2", "v2");
        from.putCustomQueryParameter("k1", "v1");
        from.putCustomQueryParameter("k2", "v2a");
        from.putCustomQueryParameter("k2", "v2b");
        from.getRequestClientOptions().setReadLimit(1234);

        final KscWebServiceRequest to = new KscWebServiceRequest() {
        };

        // Before copy
        RequestClientOptions toOptions;
        verifyBaseBeforeCopy(to);

        // After copy
        from.copyBaseTo(to);
        verifyBaseAfterCopy(listener, credentials, collector, from, to);
    }

    @SuppressWarnings("deprecation")
	public static void verifyBaseBeforeCopy(final KscWebServiceRequest to) {
        assertNull(to.getCustomRequestHeaders());
        assertNull(to.getCustomQueryParameters());
        assertSame(ProgressListener.NOOP, to.getGeneralProgressListener());
        assertNull(to.getRequestCredentials());
        assertNull(to.getRequestMetricCollector());

        assertTrue(RequestClientOptions.DEFAULT_STREAM_BUFFER_SIZE == to
                .getReadLimit());
        RequestClientOptions toOptions = to.getRequestClientOptions();
        assertNull(toOptions.getClientMarker(Marker.USER_AGENT));
        assertTrue(RequestClientOptions.DEFAULT_STREAM_BUFFER_SIZE == toOptions
                .getReadLimit());
    }

    @SuppressWarnings("deprecation")
	private static void verifyBaseAfterCopy(final ProgressListener listener,
            final AWSCredentials credentials,
            final RequestMetricCollector collector,
            final KscWebServiceRequest from, final KscWebServiceRequest to) {
        RequestClientOptions toOptions;
        Map<String, String> headers = to.getCustomRequestHeaders();
        assertTrue(2 == headers.size());
        assertEquals("v1", headers.get("k1"));
        assertEquals("v2", headers.get("k2"));
        Map<String, List<String>> parmas = to.getCustomQueryParameters();
        assertTrue(2 == parmas.size());
        assertEquals(Arrays.asList("v1"), parmas.get("k1"));
        assertEquals(Arrays.asList("v2a", "v2b"), parmas.get("k2"));
        assertSame(listener, to.getGeneralProgressListener());
        assertSame(credentials, to.getRequestCredentials());
        assertSame(collector, to.getRequestMetricCollector());

        assertTrue(1234 == to.getReadLimit());
        toOptions = to.getRequestClientOptions();
        assertEquals(
                from.getRequestClientOptions().getClientMarker(
                        Marker.USER_AGENT),
                toOptions.getClientMarker(Marker.USER_AGENT));
        assertTrue(1234 == toOptions.getReadLimit());
    }
}
