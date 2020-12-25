package com.ksc.network.kcm.model.transform;

import com.ksc.network.kcm.model.DescribeCertificatesResult;
import com.ksc.network.slb.model.transform.DescribeHealthChecksResultStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DescribeCertificatesResultStaxUnMarshaller implements Unmarshaller<DescribeCertificatesResult, StaxUnmarshallerContext> {
    @Override
    public DescribeCertificatesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeCertificatesResult describeCertificatesResult = new DescribeCertificatesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeCertificatesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CertificateSet/item", targetDepth)) {
                    describeCertificatesResult
                            .addCertificateSet(CertificateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                } else if (context.testExpression("RequestId", targetDepth)) {
                    describeCertificatesResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeCertificatesResult;
                }
            }
        }
    }

    private static DescribeHealthChecksResultStaxUnmarshaller instance;

    public static DescribeHealthChecksResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHealthChecksResultStaxUnmarshaller();
        return instance;
    }

}
