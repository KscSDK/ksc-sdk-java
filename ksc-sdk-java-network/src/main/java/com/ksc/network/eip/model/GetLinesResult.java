package com.ksc.network.eip.model;

import java.io.Serializable;

import lombok.ToString;
/**
 * <p>
 * Contains the output of GetLines.
 * </p>
 */
@ToString
public class GetLinesResult implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4035491212494940629L;
	private String RequestId;
    /**
     * <p>
     * Information about one or more Line.
     * </p>
     */
	private com.ksc.internal.SdkInternalList<Line> LineSet;
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	public com.ksc.internal.SdkInternalList<Line> getLineSet() {
		return LineSet;
	}
	public void setLineSet(com.ksc.internal.SdkInternalList<Line> lineSet) {
		if (lineSet != null) {
			LineSet = new com.ksc.internal.SdkInternalList<Line>();
        }
	}
	public void addLines(Line... lines){
		if (LineSet == null) {
			LineSet = new com.ksc.internal.SdkInternalList<Line>();
        }
		for(Line line:lines){
			LineSet.add(line);
		}
	}
	
}
