/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.ksc.cdn.model.content.PreloadSummary;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.DateStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Preload Summary StAX Unmarshaller
 */
public class PreloadSummaryStaxUnmarshaller implements Unmarshaller<PreloadSummary, StaxUnmarshallerContext> {

    public PreloadSummary unmarshall(StaxUnmarshallerContext context) throws Exception {
        PreloadSummary invalidationSummary = new PreloadSummary();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return invalidationSummary;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Id", targetDepth)) {
                    invalidationSummary.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    invalidationSummary.setCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    invalidationSummary.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return invalidationSummary;
                }
            }
        }
    }

    private static PreloadSummaryStaxUnmarshaller instance;
    public static PreloadSummaryStaxUnmarshaller getInstance() {
        if (instance == null) instance = new PreloadSummaryStaxUnmarshaller();
        return instance;
    }
}
    