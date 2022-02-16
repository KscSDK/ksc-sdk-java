package com.ksc.network.vpc.transform.vpc;

import com.ksc.network.vpc.model.vpc.SecondaryCidr;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * SecondaryCidr StAX Unmarshaller
 */
public class SecondaryCidrStaxUnmarshaller implements Unmarshaller<SecondaryCidr, StaxUnmarshallerContext> {

    @Override
	public SecondaryCidr unmarshall(StaxUnmarshallerContext context) throws Exception {
        SecondaryCidr secondaryCidr = new SecondaryCidr();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return secondaryCidr;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SecondaryCidrId", targetDepth)) {
                    secondaryCidr.setSecondaryCidrid(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Cidr", targetDepth)) {
                    secondaryCidr.setCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return secondaryCidr;
				}
			}
		}
	}

	private static SecondaryCidrStaxUnmarshaller instance;

	public static SecondaryCidrStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new SecondaryCidrStaxUnmarshaller();
		return instance;
	}
}
