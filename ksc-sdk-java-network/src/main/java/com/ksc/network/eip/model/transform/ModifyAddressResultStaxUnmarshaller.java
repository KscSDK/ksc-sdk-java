package com.ksc.network.eip.model.transform;

import com.ksc.network.eip.model.ModifyAddressResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyAddressResult StAX Unmarshaller
 */
public class ModifyAddressResultStaxUnmarshaller implements
		Unmarshaller<ModifyAddressResult, StaxUnmarshallerContext> {

	public ModifyAddressResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyAddressResult ModifyAddressResult = new ModifyAddressResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyAddressResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					ModifyAddressResult.setCreateTime(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
                }

                if (context.testExpression("PublicIp", targetDepth)) {
					ModifyAddressResult.setPublicIp(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

				if (context.testExpression("AllocationId", targetDepth)) {
                    ModifyAddressResult.setAllocationId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("State", targetDepth)) {
                    ModifyAddressResult.setState(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LineId", targetDepth)) {
                    ModifyAddressResult.setLineId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BandWidth", targetDepth)) {
                    ModifyAddressResult.setBandWidth(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceType", targetDepth)) {
                    ModifyAddressResult.setInstanceType(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceId", targetDepth)) {
                    ModifyAddressResult.setInstanceId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    ModifyAddressResult.setNetworkInterfaceId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InternetGatewayId", targetDepth)) {
                    ModifyAddressResult.setInternetGatewayId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BandWidthShareId", targetDepth)) {
                    ModifyAddressResult.setBandWidthShareId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsBandWidthShare", targetDepth)) {
                    ModifyAddressResult.setIsBandWidthShare(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

				else if(context.testExpression("RequestId", targetDepth)){
					ModifyAddressResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyAddressResult;
				}
			}
		}
	}

	private static ModifyAddressResultStaxUnmarshaller instance;

	public static ModifyAddressResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyAddressResultStaxUnmarshaller();
		return instance;
	}
}
