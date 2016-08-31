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
package com.ksc.util;
import static com.ksc.util.StringUtils.UTF8;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/**
 * Simple wrapper for ByteArrayInputStream that will automatically encode the
 * string as UTF-8 data, and still allows access to the original string.
 */
public class StringInputStream extends ByteArrayInputStream {

    private final String string;

    public StringInputStream(String s) throws UnsupportedEncodingException {
        super(s.getBytes(UTF8));
        this.string = s;
    }

    /**
     * Returns the original string specified when this input stream was
     * constructed.
     *
     * @return The original string specified when this input stream was
     *         constructed.
     */
    public String getString() {
        return string;
    }
}
