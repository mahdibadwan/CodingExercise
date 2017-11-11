package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "offerInfo", "userInfo", "offers" })
public class HotelDealResponse {

	@JsonProperty("offerInfo")
	private OfferInfo offerInfo;
	@JsonProperty("userInfo")
	private UserInfo userInfo;
	@JsonProperty("offers")
	private Offers offers;

	public HotelDealResponse() {
	}

	/**
	 * @param offerInfo
	 * @param userInfo
	 * @param offers
	 */
	public HotelDealResponse(OfferInfo offerInfo, UserInfo userInfo, Offers offers) {
		this.offerInfo = offerInfo;
		this.userInfo = userInfo;
		this.offers = offers;
	}

	public OfferInfo getOfferInfo() {
		return offerInfo;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Offers getOffers() {
		return offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}

}
