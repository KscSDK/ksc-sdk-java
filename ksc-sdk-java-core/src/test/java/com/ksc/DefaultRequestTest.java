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
package com.ksc;

import com.ksc.DefaultRequest;
import com.ksc.Request;
import com.ksc.handlers.HandlerContextKey;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for context in a DefaultRequest class.
 */
public class DefaultRequestTest {

    @Test
    public void getContext_returns_the_value_set() {

        Request<?> request = new DefaultRequest<Object>(null, "service-name");

        Integer intValue = new Integer(10);

        HandlerContextKey<Integer> integerContextKey = new HandlerContextKey<Integer>
                ("integer-context-key");

        request.addHandlerContext(integerContextKey, intValue);

        Assert.assertEquals(intValue, request.getHandlerContext
                (integerContextKey));
    }
}