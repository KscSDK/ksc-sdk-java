/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.ksc.cdn.model.content.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.cdn.model.content.CreatePreloadResult;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Create Invalidation Result StAX Unmarshaller
 */
public class CreatePreloadResultStaxUnmarshaller implements Unmarshaller<CreatePreloadResult, StaxUnmarshallerContext> {

    public CreatePreloadResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreatePreloadResult createPreloadResult = new CreatePreloadResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            createPreloadResult.setLocation(context.getHeader("Location"));
        }

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return createPreloadResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Preload", targetDepth)) {
                    createPreloadResult.setPreload(PreloadStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createPreloadResult;
                }
            }
        }
    }

    private static CreatePreloadResultStaxUnmarshaller instance;
    public static CreatePreloadResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new CreatePreloadResultStaxUnmarshaller();
        return instance;
    }
}
    