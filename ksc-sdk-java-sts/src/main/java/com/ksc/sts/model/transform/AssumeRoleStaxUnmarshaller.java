package com.ksc.sts.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.sts.model.AssumeRoleResult;
import com.ksc.sts.model.AssumeRoleUser;
import com.ksc.sts.model.Credentials;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.DateStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class AssumeRoleStaxUnmarshaller
        implements Unmarshaller<AssumeRoleResult, StaxUnmarshallerContext> {

    private static AssumeRoleStaxUnmarshaller instance;

    public static AssumeRoleStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssumeRoleStaxUnmarshaller();
        return instance;
    }

    @Override
    public AssumeRoleResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        AssumeRoleResult assumeRoleResult = new AssumeRoleResult();
        AssumeRoleUser assumeRoleUser = new AssumeRoleUser();
        Credentials credentials = new Credentials();
        assumeRoleResult.setAssumeRoleUser(assumeRoleUser);
        assumeRoleResult.setCredentials(credentials);

        int originalDepth = context.getCurrentDepth();

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) {
                return assumeRoleResult;
            }
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("ResponseMetadata/RequestId")) {
                    assumeRoleResult.setRequestId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Credentials/SecretAccessKey")) {
                    credentials.setSecretAccessKey(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Credentials/Expiration")) {
                    credentials.setExpiration(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Credentials/AccessKeyId")) {
                    credentials.setAccessKeyId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AssumedRoleUser/Krn")) {
                    assumeRoleUser.setKrn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AssumedRoleUser/AssumedRoleId")) {
                    assumeRoleUser.setAssumedRoleId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth) {
                        return assumeRoleResult;
                    }
                }
            }
        }
    }

}
