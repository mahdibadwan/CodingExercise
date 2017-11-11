package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "hotelId", "hotelName", "localizedHotelName", "hotelDestination", 
	"hotelDestinationRegionID", "hotelLongDestination", "hotelStreetAddress", "hotelCity", 
	"hotelProvince", "hotelCountryCode", "hotelLatitude", "hotelLongitude", 
	"hotelStarRating", "hotelGuestReviewRating", "hotelReviewTotal", "hotelImageUrl", "isOfficialRating" })
public class HotelInfo {
	 @JsonProperty("hotelId")
	    private String hotelId;
	 @JsonProperty("hotelName")
	    private String hotelName;
	 @JsonProperty("localizedHotelName")
	    private String localizedHotelName; 
	 @JsonProperty("hotelDestination")
	    private String hotelDestination;
	 @JsonProperty("hotelDestinationRegionID")
	    private String hotelDestinationRegionID;
	 @JsonProperty("hotelLongDestination")
	    private String hotelLongDestination;
	 @JsonProperty("hotelStreetAddress")
	    private String hotelStreetAddress;
	 @JsonProperty("hotelCity")
	    private String hotelCity;
	 @JsonProperty("hotelProvince")
	    private String hotelProvince;
	 @JsonProperty("hotelCountryCode")
	    private String hotelCountryCode;
	 @JsonProperty("hotelLatitude")
	    private Float hotelLatitude;
	 @JsonProperty("hotelLongitude")
	    private Float hotelLongitude;
	 @JsonProperty("hotelStarRating")
	    private String hotelStarRating;
	 @JsonProperty("hotelGuestReviewRating")
	    private Float hotelGuestReviewRating;
	 @JsonProperty("hotelReviewTotal")
	    private Integer hotelReviewTotal;
	 @JsonProperty("hotelImageUrl")
	    private String hotelImageUrl;
	 @JsonProperty("isOfficialRating")
	    private boolean isOfficialRating;
	 
	public HotelInfo() {
	}
	
	/**
	 * @param hotelId
	 * @param hotelName
	 * @param localizedHotelName
	 * @param hotelDestination
	 * @param hotelDestinationRegionID
	 * @param hotelLongDestination
	 * @param hotelStreetAddress
	 * @param hotelCity
	 * @param hotelProvince
	 * @param hotelCountryCode
	 * @param hotelLatitude
	 * @param hotelLongitude
	 * @param hotelStarRating
	 * @param hotelGuestReviewRating
	 * @param hotelReviewTotal
	 * @param hotelImageUrl
	 * @param isOfficialRating
	 */
	public HotelInfo(String hotelId, String hotelName, String localizedHotelName, String hotelDestination,
			String hotelDestinationRegionID, String hotelLongDestination, String hotelStreetAddress, String hotelCity,
			String hotelProvince, String hotelCountryCode, Float hotelLatitude, Float hotelLongitude,
			String hotelStarRating, Float hotelGuestReviewRating, Integer hotelReviewTotal, String hotelImageUrl,
			boolean isOfficialRating) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.localizedHotelName = localizedHotelName;
		this.hotelDestination = hotelDestination;
		this.hotelDestinationRegionID = hotelDestinationRegionID;
		this.hotelLongDestination = hotelLongDestination;
		this.hotelStreetAddress = hotelStreetAddress;
		this.hotelCity = hotelCity;
		this.hotelProvince = hotelProvince;
		this.hotelCountryCode = hotelCountryCode;
		this.hotelLatitude = hotelLatitude;
		this.hotelLongitude = hotelLongitude;
		this.hotelStarRating = hotelStarRating;
		this.hotelGuestReviewRating = hotelGuestReviewRating;
		this.hotelReviewTotal = hotelReviewTotal;
		this.hotelImageUrl = hotelImageUrl;
		this.isOfficialRating = isOfficialRating;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getLocalizedHotelName() {
		return localizedHotelName;
	}
	public void setLocalizedHotelName(String localizedHotelName) {
		this.localizedHotelName = localizedHotelName;
	}
	public String getHotelDestination() {
		return hotelDestination;
	}
	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}
	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}
	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}
	public String getHotelLongDestination() {
		return hotelLongDestination;
	}
	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}
	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}
	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	public String getHotelProvince() {
		return hotelProvince;
	}
	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}
	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}
	public Float getHotelLatitude() {
		return hotelLatitude;
	}
	public void setHotelLatitude(Float hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}
	public Float getHotelLongitude() {
		return hotelLongitude;
	}
	public void setHotelLongitude(Float hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}
	public String getHotelStarRating() {
		return hotelStarRating;
	}
	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}
	public Float getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}
	public void setHotelGuestReviewRating(Float hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}
	public Integer getHotelReviewTotal() {
		return hotelReviewTotal;
	}
	public void setHotelReviewTotal(Integer hotelReviewTotal) {
		this.hotelReviewTotal = hotelReviewTotal;
	}
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}
	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}
	public boolean isOfficialRating() {
		return isOfficialRating;
	}
	public void setOfficialRating(boolean isOfficialRating) {
		this.isOfficialRating = isOfficialRating;
	}

}
