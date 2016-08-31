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
package com.ksc.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.net.URI;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.junit.Test;

import com.ksc.DefaultRequest;
import com.ksc.Request;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AnonymousAWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.auth.QueryStringSigner;

public class QueryStringSignerTest {

    private static final QueryStringSigner signer = new QueryStringSigner();
    private static final AWSCredentials credentials = new BasicAWSCredentials("123456789", "123456789");

    private static final String EXPECTED_SIGNATURE = "SjJexzrYBKR6O3UAzMi6+/VvoeV2Oa0dIua4poIJpZg=";

    static {
        Calendar c = new GregorianCalendar();
        c.clear();
        c.set(1981, 1, 16, 6, 30, 0);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        signer.overrideDate(c.getTime());
    }


    @Test
    public void testRequestResourcePath() throws Exception {
        Request<?> request = new DefaultRequest<Void>(null, "foo");
        request.setEndpoint(URI.create("http://foo.ksyun.com"));
        request.addParameter("foo", "bar");
        request.setResourcePath("foo/bar");

        signer.sign(request, credentials);
        assertSignature(EXPECTED_SIGNATURE, request.getParameters());
    }

    @Test
    public void testRequestAndEndpointResourcePath() throws Exception {
        Request<?> request = new DefaultRequest<Void>(null, "foo");
        request.setEndpoint(URI.create("http://foo.ksyun.com/foo"));
        request.addParameter("foo", "bar");
        request.setResourcePath("/bar");

        signer.sign(request, credentials);
        assertSignature(EXPECTED_SIGNATURE, request.getParameters());
    }

    @Test
    public void testRequestAndEndpointResourcePathNoSlash() throws Exception {
        Request<?> request = new DefaultRequest<Void>(null, "foo");
        request.setEndpoint(URI.create("http://foo.ksyun.com/foo"));
        request.addParameter("foo", "bar");
        request.setResourcePath("bar");

        signer.sign(request, credentials);
        assertSignature(EXPECTED_SIGNATURE, request.getParameters());
    }

    /**
     * Asserts the given signature to the signature generated as part of the
     * signing the request.
     */

    private void assertSignature(String expected,
            Map<String, List<String>> requestParams) {
        List<String> signature = requestParams.get("Signature");
        assertNotNull(signature);
        assertEquals(1, signature.size());
        assertEquals(EXPECTED_SIGNATURE, signature.iterator().next());
    }

    @Test
    public void testAnonymous() throws Exception {
        Request<?> request = new DefaultRequest<Void>(null, "foo");
        request.setEndpoint(URI.create("http://foo.ksyun.com/foo"));
        request.addParameter("foo", "bar");
        request.setResourcePath("bar");

        signer.sign(request, new AnonymousAWSCredentials());

        assertNull(request.getParameters().get("Signature"));
    }

}