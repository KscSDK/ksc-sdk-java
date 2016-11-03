/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.ksc.cdn.model.content.transform;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.cdn.model.content.CreatePreloadRequest;
import com.ksc.cdn.model.content.Paths;
import com.ksc.cdn.model.content.PreloadBatch;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringInputStream;
import com.ksc.util.StringUtils;
import com.ksc.util.XMLWriter;

/**
 * Create Invalidation Request Marshaller
 */
public class CreatePreloadRequestMarshaller implements Marshaller<Request<CreatePreloadRequest>, CreatePreloadRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "2015-09-17/distribution/{DistributionId}/preload";
        Map<String, String> staticMap = new HashMap<String, String>();
        Map<String, String> dynamicMap = new HashMap<String, String>();

        int index = path.indexOf("?");
        if (index != -1) {
            String queryString = path.substring(index + 1);
            path = path.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    String name = s.substring(0, index);
                    String value = s.substring(index + 1);

                    if (value.startsWith("{") && value.endsWith("}")) {
                        dynamicMap.put(value.substring(1, value.length() - 1), name);
                    } else {
                        staticMap.put(name, value);
                    }
                }
            }
        }

        RESOURCE_PATH_TEMPLATE = path;
        STATIC_QUERY_PARAMS = Collections.unmodifiableMap(staticMap);
        DYNAMIC_QUERY_PARAMS = Collections.unmodifiableMap(dynamicMap);
    }

    public Request<CreatePreloadRequest> marshall(CreatePreloadRequest createPreloadRequest) {

        if (createPreloadRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePreloadRequest> request = new DefaultRequest<CreatePreloadRequest>(createPreloadRequest, "AmazonCloudFront");
        request.setHttpMethod(HttpMethodName.POST);
        request.addHeader("x-action", "CreatePreload");
        request.addHeader("x-version", "2015-09-17");

        String uriResourcePath = RESOURCE_PATH_TEMPLATE;
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("DistributionId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("DistributionId");
            String value = (createPreloadRequest.getDistributionId() == null) ? null : StringUtils.fromString(createPreloadRequest.getDistributionId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{DistributionId}", (createPreloadRequest.getDistributionId() == null) ? "" : StringUtils.fromString(createPreloadRequest.getDistributionId())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2015-09-17/");

                    if (createPreloadRequest != null) {
            PreloadBatch preloadBatch = createPreloadRequest.getPreloadBatch();
            if (preloadBatch != null) {
                xmlWriter.startElement("PreloadBatch");
                if (preloadBatch != null) {
                	String userId = preloadBatch.getUserId();
                	if(!StringUtils.isNullOrEmpty(userId)){
                		xmlWriter.startElement("UserId").value(userId).endElement();
                	}
                	
                    Paths pathsPaths = preloadBatch.getPaths();
                    if (pathsPaths != null) {
                        xmlWriter.startElement("Paths");
                        if (pathsPaths.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(pathsPaths.getQuantity()).endElement();
                        }

                        if (pathsPaths != null) {
                            java.util.List<String> pathsPathsitemsList = pathsPaths.getItems();
                            if (pathsPathsitemsList != null && pathsPathsitemsList.size() > 0) {
                                int pathsPathsitemsListIndex = 1;
                                xmlWriter.startElement("Items");
                                for (String pathsPathsitemsListValue : pathsPathsitemsList) {

                                xmlWriter.startElement("Path");
                                    xmlWriter.value(pathsPathsitemsListValue);
                                xmlWriter.endElement();

                                    pathsPathsitemsListIndex++;
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (preloadBatch.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(preloadBatch.getCallerReference()).endElement();
                }
                xmlWriter.endElement();
            }
        }

            try {
                String content = stringWriter.getBuffer().toString();
//                System.out.println("content: " + content);
                request.setContent(new StringInputStream(content));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(Charset.forName("UTF-8")).length));
                request.addHeader("Content-Type", "application/xml");
            } catch (UnsupportedEncodingException e) {
                throw new KscClientException("Unable to marshall request to XML", e);
            }

        return request;
    }
}
