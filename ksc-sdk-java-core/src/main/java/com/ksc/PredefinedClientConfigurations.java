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


/**
 * Static factory methods for the default {@link ClientConfiguration} for a service. These defaults
 * are used unless a different {@link ClientConfiguration} is explicitly provided in the constructor
 * of the service client
 */
public class PredefinedClientConfigurations {

    /**
     * Factory method for default {@link ClientConfiguration} for all services unless otherwise
     * specified
     */
    public static ClientConfiguration defaultConfig() {
        return new ClientConfiguration();
    }

}
