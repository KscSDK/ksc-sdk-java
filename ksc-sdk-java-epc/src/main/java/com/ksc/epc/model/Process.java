package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class Process {

    /**
     * 问题属性
     */
    private String attribute;
    /**
     * 操作流程ID
     */
    private String operationProcessId;
    /**
     * 工单ID
     */
    private String processId;
    /**
     * 状态
     */
    private String status;
    /**
     * 实例SN
     */
    private String sn;
    /**
     * 机房
     */
    private String region;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 确认是否可以重启
     */
    private String confirm;
    /**
     * 操作类型
     */
    private String type;
    /**
     * 标题
     */
    private String title;
    /**
     * 服务器数量
     */
    private Integer machineCount;
    /**
     * 内容
     */
    private String content;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 回复信息
     */
    private List<CommunicationContent> communicationContentSet;

    public void addCommunicationContentSet(CommunicationContent... communicationContentSet) {
        if (this.communicationContentSet == null) {
            this.communicationContentSet = new com.ksc.internal.SdkInternalList<CommunicationContent>();
        }
        for (CommunicationContent value : communicationContentSet) {
            this.communicationContentSet.add(value);
        }
    }
    public void setCommunicationContentSet(List<CommunicationContent> communicationContentSet) {
        this.communicationContentSet = new com.ksc.internal.SdkInternalList<CommunicationContent>(communicationContentSet);
    }

}
