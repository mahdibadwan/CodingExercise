package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "siteID", "language", "currency" })

public class OfferInfo {

	@JsonProperty("siteID")
	private String siteID;
	@JsonProperty("language")
	private String language;
	@JsonProperty("currency")
	private String currency;

	public OfferInfo() {
	}

	/**
	 * @param siteID
	 * @param language
	 * @param currency
	 */
	
	public OfferInfo(String siteID, String language, String currency) {
		this.siteID = siteID;
		this.language = language;
		this.currency = currency;
	}

	
	public String getSiteID() {
		return siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
