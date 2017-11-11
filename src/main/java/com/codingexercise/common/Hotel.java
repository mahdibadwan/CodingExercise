package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "offerDateRange", "destination", "hotelInfo", "hotelUrgencyInfo", "hotelPricingInfo", "hotelUrls" })

public class Hotel {
	
	@JsonProperty("offerDateRange")
	private OfferDateRange offerDateRange;
	@JsonProperty("destination")
	private Destination destination;
	@JsonProperty("hotelInfo")
	private HotelInfo hotelInfo;
	@JsonProperty("hotelUrgencyInfo")
	private HotelUrgencyInfo hotelUrgencyInfo;
	@JsonProperty("hotelPricingInfo")
	private HotelPricingInfo hotelPricingInfo;
	@JsonProperty("hotelUrls")
	private HotelUrls hotelUrls;
	

	public Hotel() {
	}
	
	/**
	 * @param offerDateRange
	 * @param destination
	 * @param hotelInfo
	 * @param hotelUrgencyInfo
	 * @param hotelPricingInfo
	 * @param hotelUrls
	 */
	public Hotel(OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo,
			HotelUrgencyInfo hotelUrgencyInfo, HotelPricingInfo hotelPricingInfo, HotelUrls hotelUrls) {
		this.offerDateRange = offerDateRange;
		this.destination = destination;
		this.hotelInfo = hotelInfo;
		this.hotelUrgencyInfo = hotelUrgencyInfo;
		this.hotelPricingInfo = hotelPricingInfo;
		this.hotelUrls = hotelUrls;
	}
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}
	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}
	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}
	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}
	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}
	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}
	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}
	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

}
