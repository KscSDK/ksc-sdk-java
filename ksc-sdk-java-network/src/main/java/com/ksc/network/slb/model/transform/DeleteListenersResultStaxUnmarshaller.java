package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeleteListenersResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteListenersResult StAX Unmarshaller
 */
public class DeleteListenersResultStaxUnmarshaller implements
		Unmarshaller<DeleteListenersResult, StaxUnmarshallerContext> {

	public DeleteListenersResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteListenersResult DeleteListenersResult = new DeleteListenersResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteListenersResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteListenersResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteListenersResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteListenersResult;
				}
			}
		}
	}

	private static DeleteListenersResultStaxUnmarshaller instance;

	public static DeleteListenersResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteListenersResultStaxUnmarshaller();
		return instance;
	}
}
