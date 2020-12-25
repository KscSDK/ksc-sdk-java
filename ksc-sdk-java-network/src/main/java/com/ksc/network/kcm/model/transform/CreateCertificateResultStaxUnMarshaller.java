package com.ksc.network.kcm.model.transform;

import com.ksc.network.kcm.model.CreateCertificateResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateCertificateResult StAX Unmarshaller
 */
public class CreateCertificateResultStaxUnMarshaller implements
        Unmarshaller<CreateCertificateResult, StaxUnmarshallerContext> {
    @Override
    public CreateCertificateResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateCertificateResult createCertificateResult = new CreateCertificateResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createCertificateResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("RequestId", targetDepth)) {
                    createCertificateResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    createCertificateResult.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                } else if (context.testExpression("CertificateName", targetDepth)) {
                    createCertificateResult.setCertificateName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                } else if (context.testExpression("CertificateId", targetDepth)) {
                    createCertificateResult.setCertificateId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createCertificateResult;
                }
            }
        }
    }

    private static CreateCertificateResultStaxUnMarshaller instance;

    public static CreateCertificateResultStaxUnMarshaller getInstance() {
        if (instance == null)
            instance = new CreateCertificateResultStaxUnMarshaller();
        return instance;
    }
}
