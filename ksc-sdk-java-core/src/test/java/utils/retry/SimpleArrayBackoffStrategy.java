/*
 * Copyright 2011-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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
package utils.retry;

import com.ksc.KscClientException;
import com.ksc.KscWebServiceRequest;
import com.ksc.retry.RetryPolicy.BackoffStrategy;

/**
 * Backoff strategy used in tests to pull backoff value from a backing array. Number of retries is
 * limited to size of array.
 */
public final class SimpleArrayBackoffStrategy implements BackoffStrategy {

    private final int[] backoffValues;

    public SimpleArrayBackoffStrategy(int[] backoffValues) {
        this.backoffValues = backoffValues;
    }

    @Override
    public long delayBeforeNextRetry(KscWebServiceRequest originalRequest,
                                     KscClientException exception,
                                     int retriesAttempted) {
        return backoffValues[retriesAttempted];
    }
}