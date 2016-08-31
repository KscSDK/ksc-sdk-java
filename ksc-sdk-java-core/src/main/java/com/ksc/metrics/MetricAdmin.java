/*
 * Copyright 2011-2016 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://ksyun.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ksc.metrics;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.ksc.regions.Regions;

/**
 *  Administration of KscSdkMetrics as an MBean.
 */
public class MetricAdmin implements MetricAdminMBean {
    @Override
    public boolean enableDefaultMetrics() {
        return KscSdkMetrics.enableDefaultMetrics();
    }
    @Override
    public void disableMetrics() {
        KscSdkMetrics.disableMetrics();
    }
    @Override
    public String getRequestMetricCollector() {
        MetricCollector mc = KscSdkMetrics.getInternalMetricCollector();
        RequestMetricCollector rmc = mc == null ? null : mc.getRequestMetricCollector();
        return mc == null || rmc == RequestMetricCollector.NONE
             ? "NONE"
             : rmc.getClass().getName()
             ;
    }
    @Override
    public String getServiceMetricCollector() {
        MetricCollector mc = KscSdkMetrics.getInternalMetricCollector();
        ServiceMetricCollector smc = mc == null ? null : mc.getServiceMetricCollector();
        return mc == null || smc == ServiceMetricCollector.NONE
             ? "NONE"
             : smc.getClass().getName()
             ;
    }
    @Override
    public boolean isMetricsEnabled() {
        return KscSdkMetrics.isMetricsEnabled();
    }

    @Override
    public boolean isMachineMetricsExcluded() {
        return KscSdkMetrics.isMachineMetricExcluded();
    }
    @Override
    public void setMachineMetricsExcluded(boolean excludeJvmMetrics) {
        KscSdkMetrics.setMachineMetricsExcluded(excludeJvmMetrics);
    }
    @Override
    public String getRegion() {
        Regions region = KscSdkMetrics.getRegion();
        return region == null ? null : region.getName();
    }
    @Override
    public void setRegion(String region) {
        if (region == null || region.isEmpty())
            KscSdkMetrics.setRegion(null);
        else {
            KscSdkMetrics.setRegion(Regions.fromName(region));
        }
    }
    @Override
    public Integer getMetricQueueSize() {
        return KscSdkMetrics.getMetricQueueSize();
    }
    @Override
    public void setMetricQueueSize(Integer metricQueueSize) {
        KscSdkMetrics.setMetricQueueSize(metricQueueSize);
        
    }
    @Override
    public Integer getQueuePollTimeoutMilli() {
        Long queuePollTimeoutMilli = KscSdkMetrics.getQueuePollTimeoutMilli();
        return queuePollTimeoutMilli == null ? null : queuePollTimeoutMilli.intValue();
    }
    @Override
    public void setQueuePollTimeoutMilli(Integer timeoutMilli) {
        KscSdkMetrics.setQueuePollTimeoutMilli(timeoutMilli == null ? null : timeoutMilli.longValue());
    }
    @Override
    public String getMetricNameSpace() {
        return KscSdkMetrics.getMetricNameSpace();
    }
    @Override
    public void setMetricNameSpace(String metricNameSpace) {
        KscSdkMetrics.setMetricNameSpace(metricNameSpace);
    }

    @Override
    public boolean isPerHostMetricsIncluded() {
        return KscSdkMetrics.isPerHostMetricIncluded();
    }
    @Override
    public void setPerHostMetricsIncluded(boolean includePerHostMetrics) {
        KscSdkMetrics.setPerHostMetricsIncluded(includePerHostMetrics);
    }
    @Override
    public String getJvmMetricName() {
        return KscSdkMetrics.getJvmMetricName();
    }
    @Override
    public void setJvmMetricName(String jvmMetricName) {
        KscSdkMetrics.setJvmMetricName(jvmMetricName);
    }
    @Override
    public String getHostMetricName() {
        return KscSdkMetrics.getHostMetricName();
    }
    @Override
    public void setHostMetricName(String hostMetricName) {
        KscSdkMetrics.setHostMetricName(hostMetricName);
    }
    @Override
    public String getCredentialFile() {
        return KscSdkMetrics.getCredentailFile();
    }
    
    @Override
    public void setCredentialFile(String filepath)
            throws FileNotFoundException, IOException {
        KscSdkMetrics.setCredentialFile(filepath);
    }
    @Override
    public boolean isSingleMetricNamespace() {
        return KscSdkMetrics.isSingleMetricNamespace();
    }
    @Override
    public void setSingleMetricNamespace(boolean singleMetricNamespace) {
        KscSdkMetrics.setSingleMetricNamespace(singleMetricNamespace);
    }
}