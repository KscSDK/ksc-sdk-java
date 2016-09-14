/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.ksc.regions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ksc.util.ValidationUtils;

/**
 * An implementation of {@link RegionImpl} that holds all information in memory.
 */
// TODOFIX
public class InMemoryRegionImpl implements RegionImpl {

    private static final String DEFAULT_DOMAIN = "api.ksyun.com";
    
    private static final String INNER_DOMAIN = "inner.api.ksyun.com";

    private final String name;

    private final String domain;
    
    private final boolean isInner;

    private final Map<String, String> endpoints = new HashMap<String,
            String>();

    private final List<String> https = new ArrayList<String>();

    private final List<String> http = new ArrayList<String>();
    public InMemoryRegionImpl(String name, String domain) {
        this(name,domain,false);
       
    }
    public InMemoryRegionImpl(String name, String domain,boolean isInner) {
        ValidationUtils.assertNotNull(name, "region name");
        this.name = name;
        if(isInner){
        	this.domain = domain == null ? INNER_DOMAIN : domain;
        }else{
        	this.domain = domain == null ? DEFAULT_DOMAIN : domain;
        }
        this.isInner=isInner;
    }

    public InMemoryRegionImpl addEndpoint(String serviceName, String endpoint) {
        ValidationUtils.assertNotNull(serviceName, "service name");
        ValidationUtils.assertNotNull(endpoint, "endpoint");

        endpoints.put(serviceName, endpoint);
        return this;
    }

    public InMemoryRegionImpl addHttps(String serviceName) {
        https.add(serviceName);
        return this;
    }

    public InMemoryRegionImpl addHttp(String serviceName) {
        http.add(serviceName);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDomain() {
        return domain;
    }

    @Override
    public String getPartition() {
        throw new UnsupportedOperationException("Partition is not available in the in memory implementation");
    }

    @Override
    public boolean isServiceSupported(String serviceName) {
        return endpoints.containsKey(serviceName);
    }

    @Override
    public String getServiceEndpoint(String serviceName) {
        return endpoints.get(serviceName);
    }

    @Override
    public boolean hasHttpsEndpoint(String serviceName) {
        return https.contains(serviceName);
    }

    @Override
    public boolean hasHttpEndpoint(String serviceName) {
        return http.contains(serviceName);
    }

    @Override
    public Collection<String> getAvailableEndpoints() {
        return Collections.unmodifiableCollection(endpoints.values());
    }
	public boolean isInner() {
		return isInner;
	}
	
    
}
