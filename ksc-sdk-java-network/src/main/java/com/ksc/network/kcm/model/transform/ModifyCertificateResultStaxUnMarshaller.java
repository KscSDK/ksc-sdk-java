package com.ksc.network.kcm.model.transform;

import com.ksc.network.kcm.model.ModifyCertificateResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class ModifyCertificateResultStaxUnMarshaller implements
        Unmarshaller<ModifyCertificateResult, StaxUnmarshallerContext> {
    @Override
    public ModifyCertificateResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyCertificateResult modifyCertificateResult = new ModifyCertificateResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyCertificateResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CertificateName", targetDepth)) {
                    modifyCertificateResult.setCertificateName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    modifyCertificateResult.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                } else if (context.testExpression("RequestId", targetDepth)) {
                    modifyCertificateResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                } else if (context.testExpression("CertificateId", targetDepth)) {
                    modifyCertificateResult.setCertificateId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyCertificateResult;
                }
            }
        }
    }

    private static ModifyCertificateResultStaxUnMarshaller instance;

    public static ModifyCertificateResultStaxUnMarshaller getInstance() {
        if (instance == null)
            instance = new ModifyCertificateResultStaxUnMarshaller();
        return instance;
    }
}
