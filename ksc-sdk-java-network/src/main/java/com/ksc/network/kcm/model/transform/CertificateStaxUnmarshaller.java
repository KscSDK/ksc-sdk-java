package com.ksc.network.kcm.model.transform;

import com.ksc.network.kcm.model.Certificate;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class CertificateStaxUnmarshaller implements Unmarshaller<Certificate, StaxUnmarshallerContext> {

    private static CertificateStaxUnmarshaller instance;

    public static CertificateStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CertificateStaxUnmarshaller();
        return instance;
    }

    @Override
    public Certificate unmarshall(StaxUnmarshallerContext context) throws Exception {
        Certificate certificate = new Certificate();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return certificate;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("CertificateId", targetDepth)) {
                    certificate.setCertificateId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CertificateName", targetDepth)) {
                    certificate.setCertificateName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateTime", targetDepth)) {
                    certificate.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return certificate;
                }
            }
        }
    }
}
