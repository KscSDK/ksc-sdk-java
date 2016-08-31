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
package com.ksc.event;

import static com.ksc.event.SDKProgressPublisher.publishProgress;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;

import com.ksc.KscClientException;
import com.ksc.event.ProgressEvent;
import com.ksc.event.ProgressEventType;
import com.ksc.event.ProgressListener;
import com.ksc.event.SyncProgressListener;
import com.ksc.event.ProgressListener.ExceptionReporter;

public class ProgressListenerTest {
    // Listener is executed synchronously
    @Test
    public void throwErrorWithSyncListener() {
        ProgressListener syncListener = new SyncProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                throw new Error();
            }
        };
        ExceptionReporter reporter =
            ExceptionReporter.wrap(syncListener);
        publishProgress(syncListener, ProgressEventType.CLIENT_REQUEST_STARTED_EVENT);
        assertNull(reporter.getCause());
        publishProgress(reporter, ProgressEventType.CLIENT_REQUEST_STARTED_EVENT);
        assertNotNull(reporter.getCause());
        try {
            reporter.throwExceptionIfAny();
            fail();
        } catch(KscClientException ex) {
            // expected
        }
    }

    // Listener is executed asynchronously
    @Test
    public void throwErrorWithAsyncListener() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        ProgressListener asyncListener = new ProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                throw new Error();
            }
        };
        ExceptionReporter reporter = new ExceptionReporter(asyncListener) {
            @Override public void progressChanged(ProgressEvent progressEvent) {
                super.progressChanged(progressEvent);
                latch.countDown();
            }
        };
        publishProgress(reporter, ProgressEventType.CLIENT_REQUEST_STARTED_EVENT);
        latch.await();
        assertNotNull(reporter.getCause());
        try {
            reporter.throwExceptionIfAny();
            fail();
        } catch(KscClientException ex) {
            // expected
        }
    }
}
