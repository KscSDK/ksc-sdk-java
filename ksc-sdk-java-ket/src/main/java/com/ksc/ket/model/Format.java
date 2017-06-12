package com.ksc.ket.model;

public class Format {
	private Integer stream_transform_tag;
	private Integer output_format;
	private Integer vbr;
	private Integer vbr_threshold;
	private Integer abr;
	private Integer abr_threshold;
	private Integer fr;
	private Integer remuxflag;
	private String exstream;
	private Integer logo_switch;
	private Integer gop;
	private Integer format_index;
	private String suffix;
	private Integer HlsBandwidth;
	private Integer DisableScenecutSwitch;
    //LiveSnapshot
	private Integer shortside;
	private Integer intelligentSwitch;
	private Integer width;
	private Integer height;
	public Integer getStream_transform_tag() {
		return stream_transform_tag;
	}

	public void setStream_transform_tag(Integer stream_transform_tag) {
		this.stream_transform_tag = stream_transform_tag;
	}

	public Integer getOutput_format() {
		return output_format;
	}

	public void setOutput_format(Integer output_format) {
		this.output_format = output_format;
	}

	public Integer getVbr() {
		return vbr;
	}

	public void setVbr(Integer vbr) {
		this.vbr = vbr;
	}

	public Integer getAbr() {
		return abr;
	}

	public void setAbr(Integer abr) {
		this.abr = abr;
	}

	public Integer getFr() {
		return fr;
	}

	public void setFr(Integer fr) {
		this.fr = fr;
	}

	public Integer getRemuxflag() {
		return remuxflag;
	}

	public void setRemuxflag(Integer remuxflag) {
		this.remuxflag = remuxflag;
	}

	public Integer getLogo_switch() {
		return logo_switch;
	}

	public void setLogo_switch(Integer logo_switch) {
		this.logo_switch = logo_switch;
	}

	public Integer getGop() {
		return gop;
	}

	public void setGop(Integer gop) {
		this.gop = gop;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Integer getHlsBandwidth() {
		return HlsBandwidth;
	}

	public void setHlsBandwidth(Integer hlsBandwidth) {
		HlsBandwidth = hlsBandwidth;
	}

	public Integer getDisableScenecutSwitch() {
		return DisableScenecutSwitch;
	}

	public void setDisableScenecutSwitch(Integer disableScenecutSwitch) {
		DisableScenecutSwitch = disableScenecutSwitch;
	}

	public String getExstream() {
		return exstream;
	}

	public void setExstream(String exstream) {
		this.exstream = exstream;
	}

	public Integer getVbr_threshold() {
		return vbr_threshold;
	}

	public void setVbr_threshold(Integer vbr_threshold) {
		this.vbr_threshold = vbr_threshold;
	}

	public Integer getAbr_threshold() {
		return abr_threshold;
	}

	public void setAbr_threshold(Integer abr_threshold) {
		this.abr_threshold = abr_threshold;
	}

	public Integer getFormat_index() {
		return format_index;
	}

	public void setFormat_index(Integer format_index) {
		this.format_index = format_index;
	}

	public Integer getShortside() {
		return shortside;
	}

	public void setShortside(Integer shortside) {
		this.shortside = shortside;
	}

	public Integer getIntelligentSwitch() {
		return intelligentSwitch;
	}

	public void setIntelligentSwitch(Integer intelligentSwitch) {
		this.intelligentSwitch = intelligentSwitch;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

}
