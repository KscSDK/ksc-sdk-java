package com.ksc.kec.model.transform;

import com.ksc.Request;
import com.ksc.Response;
import com.ksc.handlers.CredentialsRequestHandler;

/**
 * RequestHandler that generates a pre-signed URL for copying encrypted
 * snapshots
 */
public class GeneratePreSignUrlRequestHandler extends CredentialsRequestHandler {

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
