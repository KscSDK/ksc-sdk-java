package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ListPrivateLinkServerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class ListPrivateLinkServerResultStaxUnmarshaller
        implements Unmarshaller<ListPrivateLinkServerResult, StaxUnmarshallerContext> {

    @Override
    public ListPrivateLinkServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListPrivateLinkServerResult listPrivateLinkServerResult = new ListPrivateLinkServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listPrivateLinkServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PrivateLinkSet/item", targetDepth)) {
                    listPrivateLinkServerResult
                            .addPrivateLinks(PrivateLinkStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                } else if (context.testExpression("RequestId", targetDepth)) {
                    listPrivateLinkServerResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                } else if (context.testExpression("NextToken", targetDepth)) {
                    listPrivateLinkServerResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listPrivateLinkServerResult;
                }
            }
        }
    }

    private static ListPrivateLinkServerResultStaxUnmarshaller instance;

    public static ListPrivateLinkServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListPrivateLinkServerResultStaxUnmarshaller();
        return instance;
    }

}
