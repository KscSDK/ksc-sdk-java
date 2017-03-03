package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.Preset;
import com.ksc.offline.model.SrcInfo;
import com.ksc.offline.model.TaskInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class TaskInfoListJsonUnmarshaller implements Unmarshaller<TaskInfo, JsonUnmarshallerContext>{

	public TaskInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
		TaskInfo taskInfo = new TaskInfo();
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
				
				if (context.testExpression("taskid", targetDepth)) {
					context.nextToken();
					taskInfo.setTaskid(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("preset", targetDepth)) {
					context.nextToken();
					taskInfo.setPreset(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("dstBucket", targetDepth)) {
					context.nextToken();
					taskInfo.setDstBucket(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("dstDir", targetDepth)) {
					context.nextToken();
					taskInfo.setDstDir(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("dstObjectKey", targetDepth)) {
					context.nextToken();
					taskInfo.setDstObjectKey(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("isTop", targetDepth)) {
					context.nextToken();
					taskInfo.setIsTop(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("srcInfo", targetDepth)) {
					context.nextToken();
					taskInfo.setSrcInfoList(new ListUnmarshaller<SrcInfo>(SrcInfoListJsonUnmarshaller.getInstance()).unmarshall(context));
				}else if (context.testExpression("dstAcl", targetDepth)) {
					context.nextToken();
					taskInfo.setDstAcl(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("cbUrl", targetDepth)) {
					context.nextToken();
					taskInfo.setCbUrl(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("cbMethod", targetDepth)) {
					context.nextToken();
					taskInfo.setCbMethod(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("extParam", targetDepth)) {
					context.nextToken();
					taskInfo.setExtParam(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("errorMsg", targetDepth)) {
					context.nextToken();
					taskInfo.setErrorMsg(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("createTime", targetDepth)) {
					context.nextToken();
					taskInfo.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("taskStatus", targetDepth)) {
					context.nextToken();
					taskInfo.setTaskStatus(context.getUnmarshaller(String.class).unmarshall(context));
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
		return taskInfo;
	}

	private static TaskInfoListJsonUnmarshaller instance;

	public static TaskInfoListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new TaskInfoListJsonUnmarshaller();
		return instance;
	}
}
