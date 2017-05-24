package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.DescribeLocalVolumesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeLocalVolumesResultStaxUnmarshaller implements
       Unmarshaller<DescribeLocalVolumesResult, StaxUnmarshallerContext>{

	public DescribeLocalVolumesResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeLocalVolumesResult describeLocalVolumesResult = new DescribeLocalVolumesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeLocalVolumesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("LocalVolumeSet/Item", targetDepth)) {
					describeLocalVolumesResult
							.withLocalVolumesSet(LocalVolumeDetailStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Marker", targetDepth)) {
					describeLocalVolumesResult.setMarker(IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeCount", targetDepth)) {
					describeLocalVolumesResult
							.setLocalVolumeCount(IntegerStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					describeLocalVolumesResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeLocalVolumesResult;
				}
			}
		}
	}

	private static DescribeLocalVolumesResultStaxUnmarshaller instance;

	public static DescribeLocalVolumesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeLocalVolumesResultStaxUnmarshaller();
		return instance;
	}
}
