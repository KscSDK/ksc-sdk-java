package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.GetTaskListResult;
import com.ksc.offline.model.OfflineErrResult;
import com.ksc.offline.model.OfflineResult;
import com.ksc.offline.model.Preset;
import com.ksc.offline.model.TaskInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class GetTaskListResultJsonUnmarshaller implements Unmarshaller<GetTaskListResult, JsonUnmarshallerContext> {

	public GetTaskListResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		GetTaskListResult getTaskListResult = new GetTaskListResult();
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

                if (context.testExpression("taskInfo", targetDepth)) {
                	context.nextToken();
                	getTaskListResult
                            .setTaskInfoList(new ListUnmarshaller<TaskInfo>(TaskInfoListJsonUnmarshaller.getInstance()).unmarshall(context));
                }else if(context.testExpression("errNum", targetDepth)){
                    context.nextToken();
                    getTaskListResult.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
                }else if(context.testExpression("errMsg", targetDepth)){
                    context.nextToken();
                    getTaskListResult.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
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
		return getTaskListResult;
	}
	
	private static GetTaskListResultJsonUnmarshaller instance;

    public static GetTaskListResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTaskListResultJsonUnmarshaller();
        return instance;
    }

}
