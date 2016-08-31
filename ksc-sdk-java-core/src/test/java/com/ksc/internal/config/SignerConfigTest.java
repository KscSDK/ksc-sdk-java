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

import com.ksc.internal.config.SignerConfig;
import com.ksc.internal.config.SignerConfigJsonHelper;
import com.ksc.util.json.Jackson;

public class SignerConfigTest {

    @Test
    public void test() throws Exception {
        p(Jackson.toJsonPrettyString(new SignerConfig("AWS4SignerType")));
        String json = Jackson.toJsonPrettyString(new SignerConfig("AWS4SignerType"));
        SignerConfig copy = Jackson.getObjectMapper().readValue(json, SignerConfigJsonHelper.class).build();
        String json2 = Jackson.toJsonPrettyString(copy);
        assertEquals(json, json2);
    }

    private static void p(Object o) {
        System.out.println(String.valueOf(o));
    }
}
