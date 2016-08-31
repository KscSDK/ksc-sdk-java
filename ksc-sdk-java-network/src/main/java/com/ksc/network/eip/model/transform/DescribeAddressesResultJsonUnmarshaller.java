package com.ksc.network.eip.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.network.eip.model.Address;
import com.ksc.network.eip.model.DescribeAddressesResult;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeAddressesResult JSON Unmarshaller
 */
public class DescribeAddressesResultJsonUnmarshaller implements
        Unmarshaller<DescribeAddressesResult, JsonUnmarshallerContext> {

    public DescribeAddressesResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeAddressesResult describeAddressesResult = new DescribeAddressesResult();
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

                if (context.testExpression("AddressesSet", targetDepth)) {
                	context.nextToken();
                    describeAddressesResult
                            .setAddressesSet(new ListUnmarshaller<Address>(AddressJsonUnmarshaller.getInstance()).unmarshall(context));
                }else if(context.testExpression("RequestId", targetDepth)){
                	context.nextToken();
                	describeAddressesResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
				}else if(context.testExpression("NextToken", targetDepth)){
					context.nextToken();
					describeAddressesResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
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
		return describeAddressesResult;
    }

    private static DescribeAddressesResultJsonUnmarshaller instance;

    public static DescribeAddressesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAddressesResultJsonUnmarshaller();
        return instance;
    }
}
