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
package com.ksc;

/**
 * Base exception class for any errors that occur while attempting to use an KSC
 * client from KSC SDK for Java to make service calls to KSC Web Services.
 * 
 * Error responses from services will be handled as KscServiceExceptions. 
 * This class is primarily for errors that occur when unable to get a response
 * from a service, or when the client is unable to parse the response from a
 * service. For example, if a caller tries to use a client to make a service
 * call, but no network connection is present, an KscClientException will be
 * thrown to indicate that the client wasn't able to successfully make the
 * service call, and no information from the service is available.
 * 
 * Note : If the SDK is able to parse the response; but doesn't recognize the 
 * error code from the service, an KscServiceException is thrown
 * 
 * Callers should typically deal with exceptions through KscServiceException,
 * which represent error responses returned by services. KscServiceException
 * has much more information available for callers to appropriately deal with
 * different types of errors that can occur.
 * 
 * @see KscServiceException
 */
public class KscClientException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new KscClientException with the specified message, and root
     * cause.
     * 
     * @param message
     *            An error message describing why this exception was thrown.
     * @param t
     *            The underlying cause of this exception.
     */
    public KscClientException(String message, Throwable t) {
        super(message, t);
    }

    /**
     * Creates a new KscClientException with the specified message.
     * 
     * @param message
     *            An error message describing why this exception was thrown.
     */
    public KscClientException(String message) {
        super(message);
    }

    public KscClientException(Throwable t) {
        super(t);
    }

    /**
     * Returns a hint as to whether it makes sense to retry upon this exception.
     * Default is true, but subclass may override.
     *
     * This method is internal to the SDK. Users should not depend on this method to decide
     * if an exception from an  service should be retried.
     */
    public boolean isRetryable() {
        return true;
    }
}
