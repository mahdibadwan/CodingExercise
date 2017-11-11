package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "hotelInfositeUrl", "hotelSearchResultUrl" })

public class HotelUrls {
	 @JsonProperty("hotelInfositeUrl")
	    private String hotelInfositeUrl;
	 @JsonProperty("hotelSearchResultUrl")
	    private String hotelSearchResultUrl;
	
	 
	 /**
	 * 
	 */
	public HotelUrls() {
	}


	/**
		 * @param hotelInfositeUrl
		 * @param hotelSearchResultUrl
		 */
		public HotelUrls(String hotelInfositeUrl, String hotelSearchResultUrl) {
			this.hotelInfositeUrl = hotelInfositeUrl;
			this.hotelSearchResultUrl = hotelSearchResultUrl;
		}
		
	 
	 public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}
	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}
	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}
	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}
	
	 

}
