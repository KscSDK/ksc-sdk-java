package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.CreateLoadBalancerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Created by LIUHONGMING on 2017/4/24.
 */
public class CreateLoadBalancerResultStaxUnmarshaller implements
        Unmarshaller<CreateLoadBalancerResult, StaxUnmarshallerContext> {

    public CreateLoadBalancerResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        CreateLoadBalancerResult createLoadBalancerResult = new CreateLoadBalancerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createLoadBalancerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {

                    createLoadBalancerResult.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    createLoadBalancerResult.setVpcId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequestId", targetDepth)) {
                    createLoadBalancerResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancerName", targetDepth)) {
                    createLoadBalancerResult.setLoadBalancerName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Type", targetDepth)) {
                    createLoadBalancerResult.setType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancerId", targetDepth)) {
                    createLoadBalancerResult.setLoadBalancerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndDocument()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createLoadBalancerResult;
                }
            }
        }
    }

    private static CreateLoadBalancerResultStaxUnmarshaller instance;

    public static CreateLoadBalancerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateLoadBalancerResultStaxUnmarshaller();
        return instance;
    }
}


