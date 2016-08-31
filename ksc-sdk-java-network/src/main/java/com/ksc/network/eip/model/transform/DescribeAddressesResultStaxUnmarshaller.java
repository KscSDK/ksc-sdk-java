package com.ksc.network.eip.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.eip.model.DescribeAddressesResult;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;

/**
 * DescribeAddressesResult StAX Unmarshaller
 */
public class DescribeAddressesResultStaxUnmarshaller implements
        Unmarshaller<DescribeAddressesResult, StaxUnmarshallerContext> {

    public DescribeAddressesResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        DescribeAddressesResult describeAddressesResult = new DescribeAddressesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeAddressesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AddressesSet/item", targetDepth)) {
                    describeAddressesResult
                            .withAddressesSet(AddressStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }else if(context.testExpression("RequestId", targetDepth)){
                	describeAddressesResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}else if(context.testExpression("NextToken", targetDepth)){
					describeAddressesResult.setNextToken(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeAddressesResult;
                }
            }
        }
    }

    private static DescribeAddressesResultStaxUnmarshaller instance;

    public static DescribeAddressesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAddressesResultStaxUnmarshaller();
        return instance;
    }
}
