package com.ksc.monitor.model;

import com.ksc.internal.SdkInternalList;

import lombok.ToString;

@ToString
public class DatapointV1 {
	private SdkInternalList<Tsv> Member;
	public void withMembers(Tsv... Member) {
		if (this.Member == null) {
			this.Member = new com.ksc.internal.SdkInternalList<Tsv>();
		}
		for (Tsv ele : Member) {
			this.Member.add(ele);
		}
	}
	public SdkInternalList<Tsv> getMember() {
		return Member;
	}

	public void setMember(SdkInternalList<Tsv> member) {
		Member = member;
	}

}
