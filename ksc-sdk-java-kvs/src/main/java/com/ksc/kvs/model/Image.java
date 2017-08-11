package com.ksc.kvs.model;

public class Image {
	private String logoUrl;
	private Double offsetX;
	private Double offsetY;
	private int shortSide;
	private String pic;
	
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public Double getOffsetX() {
		return offsetX;
	}
	public void setOffsetX(Double offsetX) {
		this.offsetX = offsetX;
	}
	public Double getOffsetY() {
		return offsetY;
	}
	public void setOffsetY(Double offsetY) {
		this.offsetY = offsetY;
	}
	public int getShortSide() {
		return shortSide;
	}
	public void setShortSide(int shortSide) {
		this.shortSide = shortSide;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
}
