package com.ksc.ket.model.transform;

import com.ksc.ket.model.Audio;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class AudioJsonUnmarshaller implements Unmarshaller<Audio, JsonUnmarshallerContext> {
	public Audio unmarshall(JsonUnmarshallerContext context) throws Exception {
		return null;
	}

	private static AudioJsonUnmarshaller instance;

	public static AudioJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new AudioJsonUnmarshaller();
		return instance;
	}
}
