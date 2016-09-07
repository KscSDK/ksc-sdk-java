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
package com.ksc.transform;

import java.lang.reflect.Constructor;

import com.ksc.KscServiceException;

public abstract class AbstractErrorUnmarshaller<T> implements Unmarshaller<KscServiceException, T> {

    /**
     * The type of AmazonServiceException that will be instantiated. Subclasses
     * specialized for a specific type of exception can control this through the
     * protected constructor.
     */
    protected final Class<? extends KscServiceException> exceptionClass;

    /**
     * Constructs a new error unmarshaller that will unmarshall error responses
     * into AmazonServiceException objects.
     */
    public AbstractErrorUnmarshaller() {
        this(KscServiceException.class);
    }

    /**
     * Constructs a new error unmarshaller that will unmarshall error responses
     * into objects of the specified class, extending AmazonServiceException.
     * 
     * @param exceptionClass
     *            The subclass of AmazonServiceException which will be
     *            instantiated and populated by this class.
     */
    public AbstractErrorUnmarshaller(Class<? extends KscServiceException> exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

    /**
     * Constructs a new exception object of the type specified in this class's
     * constructor and sets the specified error message.
     * 
     * @param message
     *            The error message to set in the new exception object.
     * 
     * @return A new exception object of the type specified in this class's
     *         constructor and sets the specified error message.
     * 
     * @throws Exception
     *             If there are any problems using reflection to invoke the
     *             exception class's constructor.
     */
    protected KscServiceException newException(String message) throws Exception {
        Constructor<? extends KscServiceException> constructor = exceptionClass.getConstructor(String.class);
        return constructor.newInstance(message);
    }

}
