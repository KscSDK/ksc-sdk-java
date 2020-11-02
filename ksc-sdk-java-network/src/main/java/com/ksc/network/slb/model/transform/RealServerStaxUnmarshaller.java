package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.RealServer;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Created by LIUHONGMING on 2017/4/21.
 */
public class RealServerStaxUnmarshaller implements Unmarshaller<RealServer, StaxUnmarshallerContext> {
    private static RealServerStaxUnmarshaller instance;

    public static RealServerStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealServerStaxUnmarshaller();
        return instance;
    }

    @Override
    public RealServer unmarshall(StaxUnmarshallerContext context) throws Exception {
        RealServer realServer = new RealServer();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return realServer;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("ListenerId", targetDepth)) {
                    realServer.setListenerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RegisterId", targetDepth)) {
                    realServer.setRegisterId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RealServerIp", targetDepth)) {
                    realServer.setRealServerIp(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RealServerPort", targetDepth)) {
                    realServer.setRealServerPort(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RealServerType", targetDepth)) {
                    realServer.setRealServerType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RealServerState", targetDepth)) {
                    realServer.setRealServerState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Weight", targetDepth)) {
                    realServer.setWeight(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            }else if (xmlEvent.isEndElement()){
                if (context.getCurrentDepth() < originalDepth){
                    return realServer;
                }
            }
        }
    }
}
