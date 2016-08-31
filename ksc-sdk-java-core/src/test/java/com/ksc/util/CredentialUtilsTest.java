/*
 * Copyright 2015-2016 ksyun.com, Inc. or its affiliates. All Rights
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

import com.ksc.KscWebServiceRequest;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.util.CredentialUtils;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.Matchers;

public class CredentialUtilsTest {

    @Test
    public void request_credentials_takes_precendence_over_client_credentials() {
        final String awsAccessKeyId = "foo";
        final String awsSecretAccessKey = "bar";
        final AWSCredentials reqCredentials = new BasicAWSCredentials(awsAccessKeyId,
                awsSecretAccessKey);
        KscWebServiceRequest req = new KscWebServiceRequest() {
            @Override
            public AWSCredentials getRequestCredentials() {
                return reqCredentials;
            }
        };
        AWSCredentialsProvider actual = CredentialUtils.getCredentialsProvider(req,
                null);

        Assert.assertThat(actual, Matchers.instanceOf(StaticCredentialsProvider
                .class));
        Assert.assertEquals(awsAccessKeyId, actual.getCredentials().getAWSAccessKeyId());
        Assert.assertEquals(awsSecretAccessKey, actual.getCredentials().getAWSSecretKey());
    }

    @Test
    public void base_credentials_returned_when_no_request_credentials_is_present() {
        final String awsAccessKeyId = "foo";
        final String awsSecretAccessKey = "bar";
        final StaticCredentialsProvider base = new StaticCredentialsProvider
                (new BasicAWSCredentials(awsAccessKeyId, awsSecretAccessKey));

        AWSCredentialsProvider actual = CredentialUtils
                .getCredentialsProvider(null, base);
        Assert.assertThat(actual, Matchers.instanceOf(StaticCredentialsProvider
                .class));
        Assert.assertEquals(awsAccessKeyId, actual.getCredentials().getAWSAccessKeyId());
        Assert.assertEquals(awsSecretAccessKey, actual.getCredentials().getAWSSecretKey());
    }
}
