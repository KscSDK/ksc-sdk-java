package com.ksc.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonToken;

public class NestListUnmarshaller<T> implements
        Unmarshaller<List<List<T>>, JsonUnmarshallerContext> {
	
    private ListUnmarshaller<T> listUnmarshaller;

    public NestListUnmarshaller(
            Unmarshaller<T, JsonUnmarshallerContext> itemUnmarshaller) {
        listUnmarshaller = new ListUnmarshaller<T>(itemUnmarshaller);
    }

    /**
     * Unmarshalls the response headers or the json doc in the payload to the
     * list
     */
    public List<List<T>> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return unmarshallJsonToList(context);
    }

    /**
     * Unmarshalls the current token in the Json document to list.
     */
    private List<List<T>> unmarshallJsonToList(JsonUnmarshallerContext context)
            throws Exception {
    	List<List<T>> list = new ArrayList<List<T>>();

        int originalDepth = context.getCurrentDepth();

        if (context.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        
        Integer currentField =0;
        while (true) {
        	
            JsonToken token = context.nextToken();
            if (token == null)
                return list;
            if(token == JsonToken.START_ARRAY){
            	context.setCurrentField(currentField+++"");
            }
            if (token == END_ARRAY ) {
                if (context.getCurrentDepth() < originalDepth)
                    return list;
            } else {
                list.add(listUnmarshaller.unmarshall(context));
            }
        }
    }
}
