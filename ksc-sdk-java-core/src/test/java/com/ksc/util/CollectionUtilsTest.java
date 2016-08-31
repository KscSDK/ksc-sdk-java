/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.ksc.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import com.ksc.util.CollectionUtils;

public class CollectionUtilsTest {

    @Test
    public void isEmpty_NullCollection_ReturnsTrue() {
        assertTrue(CollectionUtils.isNullOrEmpty(null));
    }

    @Test
    public void isEmpty_EmptyCollection_ReturnsTrue() {
        assertTrue(CollectionUtils.isNullOrEmpty(Collections.emptyList()));
    }

    @Test
    public void isEmpty_NonEmptyCollection_ReturnsFalse() {
        assertFalse(CollectionUtils.isNullOrEmpty(Arrays.asList("something")));
    }
}
