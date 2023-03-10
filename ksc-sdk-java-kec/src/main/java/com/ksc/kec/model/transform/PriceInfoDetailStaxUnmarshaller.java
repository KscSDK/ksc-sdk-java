package com.ksc.kec.model.transform;

import com.ksc.kec.model.DescribePriceResult;
import com.ksc.kec.model.InstanceConfigure;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Reservation StAX Unmarshaller
 */
public class PriceInfoDetailStaxUnmarshaller implements
		Unmarshaller<DescribePriceResult.PriceInfoDetail, StaxUnmarshallerContext> {

	public DescribePriceResult.PriceInfoDetail unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribePriceResult.PriceInfoDetail ic = new DescribePriceResult.PriceInfoDetail();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ic;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("DiscountPrice", targetDepth)) {
					ic.setDiscountPrice(SimpleTypeStaxUnmarshallers.BigDecimalStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("OriginalPrice", targetDepth)) {
					ic.setOriginalPrice(SimpleTypeStaxUnmarshallers.BigDecimalStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("TradePrice", targetDepth)) {
					ic.setTradePrice(SimpleTypeStaxUnmarshallers.BigDecimalStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("PriceUnit", targetDepth)) {
					ic.setPriceUnit(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("UserDiscount", targetDepth)) {
					ic.setUserDiscount(SimpleTypeStaxUnmarshallers.BigDecimalStaxUnmarshaller.getInstance()
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

	private static PriceInfoDetailStaxUnmarshaller instance;

	public static PriceInfoDetailStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new PriceInfoDetailStaxUnmarshaller();
		return instance;
	}
}
