package com.ksc.epc.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.epc.model.EpcHost;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * EpcHost JSON Unmarshaller
 */
public class EpcHostJsonUnmarshaller implements Unmarshaller<EpcHost, JsonUnmarshallerContext> {
	private static EpcHostJsonUnmarshaller instance;

	public static EpcHostJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new EpcHostJsonUnmarshaller();
		return instance;
	}

	@Override
	public EpcHost unmarshall(JsonUnmarshallerContext context) throws Exception {
		EpcHost host = new EpcHost();
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
				if (context.testExpression("EpcHostId", targetDepth)) {
					context.nextToken();
					host.setEpcHostId(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("HostName", targetDepth)) {
					context.nextToken();
					host.setHostName(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("HostType", targetDepth)) {
					context.nextToken();
					host.setHostType(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("CoreCount", targetDepth)) {
					context.nextToken();
					host.setCoreCount(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("Memory", targetDepth)) {
					context.nextToken();
					host.setMemory(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("EpcHostStatus", targetDepth)) {
					context.nextToken();
					host.setEpcHostStatus(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("OsName", targetDepth)) {
					context.nextToken();
					host.setOsName(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("IpAddress", targetDepth)) {
					context.nextToken();
					host.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("VpcId", targetDepth)) {
					context.nextToken();
					host.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("VifId", targetDepth)) {
					context.nextToken();
					host.setVifId(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("SubnetId", targetDepth)) {
					context.nextToken();
					host.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
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
		return host;
	}

}
