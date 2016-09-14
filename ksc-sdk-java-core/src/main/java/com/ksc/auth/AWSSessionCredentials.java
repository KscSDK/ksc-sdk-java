/*
 * Copyright 2011-2016 ksyun Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://ksyun.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ksc.auth;

/**
 * AWS session credentials object.
 */
public interface AWSSessionCredentials extends AWSCredentials {

    /**
     * Returns the session token for this session.
     */
    public String getSessionToken();
}
