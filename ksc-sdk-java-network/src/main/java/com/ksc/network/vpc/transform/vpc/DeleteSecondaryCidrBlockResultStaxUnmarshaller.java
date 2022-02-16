package com.ksc.network.vpc.transform.vpc;

import com.ksc.network.vpc.model.vpc.DeleteSecondaryCidrBlockResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteSecondaryCidrBlockResult StAX Unmarshaller
 */
public class DeleteSecondaryCidrBlockResultStaxUnmarshaller implements
		Unmarshaller<DeleteSecondaryCidrBlockResult, StaxUnmarshallerContext> {

    @Override
	public DeleteSecondaryCidrBlockResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
        DeleteSecondaryCidrBlockResult deleteSecondaryCidrBlockResult = new DeleteSecondaryCidrBlockResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return deleteSecondaryCidrBlockResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
                    deleteSecondaryCidrBlockResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
                    deleteSecondaryCidrBlockResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return deleteSecondaryCidrBlockResult;
				}
			}
		}
	}

	private static DeleteSecondaryCidrBlockResultStaxUnmarshaller instance;

	public static DeleteSecondaryCidrBlockResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteSecondaryCidrBlockResultStaxUnmarshaller();
		return instance;
	}
}
