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
package com.ksc.http;

import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.ksc.KscClientException;
import com.ksc.KscServiceException;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.IOUtils;
import com.ksc.util.XpathUtils;

/**
 * Implementation of HttpResponseHandler that handles only error responses from
 * Amazon Web Services. A list of unmarshallers is passed into the constructor,
 * and while handling a response, each unmarshaller is tried, in order, until
 * one is found that can successfully unmarshall the error response.  If no
 * unmarshaller is found that can unmarshall the error response, a generic
 * AmazonServiceException is created and populated with the AWS error response
 * information (error message, AWS error code, AWS request ID, etc).
 */
public class DefaultErrorResponseHandler
        implements HttpResponseHandler<KscServiceException> {
    private static final Log log = LogFactory.getLog(DefaultErrorResponseHandler.class);

    /**
     * The list of error response unmarshallers to try to apply to error
     * responses.
     */
    private List<Unmarshaller<KscServiceException, Node>> unmarshallerList;

    /**
     * Constructs a new DefaultErrorResponseHandler that will handle error
     * responses from Amazon services using the specified list of unmarshallers.
     * Each unmarshaller will be tried, in order, until one is found that can
     * unmarshall the error response.
     *
     * @param unmarshallerList
     *            The list of unmarshallers to try using when handling an error
     *            response.
     */
    public DefaultErrorResponseHandler(
            List<Unmarshaller<KscServiceException, Node>> unmarshallerList) {
        this.unmarshallerList = unmarshallerList;
    }

    @Override
    public KscServiceException handle(HttpResponse errorResponse) throws Exception {
        // Try to read the error response
        String content = "";
        try {
            content = IOUtils.toString(errorResponse.getContent());
        } catch(IOException ex) {
            if (log.isDebugEnabled())
                log.debug("Failed in reading the error response", ex);
            return newAmazonServiceException(
                    "Unable to unmarshall error response", errorResponse, ex);
        }
        // Try to parse the error response as XML
        Document document;
        try {
            document = XpathUtils.documentFrom(content);
        } catch (Exception e) {
            return newAmazonServiceException(String.format(
                    "Unable to unmarshall error response (%s)", content),
                    errorResponse, e);
        }

        /*
         * We need to select which exception unmarshaller is the correct one to
         * use from all the possible exceptions this operation can throw.
         * Currently we rely on the unmarshallers to return null if they can't
         * unmarshall the response, but we might need something a little more
         * sophisticated in the future.
         */
        for (Unmarshaller<KscServiceException, Node> unmarshaller : unmarshallerList) {
            KscServiceException ase = unmarshaller.unmarshall(document);
            if (ase != null) {
                ase.setStatusCode(errorResponse.getStatusCode());
                return ase;
            }
        }

        throw new KscClientException("Unable to unmarshall error response from service");
    }

    /**
     * Used to create an {@link newAmazonServiceException} when we failed to
     * read the error response or parsed the error response as XML.
     */
    private KscServiceException newAmazonServiceException(String errmsg,
            HttpResponse httpResponse, Exception readFailure) {
        KscServiceException exception = new KscServiceException(errmsg, readFailure);
        final int statusCode = httpResponse.getStatusCode();
        exception.setErrorCode(statusCode + " " + httpResponse.getStatusText());
        exception.setErrorType(KscServiceException.ErrorType.Unknown);
        exception.setStatusCode(statusCode);
        return exception;
    }
    /**
     * Since this response handler completely consumes all the data from the
     * underlying HTTP connection during the handle method, we don't need to
     * keep the HTTP connection open.
     *
     * @see com.ksc.http.HttpResponseHandler#needsConnectionLeftOpen()
     */
    public boolean needsConnectionLeftOpen() {
        return false;
    }

}