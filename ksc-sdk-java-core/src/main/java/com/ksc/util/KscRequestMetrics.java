/*
 * Copyright 2010-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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

package com.ksc.util;

import com.ksc.metrics.MetricType;
import com.ksc.metrics.RequestMetricType;

import org.apache.http.annotation.NotThreadSafe;

import java.util.Collections;
import java.util.List;

/**
 * Used as both a base class and a minimal support of KSC SDK request metrics.
 * The base class of supporting KSC SDK request metrics.
 * <p>
 * In contrast to {@link KscRequestMetricsFullSupport}, which is intended to be
 * a full support of KSC SDK request metrics, this class only provides access to
 * a {@link TimingInfo} instance that only has minimal support for start and end
 * time (ie with no-ops for sub-event measurements) for backward compatibility
 * reason. The other methods related to properties and counters in this class
 * are effectively no-ops.
 * <p>
 * This class is instantiated instead of {@link KscRequestMetricsFullSupport}
 * when request metric collection is not required during a particular service
 * request/response cycle.
 */
@NotThreadSafe
public class KscRequestMetrics {
    /**
     * Predefined KSC SDK metric types general across all KSC clients. Client
     * specific predefined metrics like S3 or DynamoDB are defined in the client
     * specific packages.
     */
    public enum Field implements RequestMetricType {
        KSCErrorCode,
        KSCRequestID,
        BytesProcessed,
        /**
         * Total number of milliseconds taken for a request/response including
         * the time taken to execute the request handlers, round trip to KSC,
         * and the time taken to execute the response handlers.
         */
        ClientExecuteTime,
        CredentialsRequestTime,

        Exception,
        /**
         * Used to count and preserve the throttle related exceptions.
         */
        ThrottleException,
        // Comment out for now. Ref: CR2662349
//        /**
//         * Used to preserve the transient exceptions that lead to the retries.
//         */
//        RetryCause,
        /**
         * Number of milliseconds taken for a request/response round trip to KSC.
         */
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        /**
         * Number of milliseconds taken to sign a request.
         */
        RequestSigningTime,
        /**
         * Number of milliseconds taken to execute the response handler for a response from KSC.
         */
        ResponseProcessingTime,
        /**
         * Number of requests to KSC.
         */
        RequestCount,
        /**
         * Number of retries of KSC SDK sending a request to KSC.
         */
        RetryCount, // captured via the RequestCount since (RetryCount = RequestCount - 1)
        /**
         * Snapshot of currently consumed retry capacity.
         */
        RetryCapacityConsumed,
        /**
         * Number of retries of the underlying http client library in sending a
         * request to KSC.
         */
        HttpClientRetryCount,
        /**
         * Time taken to send a request to KSC by the http client library,
         * excluding any retry.
         */
        HttpClientSendRequestTime,
        /**
         * Time taken to receive a response from KSC by the http client library,
         * excluding any retry.
         */
        HttpClientReceiveResponseTime,

        /**
         * Time taken for socket to read.
         */
        HttpSocketReadTime,

        /**
         * The number of idle persistent connections.
         * <p>
         * Reference: https://hc.apache
         * .org/httpcomponents-core-ga/httpcore/apidocs/org/apache
         * /http/pool/PoolStats.html
         */
        HttpClientPoolAvailableCount,
        /**
         * The number of persistent connections tracked by the connection
         * manager currently being used to execute requests.
         * <p>
         * Reference: https://hc
         * .apache.org/httpcomponents-core-ga/httpcore/apidocs/org/apache
         * /http/pool/PoolStats.html
         */
        HttpClientPoolLeasedCount,
        /**
         * The number of connection requests being blocked awaiting a free
         * connection.
         * <p>
         * Reference: https://hc.apache.org/httpcomponents-core-ga/httpcore
         * /apidocs/org/apache/http/pool/PoolStats.html
         */
        HttpClientPoolPendingCount,
        RetryPauseTime,
//      S3DownloadThroughput, // migrated to S3RequestMetric in the S3 client library
//      S3UploadThroughput,   // migrated to S3RequestMetric in the S3 client library
        ServiceEndpoint,
        ServiceName,
        StatusCode, // The http status code
        ;
    }

    protected final TimingInfo timingInfo;

    /**
     * This constructor should be used only in the case when KSC SDK metrics
     * collector is disabled, when minimal timing info is supported for backward
     * compatibility reasons.
     *
     * @see KscRequestMetricsFullSupport
     */
    public KscRequestMetrics() {
        this.timingInfo = TimingInfo.startTiming();
    }

    protected KscRequestMetrics(TimingInfo timingInfo) {
        this.timingInfo = timingInfo;
    }

    public final TimingInfo getTimingInfo() {
        return timingInfo;
    }
    /**
     * Returns true if this metrics is enabled; false otherwise.
     * Returns false by default.
     * */
    public boolean isEnabled() {
        return false;
    }

    public void startEvent(String eventName) {}
    public void startEvent(MetricType f) {}
    public void endEvent(String eventName) {}
    public void endEvent(MetricType f) {}

    public void incrementCounter(String event) {}
    public void incrementCounter(MetricType f) {}
    /** Fluent API of {@link #incrementCounter(String)} */
    public final KscRequestMetrics incrementCounterWith(String event) {
        incrementCounter(event);
        return this;
    }
    /** Fluent API of {@link #incrementCounter(MetricType)} */
    public final KscRequestMetrics incrementCounterWith(MetricType f) {
        incrementCounter(f);
        return this;
    }

    public void setCounter(String counterName, long count) {}
    public void setCounter(MetricType f, long count) {}
    /** Fluent API of {@link #setCounter(String, long)} */
    public final KscRequestMetrics withCounter(String counterName, long count) {
        setCounter(counterName, count);
        return this;
    }
    /** Fluent API of {@link #setCounter(MetricType, long)} */
    public final KscRequestMetrics withCounter(MetricType f, long count) {
        setCounter(f, count);
        return this;
    }

    public void addProperty(String propertyName, Object value) {}
    public void addProperty(MetricType f, Object value) {}
    /** Fluent API of {@link #addProperty(String, Object)} */
    public final KscRequestMetrics addPropertyWith(String propertyName, Object value) {
        addProperty(propertyName, value);
        return this;
    }
    /** Fluent API of {@link #addProperty(MetricType, Object)} */
    public final KscRequestMetrics addPropertyWith(MetricType f, Object value) {
        addProperty(f, value);
        return this;
    }

    public void log() {}
    public List<Object> getProperty(String propertyName){ return Collections.emptyList(); }
    public List<Object> getProperty(MetricType f) { return Collections.emptyList(); }
}
