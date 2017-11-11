package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "regionID", "associatedMultiCityRegionId", "longName", "shortName", 
	"country", "province", "city", "tla", "nonLocalizedCity" })
public class Destination {
	 @JsonProperty("regionID")
	    private String regionID;
	 @JsonProperty("associatedMultiCityRegionId")
	    private String associatedMultiCityRegionId;
	 @JsonProperty("longName")
	    private String longName;
	 @JsonProperty("shortName")
	    private String shortName;
	 @JsonProperty("country")
	    private String country;
	 @JsonProperty("province")
	    private String province;
	 @JsonProperty("city")
	    private String city;
	 @JsonProperty("tla")
	    private String tla;
	 @JsonProperty("nonLocalizedCity")
	    private String nonLocalizedCity;
	 
	public Destination() {
	}
	
	/**
	 * @param regionID
	 * @param associatedMultiCityRegionId
	 * @param longName
	 * @param shortName
	 * @param country
	 * @param province
	 * @param city
	 * @param tla
	 * @param nonLocalizedCity
	 */
	public Destination(String regionID, String associatedMultiCityRegionId, String longName, String shortName,
			String country, String province, String city, String tla, String nonLocalizedCity) {
		this.regionID = regionID;
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
		this.longName = longName;
		this.shortName = shortName;
		this.country = country;
		this.province = province;
		this.city = city;
		this.tla = tla;
		this.nonLocalizedCity = nonLocalizedCity;
	}
	public String getRegionID() {
		return regionID;
	}
	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}
	public String getAssociatedMultiCityRegionId() {
		return associatedMultiCityRegionId;
	}
	public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTla() {
		return tla;
	}
	public void setTla(String tla) {
		this.tla = tla;
	}
	public String getNonLocalizedCity() {
		return nonLocalizedCity;
	}
	public void setNonLocalizedCity(String nonLocalizedCity) {
		this.nonLocalizedCity = nonLocalizedCity;
	}
	 

}
