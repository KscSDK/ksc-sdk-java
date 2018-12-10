package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.Listener;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Created by LIUHONGMING on 2017/4/20.
 */
public class ListenerStaxUnmarshaller implements Unmarshaller<Listener, StaxUnmarshallerContext>{
    private static ListenerStaxUnmarshaller instance;

    public static ListenerStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListenerStaxUnmarshaller();
        return instance;
    }

    @Override
    public Listener unmarshall(StaxUnmarshallerContext context) throws Exception {
        Listener listener = new Listener();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while(true){
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listener;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("CreateTime", targetDepth)) {
                    listener.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancerId", targetDepth)) {
                    listener.setLoadBalancerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerName", targetDepth)) {
                    listener.setListenerName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerName", targetDepth)) {
                    listener.setListenerName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerId", targetDepth)) {
                    listener.setListenerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerState", targetDepth)) {
                    listener.setListenerState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CertificateId", targetDepth)) {
                    listener.setCertificateId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerProtocol", targetDepth)) {
                    listener.setListenerProtocol(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerPort", targetDepth)) {
                    listener.setListenerPort(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Method", targetDepth)) {
                    listener.setMethod(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthCheck", targetDepth)) {
                    listener.addHealthCheck(HealthCheckStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Session", targetDepth)) {
                    listener.addSession(SessionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RealServer", targetDepth)) {
                    listener.addRealServer(RealServerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            }else if (xmlEvent.isEndElement()){
                if (context.getCurrentDepth() < originalDepth){
                    return listener;
                }
            }
        }
    }
}
