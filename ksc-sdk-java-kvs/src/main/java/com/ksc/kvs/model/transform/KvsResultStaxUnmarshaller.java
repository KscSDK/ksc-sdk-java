package com.ksc.kvs.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kvs.model.KvsResult;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;

/**
 * DescribeAddressesResult StAX Unmarshaller
 */
public class KvsResultStaxUnmarshaller implements
        Unmarshaller<KvsResult, StaxUnmarshallerContext> {

    public KvsResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
    	KvsResult describeAddressesResult = new KvsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeAddressesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

//                if (context.testExpression("AddressesSet/item", targetDepth)) {
////                    describeAddressesResult
////                            .withAddressesSet(AddressStaxUnmarshaller
////                                    .getInstance().unmarshall(context));
//                    continue;
//                }else 
//            	if(context.testExpression("RequestId", targetDepth)){
//                	describeAddressesResult.setRequestId(StringStaxUnmarshaller.getInstance()
//							.unmarshall(context));
//					continue;
//            	}
//				}else if(context.testExpression("NextToken", targetDepth)){
//					describeAddressesResult.setNextToken(StringStaxUnmarshaller.getInstance()
//							.unmarshall(context));
//					continue;
//				}

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeAddressesResult;
                }
            }
        }
    }

    private static KvsResultStaxUnmarshaller instance;

    public static KvsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new KvsResultStaxUnmarshaller();
        return instance;
    }
}
