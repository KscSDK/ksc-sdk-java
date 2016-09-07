/*
 * Copyright 2014-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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
package com.ksc.auth.profile.internal.securitytoken;

import com.ksc.auth.AWSCredentialsProvider;

/**
 * Loads <code>com.amazonaws.services.securitytoken.internal.STSProfileCredentialsService</code>
 * from the STS SDK module, if the module is on the current classpath.
 */
public class STSProfileCredentialsServiceLoader implements ProfileCredentialsService {
    private static final STSProfileCredentialsServiceLoader INSTANCE = new STSProfileCredentialsServiceLoader();

    private STSProfileCredentialsServiceLoader() {
    }

    @Override
    public AWSCredentialsProvider getAssumeRoleCredentialsProvider(RoleInfo targetRoleInfo) {
        return new STSProfileCredentialsServiceProvider(targetRoleInfo);
    }

    public static STSProfileCredentialsServiceLoader getInstance() {
        return INSTANCE;
    }
}
