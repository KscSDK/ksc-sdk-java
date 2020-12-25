package com.ksc.kec.model.transform;

import com.ksc.kec.model.KeyItem;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Created by pengtong on 2020/9/30 15:26.
 */
public class KeyItemStaxUnmarshaller implements
        Unmarshaller<KeyItem, StaxUnmarshallerContext> {

    public KeyItem unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        KeyItem nsg = new KeyItem();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return nsg;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("InstanceId", targetDepth)) {
                    nsg.setInstanceId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("Return", targetDepth)) {
                    nsg.setReturn(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return nsg;
                }
            }
        }
    }

    private static KeyItemStaxUnmarshaller instance;

    public static KeyItemStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyItemStaxUnmarshaller();
        return instance;
    }
}
