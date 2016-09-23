package com.ksc.offline.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.GetTaskListRequestMarshaller;
import com.ksc.offline.model.transform.TopTaskByTaskIDRequestMarshaller;

public class GetTaskListRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<GetTaskListRequest>{
	
	public Request<GetTaskListRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetTaskListRequest> request = new GetTaskListRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
