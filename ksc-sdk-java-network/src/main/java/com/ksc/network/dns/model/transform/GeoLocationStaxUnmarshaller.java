package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.GeoLocation;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class GeoLocationStaxUnmarshaller implements Unmarshaller<GeoLocation, StaxUnmarshallerContext> {
    private static GeoLocationStaxUnmarshaller instance;

    public static GeoLocationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GeoLocationStaxUnmarshaller();
        return instance;
    }

    @Override
    public GeoLocation unmarshall(StaxUnmarshallerContext context) throws Exception {
        GeoLocation GeoLocation = new GeoLocation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return GeoLocation;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("GeoLocationEnglishName", targetDepth)) {
                    GeoLocation.setGeoLocationEnglishName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("GeoLocationChineseName", targetDepth)) {
                    GeoLocation.setGeoLocationChineseName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("GeoLocationId", targetDepth)) {
                    GeoLocation.setGeoLocationId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LineClass", targetDepth)) {
                    GeoLocation.setLineClass(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ParentLineClass", targetDepth)) {
                    GeoLocation.setParentLineClass(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return GeoLocation;
                }
            }
        }
    }
}
