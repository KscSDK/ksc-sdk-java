/*
 * Copyright 2010-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.ksc.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.ksc.KscClientException;
import com.ksc.util.ClassLoaderHelper;
import com.ksc.util.StringUtils;

/**
 * Factory for creating request/response handler chains.
 */
public class HandlerChainFactory {

    /**
     * For backward compatibility, constructs a new request handler chain
     * adapted to {@link RequestHandler2} by analyzing the specified classpath
     * resource.
     *
     * @param resource
     *            The resource to load from the classpath containing the list of
     *            request handlers to instantiate.
     *
     * @return A list of request handlers based on the handlers referenced in
     *         the specified resource.
     */
    @SuppressWarnings("deprecation")
	public List<RequestHandler2> newRequestHandlerChain(String resource) {
        return createRequestHandlerChain(resource, RequestHandler.class);
    }

    /**
     * Constructs a new request handler (v2) chain by analyzing the specified
     * classpath resource.
     *
     * @param resource
     *            The resource to load from the classpath containing the list of
     *            request handlers to instantiate.
     *
     * @return A list of request handlers based on the handlers referenced in
     *         the specified resource.
     */
    public List<RequestHandler2> newRequestHandler2Chain(String resource) {
        return createRequestHandlerChain(resource, RequestHandler2.class);
    }

    @SuppressWarnings("deprecation")
	private List<RequestHandler2> createRequestHandlerChain(String resource, Class<?> handlerApiClass) {
        List<RequestHandler2> handlers = new ArrayList<RequestHandler2>();
        BufferedReader reader = null;

        try {
            InputStream input = getClass().getResourceAsStream(resource);
            if (input == null) return handlers;

            reader = new BufferedReader(new InputStreamReader(input, StringUtils.UTF8));
            while (true) {
                String requestHandlerClassName = reader.readLine();
                if (requestHandlerClassName == null)
                    break;
                requestHandlerClassName = requestHandlerClassName.trim();
                if (requestHandlerClassName.equals(""))
                    continue;
                Class<?> requestHandlerClass = ClassLoaderHelper.loadClass(
                    requestHandlerClassName,
                    handlerApiClass, getClass());
                Object requestHandlerObject = requestHandlerClass.newInstance();
                if (handlerApiClass.isInstance(requestHandlerObject)) {
                    if (handlerApiClass == RequestHandler2.class) {
                        RequestHandler2 h = (RequestHandler2)requestHandlerObject;
                        handlers.add(h);
                    } else if (handlerApiClass == RequestHandler.class) {
                        RequestHandler h = (RequestHandler)requestHandlerObject;
                        handlers.add(RequestHandler2.adapt(h));
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new KscClientException(
                        "Unable to instantiate request handler chain for client.  "
                                + "Listed request handler ('"
                                + requestHandlerClassName + "') "
                                + "does not implement the "
                                + handlerApiClass + " API.");
                }
            }
        } catch (Exception e) {
            throw new KscClientException("Unable to instantiate request handler chain for client: "
                    + e.getMessage(), e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        return handlers;
    }
}
