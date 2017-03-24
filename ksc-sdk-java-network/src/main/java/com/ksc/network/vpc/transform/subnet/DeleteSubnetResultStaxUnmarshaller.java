package com.ksc.network.vpc.transform.subnet;

import com.ksc.network.vpc.model.subnet.DeleteSubnetResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteSubnetResult StAX Unmarshaller
 */
public class DeleteSubnetResultStaxUnmarshaller implements
		Unmarshaller<DeleteSubnetResult, StaxUnmarshallerContext> {


	public DeleteSubnetResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteSubnetResult DeleteSubnetResult = new DeleteSubnetResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteSubnetResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteSubnetResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteSubnetResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteSubnetResult;
				}
			}
		}
	}

	private static DeleteSubnetResultStaxUnmarshaller instance;

	public static DeleteSubnetResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteSubnetResultStaxUnmarshaller();
		return instance;
	}
}
