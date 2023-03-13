package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * Contains the output of ImageCopyResult.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class PriceInfoDetail implements Serializable, Cloneable {

	private static final long serialVersionUID = -4895893764015706216L;

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public BigDecimal getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(BigDecimal tradePrice) {
		this.tradePrice = tradePrice;
	}

	public String getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public BigDecimal getUserDiscount() {
		return userDiscount;
	}

	public void setUserDiscount(BigDecimal userDiscount) {
		this.userDiscount = userDiscount;
	}

	private BigDecimal discountPrice;

	private BigDecimal originalPrice;

	private BigDecimal tradePrice;


	private String priceUnit;


	private BigDecimal userDiscount;



	@Override
	public PriceInfoDetail clone() {
		try {
			return (PriceInfoDetail) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}



}