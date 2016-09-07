/*
 * Copyright 2015-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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
package com.ksc.http.settings;

import java.net.InetAddress;
import java.security.SecureRandom;

import com.ksc.ApacheHttpClientConfig;
import com.ksc.ClientConfiguration;
import com.ksc.DnsResolver;
import com.ksc.annotation.SdkInternalApi;
import com.ksc.util.ValidationUtils;

/**
 * A convienient class that expose all settings in {@link ClientConfiguration} and other internal settings to the
 * underlying http client.
 */
@SdkInternalApi
public class HttpClientSettings {

    private final ClientConfiguration config;

    private final boolean useBrowserCompatibleHostNameVerifier;

    HttpClientSettings(final ClientConfiguration config,
                       final boolean useBrowserCompatibleHostNameVerifier) {
        this.config = ValidationUtils.assertNotNull(config, "client configuration");
        this.useBrowserCompatibleHostNameVerifier = useBrowserCompatibleHostNameVerifier;
    }

    public static HttpClientSettings adapt(final ClientConfiguration config,
                                           final boolean useBrowserCompatibleHostNameVerifier) {
        return new HttpClientSettings(config, useBrowserCompatibleHostNameVerifier);
    }

    public static HttpClientSettings adapt(final ClientConfiguration config) {
        return adapt(config, false);
    }

    public boolean useBrowserCompatibleHostNameVerifier() {
        return useBrowserCompatibleHostNameVerifier;
    }

    public int getMaxConnections() {
        return config.getMaxConnections();
    }

    public InetAddress getLocalAddress() {
        return config.getLocalAddress();
    }

    public String getProxyHost() {
        return config.getProxyHost();
    }

    public int getProxyPort() {
        return config.getProxyPort();
    }

    public String getProxyUsername() {
        return config.getProxyUsername();
    }

    public String getProxyPassword() {
        return config.getProxyPassword();
    }

    public String getNonProxyHosts() {
        return config.getNonProxyHosts();
    }

    public boolean useReaper() {
        return config.useReaper();
    }

    public boolean useGzip() {
        return config.useGzip();
    }

    public DnsResolver getDnsResolver() {
        return config.getDnsResolver();
    }

    public ApacheHttpClientConfig getApacheHttpClientConfig() {
        return config.getApacheHttpClientConfig();
    }

    public int getSocketTimeout() {
        return config.getSocketTimeout();
    }

    public int[] getSocketBufferSize() {
        return config.getSocketBufferSizeHints();
    }

    public boolean useTcpKeepAlive() {
        return config.useTcpKeepAlive();
    }

    public SecureRandom getSecureRandom() {
        return config.getSecureRandom();
    }

    public int getConnectionTimeout() {
        return config.getConnectionTimeout();
    }

    public int getConnectionPoolRequestTimeout() {
        return config.getConnectionTimeout();
    }

    public long getConnectionPoolTTL() {
        return config.getConnectionTTL();
    }

    public long getMaxIdleConnectionTime() {
        return config.getConnectionMaxIdleMillis();
    }

    public String getProxyWorkstation() {
        return config.getProxyWorkstation();
    }

    public String getProxyDomain() {
        return config.getProxyDomain();
    }

    public boolean isPreemptiveBasicProxyAuth() {
        return config.isPreemptiveBasicProxyAuth();
    }

    public boolean isUseExpectContinue() {
        return config.isUseExpectContinue();
    }

}
