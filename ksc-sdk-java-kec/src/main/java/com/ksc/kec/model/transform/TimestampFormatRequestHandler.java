package com.ksc.kec.model.transform;

import com.ksc.Request;
import com.ksc.Response;
import com.ksc.handlers.RequestHandler2;

/**
 * A request handler that strips out millisecond precision from requests to
 * RequestSpotFleet and DescribeSpotFleetRequestHistory, which don't expect
 * timestamps to be so precise.
 */
public final class TimestampFormatRequestHandler extends RequestHandler2 {

	@Override
	public void beforeRequest(Request<?> request) {
	}

	@Override
	public void afterResponse(Request<?> request, Response<?> response) {
	}

	@Override
	public void afterError(Request<?> request, Response<?> response, Exception e) {
	}
}
