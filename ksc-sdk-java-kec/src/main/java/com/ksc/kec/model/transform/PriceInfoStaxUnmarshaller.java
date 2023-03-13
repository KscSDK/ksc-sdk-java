package com.ksc.kec.model.transform;

import com.ksc.kec.model.DescribePriceResult;
import com.ksc.kec.model.PriceInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Reservation StAX Unmarshaller
 */
public class PriceInfoStaxUnmarshaller implements
		Unmarshaller<PriceInfo, StaxUnmarshallerContext> {

	public PriceInfo unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		PriceInfo ic = new PriceInfo();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ic;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("InstancePrice", targetDepth)) {
					ic.setInstancePrice(PriceInfoDetailStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("EbsPrice", targetDepth)) {
					ic.seteBSPrice(PriceInfoDetailStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}




			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ic;
				}
			}
		}
	}

	private static PriceInfoStaxUnmarshaller instance;

	public static PriceInfoStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new PriceInfoStaxUnmarshaller();
		return instance;
	}
}
