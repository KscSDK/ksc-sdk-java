package com.ksc.kec.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * Contains the output of ImageCopyResult.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribePriceResult implements Serializable, Cloneable {

	private static final long serialVersionUID = -4895893764015706216L;

	private String RequestId;
	private PriceInfo priceInfo;



	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public PriceInfo getPriceInfo() {
		return priceInfo;
	}

	public void setPriceInfo(PriceInfo priceInfo) {
		priceInfo = priceInfo;
	}



	@Override
	public DescribePriceResult clone() {
		try {
			return (DescribePriceResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}

	@Data
	public static class PriceInfo {

		private PriceInfoDetail instancePrice;


		private PriceInfoDetail eBSPrice;
	}

	@Data
	public static class PriceInfoDetail {

		private BigDecimal discountPrice;

		private BigDecimal originalPrice;

		private BigDecimal tradePrice;


		private String priceUnit;


		private BigDecimal userDiscount;
	}
}