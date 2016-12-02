/*
 * Copyright 2015-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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
package com.ksc.util;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ksc.SignableRequest;
import com.ksc.http.HttpMethodName;

public class SdkHttpUtils {

    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final Pattern ENCODED_CHARACTERS_PATTERN;

    public SdkHttpUtils() {
    }

    public static String urlEncode(String value, boolean path) {
        if(value == null) {
            return "";
        } else {
            try {
                String ex = URLEncoder.encode(value, "UTF-8");
                Matcher matcher = ENCODED_CHARACTERS_PATTERN.matcher(ex);

                StringBuffer buffer;
                String replacement;
                for(buffer = new StringBuffer(ex.length()); matcher.find(); matcher.appendReplacement(buffer, replacement)) {
                    replacement = matcher.group(0);
                    if("+".equals(replacement)) {
                        replacement = "%20";
                    } else if("*".equals(replacement)) {
                        replacement = "%2A";
                    } else if("%7E".equals(replacement)) {
                        replacement = "~";
                    } else if(path && "%2F".equals(replacement)) {
                        replacement = "/";
                    }
                }

                matcher.appendTail(buffer);
                return buffer.toString();
            } catch (UnsupportedEncodingException var6) {
                throw new RuntimeException(var6);
            }
        }
    }

    public static String urlDecode(String value) {
        if(value == null) {
            return null;
        } else {
            try {
                return URLDecoder.decode(value, "UTF-8");
            } catch (UnsupportedEncodingException var2) {
                throw new RuntimeException(var2);
            }
        }
    }

    public static boolean isUsingNonDefaultPort(URI uri) {
        String scheme = uri.getScheme().toLowerCase();
        int port = uri.getPort();
        return port <= 0?false:(scheme.equals("http") && port == 80?false:!scheme.equals("https") || port != 443);
    }

    public static boolean usePayloadForQueryParameters(SignableRequest<?> request) {
        boolean requestIsPOST = HttpMethodName.POST.equals(request.getHttpMethod());
        boolean requestHasNoPayload = request.getContent() == null;
        return requestIsPOST && requestHasNoPayload;
    }

    public static String encodeParameters(SignableRequest<?> request) {
        Map requestParams = request.getParameters();
        if(requestParams.isEmpty()) {
            return null;
        } else {
            ArrayList nameValuePairs = new ArrayList();
            Iterator var3 = requestParams.entrySet().iterator();

            while(var3.hasNext()) {
                Entry entry = (Entry)var3.next();
                String parameterName = (String)entry.getKey();
                Iterator var6 = ((List)entry.getValue()).iterator();

                while(var6.hasNext()) {
                    String value = (String)var6.next();
                    nameValuePairs.add(new BasicNameValuePair(parameterName, value));
                }
            }

            return URLEncodedUtils.format(nameValuePairs, "UTF-8");
        }
    }

    public static String appendUri(String baseUri, String path) {
        return appendUri(baseUri, path, false);
    }

    public static String appendUri(String baseUri, String path, boolean escapeDoubleSlash) {
        String resultUri = baseUri;
        if(path != null && path.length() > 0) {
            if(path.startsWith("/")) {
                if(baseUri.endsWith("/")) {
                    resultUri = baseUri.substring(0, baseUri.length() - 1);
                }
            } else if(!baseUri.endsWith("/")) {
                resultUri = baseUri + "/";
            }

            String encodedPath = urlEncode(path, true);
            if(escapeDoubleSlash) {
                encodedPath = encodedPath.replace("//", "/%2F");
            }

            resultUri = resultUri + encodedPath;
        } else if(!baseUri.endsWith("/")) {
            resultUri = baseUri + "/";
        }

        return resultUri;
    }

    static {
        StringBuilder pattern = new StringBuilder();
        pattern.append(Pattern.quote("+")).append("|").append(Pattern.quote("*")).append("|").append(Pattern.quote("%7E")).append("|").append(Pattern.quote("%2F"));
        ENCODED_CHARACTERS_PATTERN = Pattern.compile(pattern.toString());
    }
}