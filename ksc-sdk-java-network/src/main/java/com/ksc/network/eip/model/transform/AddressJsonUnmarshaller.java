package com.ksc.network.eip.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.network.eip.model.Address;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Address JSON Unmarshaller
 */
public class AddressJsonUnmarshaller implements Unmarshaller<Address, JsonUnmarshallerContext> {

	public Address unmarshall(JsonUnmarshallerContext context) throws Exception {
		Address address = new Address();
		int originalDepth = context.getCurrentDepth();
		String currentParentElement = context.getCurrentParentElement();
		int targetDepth = originalDepth + 1;

		JsonToken token = context.getCurrentToken();
		if (token == null)
			token = context.nextToken();
		if (token == VALUE_NULL)
			return null;

		while (true) {
			if (token == null)
				break;

			if (token == FIELD_NAME || token == START_OBJECT) {
				
				if (context.testExpression("InstanceId", targetDepth)) {
					context.nextToken();
					address.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("PublicIp", targetDepth)) {
					context.nextToken();
					address.setPublicIp(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("AllocationId", targetDepth)) {
					context.nextToken();
					address.setAllocationId(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("NetworkInterfaceId", targetDepth)) {
					context.nextToken();
					address.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("State", targetDepth)) {
					context.nextToken();
					address.setState(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("LineId", targetDepth)) {
					context.nextToken();
					address.setLineId(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("BandWidth", targetDepth)) {
					context.nextToken();
					address.setBandWidth(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("InstanceType", targetDepth)) {
					context.nextToken();
					address.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("InternetGatewayId", targetDepth)) {
					context.nextToken();
					address.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("CreateTime", targetDepth)) {
					context.nextToken();
					address.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
				}
			} else if (token == END_ARRAY || token == END_OBJECT) {
				if (context.getLastParsedParentElement() == null
						|| context.getLastParsedParentElement().equals(currentParentElement)) {
					if (context.getCurrentDepth() <= originalDepth)
						break;
				}
			}
			token = context.nextToken();
		}
		return address;
	}

	private static AddressJsonUnmarshaller instance;

	public static AddressJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new AddressJsonUnmarshaller();
		return instance;
	}
}
