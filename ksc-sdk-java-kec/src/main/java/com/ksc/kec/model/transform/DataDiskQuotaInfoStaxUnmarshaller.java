package com.ksc.kec.model.transform;

import com.ksc.kec.model.DataDiskQuotaInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DataDiskQuotaInfoStaxUnmarshaller implements
       Unmarshaller<DataDiskQuotaInfo, StaxUnmarshallerContext> {

	public DataDiskQuotaInfo unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DataDiskQuotaInfo dataDiskQuotaInfo = new DataDiskQuotaInfo();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return dataDiskQuotaInfo;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("DataDiskType", targetDepth)) {
					dataDiskQuotaInfo.setDataDiskType(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("DataDiskMinSize", targetDepth)) {
					dataDiskQuotaInfo.setDataDiskMinSize(SimpleTypeStaxUnmarshallers.DoubleStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("DataDiskMaxsize", targetDepth)) {
					dataDiskQuotaInfo.setDataDiskMaxsize(SimpleTypeStaxUnmarshallers.DoubleStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("DataDiskCount", targetDepth)) {
					dataDiskQuotaInfo.setDataDiskCount(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return dataDiskQuotaInfo;
				}
			}
		}
	}

	private static DataDiskQuotaInfoStaxUnmarshaller instance;

	public static DataDiskQuotaInfoStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DataDiskQuotaInfoStaxUnmarshaller();
		return instance;
	}
}
