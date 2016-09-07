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

import com.ksc.KscClientException;
import com.ksc.annotation.ThreadSafe;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;

@ThreadSafe
public class STSProfileCredentialsServiceProvider implements AWSCredentialsProvider {
    private static final String CLASS_NAME = "com.amazonaws.services.securitytoken.internal.STSProfileCredentialsService";
    private static volatile ProfileCredentialsService STS_CREDENTIALS_SERVICE;

    private final RoleInfo roleInfo;
    private volatile AWSCredentialsProvider profileCredentialsProvider;

    public STSProfileCredentialsServiceProvider(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }

    private AWSCredentialsProvider getProfileCredentialsProvider() {
        if (this.profileCredentialsProvider == null) {
            synchronized (STSProfileCredentialsServiceProvider.class) {
                if (this.profileCredentialsProvider == null) {
                    this.profileCredentialsProvider = getProfileCredentialService()
                            .getAssumeRoleCredentialsProvider(roleInfo);
                }
            }
        }
        return this.profileCredentialsProvider;
    }

    /**
     * Only called once per creation of each profile credential provider so we don't bother with any
     * double checked locking.
     */
    private static synchronized ProfileCredentialsService getProfileCredentialService() {
        if (STS_CREDENTIALS_SERVICE == null) {
            try {
                STS_CREDENTIALS_SERVICE = (ProfileCredentialsService) Class.forName(CLASS_NAME)
                        .newInstance();
            } catch (ClassNotFoundException ex) {
                throw new KscClientException(
                        "To use assume role profiles the aws-java-sdk-sts module must be on the class path.",
                        ex);
            } catch (InstantiationException ex) {
                throw new KscClientException("Failed to instantiate " + CLASS_NAME, ex);
            } catch (IllegalAccessException ex) {
                throw new KscClientException("Failed to instantiate " + CLASS_NAME, ex);
            }
        }
        return STS_CREDENTIALS_SERVICE;
    }


    @Override
    public AWSCredentials getCredentials() {
        return getProfileCredentialsProvider().getCredentials();
    }

    @Override
    public void refresh() {
        getProfileCredentialsProvider().refresh();
    }
}
