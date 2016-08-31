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
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.internal.StaticCredentialsProvider;

public class CredentialUtils {

    /**
     *  Returns the credentials provider that will be used to fetch the
     *  credentials when signing the request. Request specific credentials
     *  takes precedence over the credentials/credentials provider set in the
     *  client.
     */
    @SuppressWarnings("deprecation")
	public static AWSCredentialsProvider getCredentialsProvider(
            KscWebServiceRequest req,
            AWSCredentialsProvider base) {

        if (req != null && req.getRequestCredentials() != null) {
            return new StaticCredentialsProvider(req.getRequestCredentials());
        }
        return base;
    }
}
