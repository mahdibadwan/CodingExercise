package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "averagePriceValue", "totalPriceValue", "crossOutPriceValue", "originalPricePerNight", 
	"percentSavings", "drr" })

public class HotelPricingInfo {
	@JsonProperty("averagePriceValue")
    private Float averagePriceValue;
	@JsonProperty("totalPriceValue")
    private Float totalPriceValue;
	@JsonProperty("crossOutPriceValue")
    private Float crossOutPriceValue;
	@JsonProperty("originalPricePerNight")
    private Float originalPricePerNight;
	@JsonProperty("percentSavings")
    private Float percentSavings;
	@JsonProperty("drr")
    private boolean drr;
	

	public HotelPricingInfo() {
	}
	/**
	 * @param averagePriceValue
	 * @param totalPriceValue
	 * @param crossOutPriceValue
	 * @param originalPricePerNight
	 * @param percentSavings
	 * @param drr
	 */
	public HotelPricingInfo(Float averagePriceValue, Float totalPriceValue, Float crossOutPriceValue,
			Float originalPricePerNight, Float percentSavings, boolean drr) {
		this.averagePriceValue = averagePriceValue;
		this.totalPriceValue = totalPriceValue;
		this.crossOutPriceValue = crossOutPriceValue;
		this.originalPricePerNight = originalPricePerNight;
		this.percentSavings = percentSavings;
		this.drr = drr;
	}
	public Float getAveragePriceValue() {
		return averagePriceValue;
	}
	public void setAveragePriceValue(Float averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}
	public Float getTotalPriceValue() {
		return totalPriceValue;
	}
	public void setTotalPriceValue(Float totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}
	public Float getCrossOutPriceValue() {
		return crossOutPriceValue;
	}
	public void setCrossOutPriceValue(Float crossOutPriceValue) {
		this.crossOutPriceValue = crossOutPriceValue;
	}
	public Float getOriginalPricePerNight() {
		return originalPricePerNight;
	}
	public void setOriginalPricePerNight(Float originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}
	public Float getPercentSavings() {
		return percentSavings;
	}
	public void setPercentSavings(Float percentSavings) {
		this.percentSavings = percentSavings;
	}
	public boolean isDrr() {
		return drr;
	}
	public void setDrr(boolean drr) {
		this.drr = drr;
	}
	
	

}
