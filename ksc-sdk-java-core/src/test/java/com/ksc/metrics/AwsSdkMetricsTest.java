/*
 * Copyright 2010-2016 ksyun.com, Inc. or its affiliates. All Rights
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
package com.ksc.metrics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.ksc.metrics.KscSdkMetrics;
import com.ksc.metrics.MetricCollector;
import com.ksc.metrics.MetricType;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.metrics.ServiceMetricCollector;
import com.ksc.util.KscRequestMetrics.Field;

public class AwsSdkMetricsTest {
    /**
     * By default the AWS SDK metric collection is disabled. Enabling it should
     * fail unless the necessary CloudWatch related jars are on the classpath.
     * Therefore, this test is expected to fail in enabling the default metric
     * collection, but have absolutely no impact otherwise.
     */
    //@Test
    public void enableDefaultMetrics() {
        Assert.assertFalse(KscSdkMetrics.enableDefaultMetrics());
    }

    @Test
    public void test() {
        // by default, it's disabled
        assertFalse(KscSdkMetrics.isDefaultMetricsEnabled());
        // won't be anble to enable unless the default impl library is on the classpath
        //assertFalse(AwsSdkMetrics.enableDefaultMetrics());
        assertFalse(KscSdkMetrics.isDefaultMetricsEnabled());
        assertSame(RequestMetricCollector.NONE, KscSdkMetrics.getRequestMetricCollector());
        assertFalse(KscSdkMetrics.isDefaultMetricsEnabled());
        // effectively no effect
        KscSdkMetrics.disableMetrics();
        assertFalse(KscSdkMetrics.isDefaultMetricsEnabled());
    }

    @Test
    public void defaultMetricTypes() {
        // Default set of predefined metric types is not empty
        Set<MetricType> set = KscSdkMetrics.getPredefinedMetrics();
        assertNotNull(set);
        assertTrue(set.size() > 0);
        // Clear out the default set of predefined metric types
        KscSdkMetrics.set(Collections.<MetricType>emptyList());
        Set<MetricType> empty = KscSdkMetrics.getPredefinedMetrics();
        assertNotNull(empty);
        assertTrue(empty.size() == 0);
        // Reconfigure the default set of predefined metric types back to the original
        KscSdkMetrics.set(set);
        Set<MetricType> set2 = KscSdkMetrics.getPredefinedMetrics();
        assertNotNull(set2);
        assertTrue(set2.size() > 0);
        // Not the same due to ensuring thread-safety
        assertNotSame(set, set2);
    }

    @Test
    public void setNullOrEmpty() {
        Set<MetricType> orig = KscSdkMetrics.getPredefinedMetrics();
        assertTrue(orig.size() > 0);
        KscSdkMetrics.set(null);
        Set<MetricType> empty = KscSdkMetrics.getPredefinedMetrics();
        assertTrue(empty.size() == 0);
        KscSdkMetrics.set(null);
        Set<MetricType> stillEmpty = KscSdkMetrics.getPredefinedMetrics();
        assertSame(empty, stillEmpty);
        KscSdkMetrics.set(Collections.<MetricType>emptySet());
        Set<MetricType> empty3 = KscSdkMetrics.getPredefinedMetrics();
        assertSame(empty, empty3);
        KscSdkMetrics.set(orig);
    }
    @Test
    public void addNull() {
        assertFalse(KscSdkMetrics.add(null));
    }
    @Test
    public void addAllNull() {
        assertFalse(KscSdkMetrics.addAll(null));
        assertFalse(KscSdkMetrics.addAll(Collections.<MetricType>emptyList()));
    }
    @Test
    public void removeNull() {
        assertFalse(KscSdkMetrics.remove(null));
    }

    @Test
    public void addAndRemove() {
        Set<MetricType> orig = KscSdkMetrics.getPredefinedMetrics();
        KscSdkMetrics.set(null);
        // Test add and remove
        assertTrue(KscSdkMetrics.getPredefinedMetrics().isEmpty());
        KscSdkMetrics.add(Field.ClientExecuteTime);
        assertFalse(KscSdkMetrics.getPredefinedMetrics().isEmpty());
        KscSdkMetrics.remove(Field.ClientExecuteTime);
        assertTrue(KscSdkMetrics.getPredefinedMetrics().isEmpty());
        // Test add more than one entry
        KscSdkMetrics.add(Field.ClientExecuteTime);
        KscSdkMetrics.add(Field.Exception);
        assertTrue(KscSdkMetrics.getPredefinedMetrics().size() == 2);
        KscSdkMetrics.set(null);
        assertTrue(KscSdkMetrics.getPredefinedMetrics().isEmpty());
        // Test addAll
        KscSdkMetrics.addAll(Arrays.asList(Field.Exception, Field.ClientExecuteTime));
        assertTrue(KscSdkMetrics.getPredefinedMetrics().size() == 2);
        KscSdkMetrics.set(orig);
        assertTrue(KscSdkMetrics.getPredefinedMetrics().size() == orig.size());
    }

    @Test
    public void setJvmMetricsExcluded() {
        final boolean b = KscSdkMetrics.isMachineMetricExcluded();
        KscSdkMetrics.setMachineMetricsExcluded(b);
        assertTrue(b == KscSdkMetrics.isMachineMetricExcluded());
        KscSdkMetrics.setMachineMetricsExcluded(!b);
        assertFalse(b == KscSdkMetrics.isMachineMetricExcluded());
        KscSdkMetrics.setMachineMetricsExcluded(b);
        assertTrue(b == KscSdkMetrics.isMachineMetricExcluded());
    }

    @Test
    public void setPerHostMetricsIncluded() {
        final boolean b = KscSdkMetrics.isPerHostMetricIncluded();
        KscSdkMetrics.setPerHostMetricsIncluded(b);
        assertTrue(b == KscSdkMetrics.isPerHostMetricIncluded());
        KscSdkMetrics.setPerHostMetricsIncluded(!b);
        assertFalse(b == KscSdkMetrics.isPerHostMetricIncluded());
        KscSdkMetrics.setPerHostMetricsIncluded(b);
        assertTrue(b == KscSdkMetrics.isPerHostMetricIncluded());
    }

    @Test
    public void testEnableHttpSocketReadMetric() {
        assertFalse(KscSdkMetrics.isHttpSocketReadMetricEnabled());
        KscSdkMetrics.enableHttpSocketReadMetric();
        assertTrue(KscSdkMetrics.isHttpSocketReadMetricEnabled());
    }

    @Test
    public void isMetricEnabled() {
        // originally disabled
        assertFalse(KscSdkMetrics.isMetricsEnabled());
        // set to NONE, so still disabled
        KscSdkMetrics.setMetricCollector(MetricCollector.NONE);
        assertFalse(KscSdkMetrics.isMetricsEnabled());
        // set to a custom collector, so now considered enabled
        KscSdkMetrics.setMetricCollector(new MetricCollector() {
            @Override public boolean start() { return true; }
            @Override public boolean stop() { return false; }
            @Override public boolean isEnabled() { return true; }
            @Override
            public RequestMetricCollector getRequestMetricCollector() {
                return RequestMetricCollector.NONE;
            }
            @Override
            public ServiceMetricCollector getServiceMetricCollector() {
                return ServiceMetricCollector.NONE;
            }
        });
        assertTrue(KscSdkMetrics.isMetricsEnabled());
    }
}
