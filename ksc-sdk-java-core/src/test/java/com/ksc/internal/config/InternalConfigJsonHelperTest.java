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
package com.ksc.internal.config;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ksc.internal.config.HttpClientConfig;
import com.ksc.internal.config.HttpClientConfigJsonHelper;
import com.ksc.internal.config.InternalConfigJsonHelper;
import com.ksc.internal.config.JsonIndex;
import com.ksc.internal.config.SignerConfig;
import com.ksc.internal.config.SignerConfigJsonHelper;
import com.ksc.util.json.Jackson;

public class InternalConfigJsonHelperTest {

    @SuppressWarnings("unchecked")
    @Test
    public void test() throws Exception {
        InternalConfigJsonHelper b = new InternalConfigJsonHelper();
        b.setDefaultSigner(new SignerConfigJsonHelper("AWS4SignerType"));
        b.setServiceSigners(
            new JsonIndex<SignerConfigJsonHelper, SignerConfig>("vpc",
                new SignerConfigJsonHelper("AWS4SignerType")),
            new JsonIndex<SignerConfigJsonHelper, SignerConfig>("kec",
                    new SignerConfigJsonHelper("AWS4SignerType")),
            new JsonIndex<SignerConfigJsonHelper, SignerConfig>("s3",
                    new SignerConfigJsonHelper("AWS4SignerType"))
        );
        b.setRegionSigners(
                new JsonIndex<SignerConfigJsonHelper, SignerConfig>("cn-beijing-6",
                    new SignerConfigJsonHelper("AWS4SignerType")));
        b.setServiceRegionSigners(
                new JsonIndex<SignerConfigJsonHelper, SignerConfig>("kec/cn-beijing-6",
                    new SignerConfigJsonHelper("AWS4SignerType")));
        b.setServiceRegionSigners(
                new JsonIndex<SignerConfigJsonHelper, SignerConfig>("vpc/cn-beijing-6",
                    new SignerConfigJsonHelper("AWS4SignerType")));
        b.setHttpClients(
            new JsonIndex<HttpClientConfigJsonHelper, HttpClientConfig>(
                "AmazonMobiusClient",
                    new HttpClientConfigJsonHelper("mobius-transform", "mobius-transform-endpoint")),
            new JsonIndex<HttpClientConfigJsonHelper, HttpClientConfig>(
                "AmazonAffineJavaClient",
                    new HttpClientConfigJsonHelper("affine-transform", "affine-transform-endpoint")));
        String json = Jackson.toJsonPrettyString(b);
        p(json);
        InternalConfigJsonHelper b2 = Jackson.getObjectMapper().readValue(json, InternalConfigJsonHelper.class);
        String json2 = Jackson.toJsonPrettyString(b2);
        assertEquals(json, json2);
    }

    private static void p(Object o) {
        System.out.println(String.valueOf(o));
    }
}
