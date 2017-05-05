package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribeListenersResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DescribeListenersResultStaxUnmarshaller
		implements Unmarshaller<DescribeListenersResult, StaxUnmarshallerContext> {

	@Override
	public DescribeListenersResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeListenersResult describeListenersResult = new DescribeListenersResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeListenersResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("ListenerSet/Item", targetDepth)) {
					describeListenersResult.addListenerSet(ListenerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				else if (context.testExpression("RequestId", targetDepth)) {
					describeListenersResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeListenersResult;
				}
			}
		}
	}

    private static DescribeListenersResultStaxUnmarshaller instance;

    public static DescribeListenersResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeListenersResultStaxUnmarshaller();
        return instance;
    }

}
