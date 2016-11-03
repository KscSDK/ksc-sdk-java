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

import com.ksc.cdn.model.content.PreloadBatch;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Preload Batch StAX Unmarshaller
 */
public class PreloadBatchStaxUnmarshaller implements Unmarshaller<PreloadBatch, StaxUnmarshallerContext> {

    public PreloadBatch unmarshall(StaxUnmarshallerContext context) throws Exception {
        PreloadBatch preloadBatch = new PreloadBatch();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return preloadBatch;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Paths", targetDepth)) {
                    preloadBatch.setPaths(PathsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CallerReference", targetDepth)) {
                    preloadBatch.setCallerReference(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return preloadBatch;
                }
            }
        }
    }

    private static PreloadBatchStaxUnmarshaller instance;
    public static PreloadBatchStaxUnmarshaller getInstance() {
        if (instance == null) instance = new PreloadBatchStaxUnmarshaller();
        return instance;
    }
}
    