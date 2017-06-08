package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.SrcInfo;
import com.ksc.kvs.model.TaskInfo;
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
				
				if (context.testExpression("TaskID", targetDepth)) {
					context.nextToken();
					taskInfo.setTaskID(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("Preset", targetDepth)) {
					context.nextToken();
					taskInfo.setPreset(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("DstBucket", targetDepth)) {
					context.nextToken();
					taskInfo.setDstBucket(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("DstDir", targetDepth)) {
					context.nextToken();
					taskInfo.setDstDir(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("DstObjectKey", targetDepth)) {
					context.nextToken();
					taskInfo.setDstObjectKey(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("IsTop", targetDepth)) {
					context.nextToken();
					taskInfo.setIsTop(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("SrcInfo", targetDepth)) {
					context.nextToken();
					taskInfo.setSrcInfoList(new ListUnmarshaller<SrcInfo>(SrcInfoListJsonUnmarshaller.getInstance()).unmarshall(context));
				}else if (context.testExpression("DstAcl", targetDepth)) {
					context.nextToken();
					taskInfo.setDstAcl(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("CbUrl", targetDepth)) {
					context.nextToken();
					taskInfo.setCbUrl(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("CbMethod", targetDepth)) {
					context.nextToken();
					taskInfo.setCbMethod(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("ExtParam", targetDepth)) {
					context.nextToken();
					taskInfo.setExtParam(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("ErrorMsg", targetDepth)) {
					context.nextToken();
					taskInfo.setErrorMsg(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("ErrorCode", targetDepth)) {
					context.nextToken();
					taskInfo.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("CreateTime", targetDepth)) {
					context.nextToken();
					taskInfo.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("TaskStatus", targetDepth)) {
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
