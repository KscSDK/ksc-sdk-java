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
public class PriceInfo implements Serializable, Cloneable {

	private static final long serialVersionUID = -4895893764015706219L;

	private PriceInfoDetail instancePrice;


	private PriceInfoDetail eBSPrice;

	public PriceInfoDetail getInstancePrice() {
		return instancePrice;
	}

	public void setInstancePrice(PriceInfoDetail instancePrice) {
		this.instancePrice = instancePrice;
	}

	public PriceInfoDetail geteBSPrice() {
		return eBSPrice;
	}

	public void seteBSPrice(PriceInfoDetail eBSPrice) {
		this.eBSPrice = eBSPrice;
	}


	@Override
	public PriceInfo clone() {
		try {
			return (PriceInfo) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}


}