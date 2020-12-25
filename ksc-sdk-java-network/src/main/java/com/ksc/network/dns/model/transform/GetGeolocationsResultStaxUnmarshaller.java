package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.GetGeolocationsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * GetGeolocationsResult StAX Unmarshaller
 */
public class GetGeolocationsResultStaxUnmarshaller implements Unmarshaller<GetGeolocationsResult, StaxUnmarshallerContext> {
    @Override
    public GetGeolocationsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetGeolocationsResult getGeolocationsResult = new GetGeolocationsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getGeolocationsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    getGeolocationsResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("GeoLocations/geolocations", targetDepth)) {
                    getGeolocationsResult.addGeoLocations(GeoLocationStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getGeolocationsResult;
                }
            }
        }
    }

    private static GetGeolocationsResultStaxUnmarshaller instance;

    public static GetGeolocationsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetGeolocationsResultStaxUnmarshaller();
        return instance;
    }
}
