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
package com.ksc.transform;

import static com.ksc.util.XpathUtils.asString;
import static com.ksc.util.XpathUtils.xpath;

import javax.xml.xpath.XPath;

import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Node;

import com.ksc.KscServiceException;
import com.ksc.KscServiceException.ErrorType;

/**
 * Error unmarshaller that knows how to interpret a standard KSC error message
 * (i.e. where to find the KSC error code, the error message, etc.) and turn it
 * into an AmazonServiceException.
 *
 * @see LegacyErrorUnmarshaller
 */
// TODOFIX
public class StandardErrorUnmarshaller extends AbstractErrorUnmarshaller<Node> {

    /**
     * Constructs a new unmarshaller that will unmarshall a standard KSC error
     * message as a generic AmazonServiceException object.
     */
    public StandardErrorUnmarshaller() {}

    /**
     * Constructor allowing subclasses to specify a specific type of
     * AmazonServiceException to instantiating when populating the exception
     * object with data from the error message.
     *
     * @param exceptionClass
     *            The class of AmazonServiceException to create and populate
     *            when unmarshalling the error message.
     */
    protected StandardErrorUnmarshaller(Class<? extends KscServiceException> exceptionClass) {
        super(exceptionClass);
    }

    /**
     * @see com.ksc.transform.Unmarshaller#unmarshall(java.lang.Object)
     */
    public KscServiceException unmarshall(Node in) throws Exception {
        XPath xpath = xpath();
        String errorCode = parseErrorCode(in, xpath);
        String errorType = asString("ErrorResponse/Error/Type", in, xpath);
        String requestId = asString("ErrorResponse/RequestId", in, xpath);
        String message = asString("ErrorResponse/Error/Message", in, xpath);
        if(StringUtils.isBlank(errorCode)){
        	return null;
        }
        KscServiceException ase = newException(message);
        ase.setErrorCode(errorCode);
        ase.setRequestId(requestId);

        if (errorType == null) {
            ase.setErrorType(ErrorType.Unknown);
        } else if (errorType.equalsIgnoreCase("Receiver")) {
            ase.setErrorType(ErrorType.Service);
        } else if (errorType.equalsIgnoreCase("Sender")) {
            ase.setErrorType(ErrorType.Client);
        }

        return ase;
    }

    /**
     * Returns the KSC error code for the specified error response.
     *
     * @param in
     *            The DOM tree node containing the error response.
     *
     * @return The KSC error code contained in the specified error response.
     *
     * @throws Exception
     *             If any problems were encountered pulling out the KSC error
     *             code.
     */
    public String parseErrorCode(Node in) throws Exception {
        return asString("ErrorResponse/Error/Code", in);
    }

    public String parseErrorCode(Node in, XPath xpath) throws Exception {
        return asString("ErrorResponse/Error/Code", in, xpath);
    }

    /**
     * Returns the path to the specified property within an error response.
     *
     * @param property
     *            The name of the desired property.
     *
     * @return The path to the specified property within an error message.
     */
    public String getErrorPropertyPath(String property) {
        return "ErrorResponse/Error/" + property;
    }

}
