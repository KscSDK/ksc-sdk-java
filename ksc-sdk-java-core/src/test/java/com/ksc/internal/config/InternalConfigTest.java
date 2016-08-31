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

package com.ksc.internal.config;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ksc.internal.config.InternalConfig;
import com.ksc.internal.config.InternalConfigJsonHelper;
import com.ksc.internal.config.SignerConfig;
import com.ksc.regions.Regions;
import com.ksc.util.ClassLoaderHelper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class InternalConfigTest {

    private static InternalConfig config = null;

    private static final String DEFAULT_SIGNER_TYPE = "AWS4SignerType";

    private static final String S3V4_SIGNER_TYPE = "AWS4SignerType";

    private static final String NEW_REGION = "newregion";

    private static final Map<String, String> serviceSignerMap = new HashMap<String, String>();

    @BeforeClass
    public static void setUp() throws JsonParseException, JsonMappingException,
            IOException {
        config = InternalConfig.Factory.getInternalConfig();
        assertNotNull(config);
        assertSame(config, InternalConfig.Factory.getInternalConfig());

        serviceSignerMap.put("kec", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("vpc", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("s3", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("eip", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("slb", DEFAULT_SIGNER_TYPE);
        serviceSignerMap.put("iam", DEFAULT_SIGNER_TYPE);
    }

    /**
     * This test case tests signers for all AWS regions mentioned in the
     * <code>Regions</code>
     */
    @Test
    public void testServiceSpecificSigners() {
        Set<Map.Entry<String, String>> entrySet = serviceSignerMap.entrySet();

        for (Entry<String, String> entry : entrySet) {
            testAllRegions(entry.getKey(), entry.getValue());
        }
    }

    private void testAllRegions(String serviceName, String signerType) {

        assertSignerType(DEFAULT_SIGNER_TYPE, serviceName, null);
        for (Regions region : Regions.values()) {

            if (region == Regions.CN_BEIJING_6) {
                signerType = DEFAULT_SIGNER_TYPE;
            }

            assertSignerType(signerType, serviceName, region.getName());
        }
    }

    /**
     * This test case tests the Amazon S3 specific signers.
     */
    @Test
    public void testS3Signers() {
        final String serviceName = "s3";
        assertSignerType(S3V4_SIGNER_TYPE, serviceName, null);

        for (Regions region : Regions.values()) {
            assertSignerType(S3V4_SIGNER_TYPE, serviceName,
                    region.getName());
        }
        assertSignerType(S3V4_SIGNER_TYPE, serviceName, NEW_REGION);
    }

    @Test
    public void testSDBSigners() {
        assertSignerType("AWS4SignerType", "kec", "cn-beijing-6");
    }

    /**
     * This test case tests the Import/Export specific signers.
     */
    @Test
    public void testImportExportSigners() {
        assertSignerType("AWS4SignerType", "importexport", null);
    }

    /**
     * This test case tests the Simple Email Service specific signers.
     */
    @Test
    public void testSimpleEmailServiceSigners() {
        assertSignerType(DEFAULT_SIGNER_TYPE, "email", "cn-beijing-6");
        assertSignerType(DEFAULT_SIGNER_TYPE, "email", "cn-shanghai-3");
        assertSignerType(DEFAULT_SIGNER_TYPE, "email", NEW_REGION);
    }

    /**
     * This test cases tests the default signers for any new regions added to
     * any AWS service.
     */
    @Test
    public void testNewRegions() {
        assertSignerType(DEFAULT_SIGNER_TYPE, "kec", NEW_REGION);
        assertSignerType(DEFAULT_SIGNER_TYPE, "vpc", NEW_REGION);
        assertSignerType(DEFAULT_SIGNER_TYPE, "eip", NEW_REGION);
        assertSignerType(DEFAULT_SIGNER_TYPE, "slb", NEW_REGION);
    }

    private void assertSignerType(String expected, String serviceName,
            String region) {
        SignerConfig signer = config.getSignerConfig(serviceName, region);
        assertEquals("Service Signer validation failed for " + serviceName
                + " in region " + region, expected, signer.getSignerType());
    }

    /**
     * This test case tests the Cognito specific signers.
     */
    @Test
    public void testCognitoAssertions() {
        assertSignerType("AWS4SignerType", "cognito-identity", null);
        assertSignerType("AWS4SignerType", "cognito-identity",
                Regions.CN_BEIJING_6.getName());
        assertSignerType("AWS4SignerType", "cognito-sync", null);
        assertSignerType("AWS4SignerType", "cognito-sync",
                Regions.CN_BEIJING_6.getName());
    }

    @Test
    public void loadFromFile() throws Exception {
        loadFrom(InternalConfig.DEFAULT_CONFIG_RESOURCE_ABSOLUTE_PATH);
    }

    private void loadFrom(String resource) throws Exception {
        URL url = ClassLoaderHelper.getResource(resource);
        assertNotNull(url);
        InternalConfigJsonHelper config = InternalConfig.loadfrom(url);
        assertNotNull(config);
    }

    @Test
    public void load() throws Exception {
        InternalConfig config = InternalConfig.load();
        assertNotNull(config);
        config.dump();
    }
}
