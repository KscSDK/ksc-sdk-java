/*
 * Copyright 2010-2017 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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
package com.ksc.sts;

import com.ksc.sts.model.AssumeRoleRequest;
import com.ksc.sts.model.AssumeRoleResult;

public interface KSCSTS {

    /**
     * AssumeRole
     * 
     * @param assumeRoleRequest
     * @return assumeRoleRequest
     */
    AssumeRoleResult assumeRole(AssumeRoleRequest assumeRoleRequest);

}
