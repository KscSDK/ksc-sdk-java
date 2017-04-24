package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.QuotaDetail;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class QuotaDetailJsonUnmarshaller implements Unmarshaller<QuotaDetail, JsonUnmarshallerContext> {
	public QuotaDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
		QuotaDetail quotaDetail = new QuotaDetail();
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

				if (context.testExpression("QuotaPull", targetDepth)) {
					context.nextToken();
					quotaDetail.setQuotaPull(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("QuotaTranDeadline", targetDepth)) {
					context.nextToken();
					quotaDetail.setQuotaTranDeadline(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("QuotaCopy", targetDepth)) {
					context.nextToken();
					quotaDetail.setQuotaCopy(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("QuotaTranUsed", targetDepth)) {
					context.nextToken();
					quotaDetail.setQuotaTranUsed(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("QuotaTran", targetDepth)) {
					context.nextToken();
					quotaDetail.setQuotaTran(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("QuotaCopyDeadline", targetDepth)) {
					context.nextToken();
					quotaDetail.setQuotaCopyDeadline(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("QuotaPullUsed", targetDepth)) {
					context.nextToken();
					quotaDetail.setQuotaPullUsed(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("QuotaPullDeadline", targetDepth)) {
					context.nextToken();
					quotaDetail.setQuotaPullDeadline(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("QuotaCopyUsed", targetDepth)) {
					context.nextToken();
					quotaDetail.setQuotaCopyUsed(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return quotaDetail;
	}

	private static QuotaDetailJsonUnmarshaller instance;

	public static QuotaDetailJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new QuotaDetailJsonUnmarshaller();
		return instance;
	}
}
