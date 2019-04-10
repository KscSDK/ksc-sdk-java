package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.Session;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Created by LIUHONGMING on 2017/4/21.
 */
public class SessionStaxUnmarshaller implements Unmarshaller<Session, StaxUnmarshallerContext>{
    private static SessionStaxUnmarshaller instance;

    public static SessionStaxUnmarshaller getInstance(){
        if (instance == null)
            instance = new SessionStaxUnmarshaller();
        return instance;
    }

    @Override
    public Session unmarshall(StaxUnmarshallerContext context) throws Exception {
        Session session = new Session();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true){
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return session;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("SessionState", targetDepth)){
                    session.setSessionState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SessionPersistencePeriod", targetDepth)){
                    session.setSessionPersistencePeriod(SimpleTypeStaxUnmarshallers.LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CookieType", targetDepth)){
                    session.setCookieType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CookieName", targetDepth)){
                    session.setCookieName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            }else if (xmlEvent.isEndElement()){
                if (context.getCurrentDepth() < originalDepth){
                    return session;
                }
            }
        }
    }
}
