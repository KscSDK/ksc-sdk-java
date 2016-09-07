package com.ksc.kec.model.transform;

import com.ksc.Request;
import com.ksc.handlers.AbstractRequestHandler;
import com.ksc.util.TimingInfo;

@SuppressWarnings("deprecation")
public class KECRequestHandler extends AbstractRequestHandler {
	@Override
	public void beforeRequest(Request<?> request) {
	}

	@Override
	public void afterResponse(Request<?> request, Object response,
			TimingInfo timingInfo) {
	}
}
