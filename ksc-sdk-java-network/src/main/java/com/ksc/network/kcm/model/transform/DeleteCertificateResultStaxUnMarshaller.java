package com.ksc.network.kcm.model.transform;

import com.ksc.network.kcm.model.DeleteCertificateResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DeleteCertificateResultStaxUnMarshaller implements
        Unmarshaller<DeleteCertificateResult, StaxUnmarshallerContext> {
    @Override
    public DeleteCertificateResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteCertificateResult deleteCertificateResult = new DeleteCertificateResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteCertificateResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Return", targetDepth)) {
                    deleteCertificateResult.setReturn(Boolean.parseBoolean(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context)));
                    continue;
                } else if (context.testExpression("RequestId", targetDepth)) {
                    deleteCertificateResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteCertificateResult;
                }
            }
        }
    }

    private static DeleteCertificateResultStaxUnMarshaller instance;

    public static DeleteCertificateResultStaxUnMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteCertificateResultStaxUnMarshaller();
        return instance;
    }
}
