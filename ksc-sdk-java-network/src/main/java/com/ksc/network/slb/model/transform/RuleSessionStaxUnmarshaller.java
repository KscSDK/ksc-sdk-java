package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.RuleSession;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class RuleSessionStaxUnmarshaller implements Unmarshaller<RuleSession, StaxUnmarshallerContext> {
    private static RuleSessionStaxUnmarshaller instance;

    public static RuleSessionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleSessionStaxUnmarshaller();
        return instance;
    }

    @Override
    public RuleSession unmarshall(StaxUnmarshallerContext context) throws Exception {
        RuleSession RuleSession = new RuleSession();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return RuleSession;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CookieExpirationPeriod", targetDepth)) {
                    RuleSession.setCookieExpirationPeriod(SimpleTypeStaxUnmarshallers.LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SessionState", targetDepth)) {
                    RuleSession.setSessionState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CookieType", targetDepth)) {
                    RuleSession.setCookieType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CookieName", targetDepth)) {
                    RuleSession.setCookieName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return RuleSession;
                }
            }
        }
    }
}
