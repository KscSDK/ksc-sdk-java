package com.ksc.kec.model.transform;

import com.ksc.kec.model.DescribeAvailabilityZonesResult;
import com.ksc.kec.model.DescribePriceResult;
import com.ksc.kec.model.PriceInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DescribePriceResultStaxUnmarshaller implements
       Unmarshaller<DescribePriceResult, StaxUnmarshallerContext>{

	public DescribePriceResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribePriceResult describePriceResult = new DescribePriceResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describePriceResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("PriceInfo", targetDepth)) {
					PriceInfo priceInfo=PriceInfoStaxUnmarshaller.getInstance().unmarshall(context);
					describePriceResult.setPriceInfo(priceInfo);
					continue;
				}


				if (context.testExpression("RequestId", targetDepth)) {
					describePriceResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describePriceResult;
				}
			}
		}
	}

	private static DescribePriceResultStaxUnmarshaller instance;

	public static DescribePriceResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribePriceResultStaxUnmarshaller();
		return instance;
	}
}
