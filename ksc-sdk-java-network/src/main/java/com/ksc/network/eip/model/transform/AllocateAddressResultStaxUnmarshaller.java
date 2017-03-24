package com.ksc.network.eip.model.transform;

import com.ksc.network.eip.model.AllocateAddressResult;
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryResult;
import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupResult;
import com.ksc.network.vpc.model.vpc.DeleteVpcResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteSecurityGroupResult StAX Unmarshaller
 */
public class AllocateAddressResultStaxUnmarshaller implements
		Unmarshaller<AllocateAddressResult, StaxUnmarshallerContext> {

	public AllocateAddressResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AllocateAddressResult AllocateAddressResult = new AllocateAddressResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return AllocateAddressResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("PublicIp", targetDepth)) {
					AllocateAddressResult.setPublicIp(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("AllocationId", targetDepth)) {
					AllocateAddressResult.setAllocationId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
						continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					AllocateAddressResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return AllocateAddressResult;
				}
			}
		}
	}

	private static AllocateAddressResultStaxUnmarshaller instance;

	public static AllocateAddressResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AllocateAddressResultStaxUnmarshaller();
		return instance;
	}
}
