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

import com.ksc.cdn.model.content.Preload;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.DateStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Invalidation StAX Unmarshaller
 */
public class PreloadStaxUnmarshaller implements Unmarshaller<Preload, StaxUnmarshallerContext> {

    public Preload unmarshall(StaxUnmarshallerContext context) throws Exception {
        Preload preload = new Preload();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return preload;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
            	
                if (context.testExpression("Id", targetDepth)) {
                    preload.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    preload.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    preload.setCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreloadBatch", targetDepth)) {
                    preload.setPreloadBatch(PreloadBatchStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return preload;
                }
            }
        }
    }

    private static PreloadStaxUnmarshaller instance;
    public static PreloadStaxUnmarshaller getInstance() {
        if (instance == null) instance = new PreloadStaxUnmarshaller();
        return instance;
    }
}
    