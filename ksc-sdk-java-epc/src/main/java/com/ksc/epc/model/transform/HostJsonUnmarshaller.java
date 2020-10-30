package com.ksc.epc.model.transform;

import com.ksc.epc.model.Host;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        import com.ksc.epc.model.Disk;
        import com.ksc.epc.model.NetworkInterfaceAttribute;

public class HostJsonUnmarshaller implements Unmarshaller<Host, JsonUnmarshallerContext> {
    private static HostJsonUnmarshaller instance;

    public static HostJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HostJsonUnmarshaller();
        return instance;
    }

    @Override
    public Host unmarshall(JsonUnmarshallerContext context) throws Exception {
        Host Host = new Host();
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;
        while (true) {
            if (token == null)
                break;
            if (token == FIELD_NAME || token == START_OBJECT) {
                    if (context.testExpression("CreateTime", targetDepth)) {
                        context.nextToken();
                            Host.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostId", targetDepth)) {
                        context.nextToken();
                            Host.setHostId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostType", targetDepth)) {
                        context.nextToken();
                            Host.setHostType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AllowModifyHyperThreading", targetDepth)) {
                        context.nextToken();
                            Host.setAllowModifyHyperThreading(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostName", targetDepth)) {
                        context.nextToken();
                            Host.setHostName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ReleasableTime", targetDepth)) {
                        context.nextToken();
                            Host.setReleasableTime(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("TorName", targetDepth)) {
                        context.nextToken();
                            Host.setTorName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CabinetName", targetDepth)) {
                        context.nextToken();
                            Host.setCabinetName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("RackName", targetDepth)) {
                        context.nextToken();
                            Host.setRackName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("RackId", targetDepth)) {
                        context.nextToken();
                            Host.setRackId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Sn", targetDepth)) {
                        context.nextToken();
                            Host.setSn(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CabinetId", targetDepth)) {
                        context.nextToken();
                            Host.setCabinetId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AvailabilityZone", targetDepth)) {
                        context.nextToken();
                            Host.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Raid", targetDepth)) {
                        context.nextToken();
                            Host.setRaid(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ImageId", targetDepth)) {
                        context.nextToken();
                            Host.setImageId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("KeyId", targetDepth)) {
                        context.nextToken();
                            Host.setKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("NetworkInterfaceMode", targetDepth)) {
                        context.nextToken();
                            Host.setNetworkInterfaceMode(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("BondAttribute", targetDepth)) {
                        context.nextToken();
                            Host.setBondAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("EnableBond", targetDepth)) {
                        context.nextToken();
                            Host.setEnableBond(context.getUnmarshaller(Boolean.class).unmarshall(context));
                    }
                    if (context.testExpression("SecurityAgent", targetDepth)) {
                        context.nextToken();
                            Host.setSecurityAgent(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CloudMonitorAgent", targetDepth)) {
                        context.nextToken();
                            Host.setCloudMonitorAgent(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("SupportEbs", targetDepth)) {
                        context.nextToken();
                            Host.setSupportEbs(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ProductType", targetDepth)) {
                        context.nextToken();
                            Host.setProductType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("OsName", targetDepth)) {
                        context.nextToken();
                            Host.setOsName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Memory", targetDepth)) {
                        context.nextToken();
                            Host.setMemory(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostStatus", targetDepth)) {
                        context.nextToken();
                            Host.setHostStatus(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ClusterId", targetDepth)) {
                        context.nextToken();
                            Host.setClusterId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("EnableContainer", targetDepth)) {
                        context.nextToken();
                            Host.setEnableContainer(context.getUnmarshaller(Boolean.class).unmarshall(context));
                    }
                    if (context.testExpression("SystemFileType", targetDepth)) {
                        context.nextToken();
                            Host.setSystemFileType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("DataFileType", targetDepth)) {
                        context.nextToken();
                            Host.setDataFileType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("DataDiskCatalogue", targetDepth)) {
                        context.nextToken();
                            Host.setDataDiskCatalogue(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("DataDiskCatalogueSuffix", targetDepth)) {
                        context.nextToken();
                            Host.setDataDiskCatalogueSuffix(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("KesAgent", targetDepth)) {
                        context.nextToken();
                            Host.setKesAgent(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("KplAgent", targetDepth)) {
                        context.nextToken();
                            Host.setKplAgent(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("KmrAgent", targetDepth)) {
                        context.nextToken();
                            Host.setKmrAgent(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ProjectId", targetDepth)) {
                        context.nextToken();
                            Host.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Cpu", targetDepth)) {
                        context.nextToken();
                        Host.setCpu(CpuJsonUnmarshaller.getInstance().unmarshall(context));
                    }
                    if (context.testExpression("Gpu", targetDepth)) {
                        context.nextToken();
                        Host.setGpu(GpuJsonUnmarshaller.getInstance().unmarshall(context));
                    }
                    if (context.testExpression("DiskSet", targetDepth)) {
                        context.nextToken();
                        Host.setDiskSet(new ListUnmarshaller<Disk>(DiskJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("NetworkInterfaceAttributeSet", targetDepth)) {
                        context.nextToken();
                        Host.setNetworkInterfaceAttributeSet(new ListUnmarshaller<NetworkInterfaceAttribute>(NetworkInterfaceAttributeJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                    || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return Host;
    }
}
