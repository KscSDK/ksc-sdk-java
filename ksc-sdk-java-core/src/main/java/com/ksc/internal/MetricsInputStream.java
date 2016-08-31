/*
 * Copyright 2013-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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

package com.ksc.internal;

import java.io.IOException;
import java.io.InputStream;

import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

/**
 * Record input stream read time into {@link KscRequestMetrics} under metric type
 * HttpSocketReadTime;
 */
public class MetricsInputStream extends DelegateInputStream {

    private KscRequestMetrics metrics;

    public MetricsInputStream(InputStream in) {
        super(in);
    }

    public void setMetrics(KscRequestMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * {@inheritDoc}
     * Record the read time into the metrics.
     */
    @Override
    public int read() throws IOException {
        if (metrics != null) {
            metrics.startEvent(Field.HttpSocketReadTime);
        }
        try {
            return in.read();
        } finally {
            if (metrics != null) {
                metrics.endEvent(Field.HttpSocketReadTime);
            }
        }
    }

    /**
     * {@inheritDoc}
     *
     * Record the read time into the metrics.
     */
    @Override
    public int read(byte b[]) throws IOException {
        if (metrics != null) {
            metrics.startEvent(Field.HttpSocketReadTime);
        }
        try {
            return in.read(b);
        } finally {
            if (metrics != null) {
                metrics.endEvent(Field.HttpSocketReadTime);
            }
        }
    }

    /**
     * {@inheritDoc}
     *
     * Record the read time into the metrics.
     */
    @Override
    public int read(byte b[], int off, int len) throws IOException {
        if (metrics != null) {
            metrics.startEvent(Field.HttpSocketReadTime);
        }
        try {
            return in.read(b, off, len);
        } finally {
            if (metrics != null) {
                metrics.endEvent(Field.HttpSocketReadTime);
            }
        }
    }
}
