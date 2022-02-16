package com.ksc.network.vpc.transform.vpc;

import com.ksc.network.vpc.model.vpc.AddSecondaryCidrBlockResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AddSecondaryCidrBlock StAX Unmarshaller
 */
public class AddSecondaryCidrBlockResultStaxUnmarshaller implements
		Unmarshaller<AddSecondaryCidrBlockResult, StaxUnmarshallerContext> {

    @Override
	public AddSecondaryCidrBlockResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
        AddSecondaryCidrBlockResult addSecondaryCidrBlockResult = new AddSecondaryCidrBlockResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return addSecondaryCidrBlockResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Vpc", targetDepth)) {
                    addSecondaryCidrBlockResult.setVpc(VpcStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
                    addSecondaryCidrBlockResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return addSecondaryCidrBlockResult;
				}
			}
		}
	}

	private static AddSecondaryCidrBlockResultStaxUnmarshaller instance;

	public static AddSecondaryCidrBlockResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AddSecondaryCidrBlockResultStaxUnmarshaller();
		return instance;
	}
}
