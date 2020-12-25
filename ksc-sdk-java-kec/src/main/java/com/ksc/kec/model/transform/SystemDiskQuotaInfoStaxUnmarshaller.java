package com.ksc.kec.model.transform;

import com.ksc.kec.model.SystemDiskQuotaInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class SystemDiskQuotaInfoStaxUnmarshaller implements
       Unmarshaller<SystemDiskQuotaInfo, StaxUnmarshallerContext> {

	public SystemDiskQuotaInfo unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		SystemDiskQuotaInfo systemDiskQuotaInfo = new SystemDiskQuotaInfo();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return systemDiskQuotaInfo;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SystemDiskType", targetDepth)) {
					systemDiskQuotaInfo.setSystemDiskType(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return systemDiskQuotaInfo;
				}
			}
		}
	}

	private static SystemDiskQuotaInfoStaxUnmarshaller instance;

	public static SystemDiskQuotaInfoStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new SystemDiskQuotaInfoStaxUnmarshaller();
		return instance;
	}
}
