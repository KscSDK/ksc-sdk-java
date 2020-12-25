package com.ksc.kec.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class DataDiskQuotaInfo {

	private String DataDiskType;
	private Double DataDiskMinSize;
	private Double DataDiskMaxsize;
	private Integer DataDiskCount;
}
