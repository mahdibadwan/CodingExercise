package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "airAttachRemainingTime", "numberOfPeopleViewing", "numberOfPeopleBooked", "numberOfRoomsLeft", 
	"lastBookedTime", "almostSoldStatus", "link", "airAttachEnabled" })
public class HotelUrgencyInfo {
	@JsonProperty("airAttachRemainingTime")
    private Integer airAttachRemainingTime;
	@JsonProperty("numberOfPeopleViewing")
    private Integer numberOfPeopleViewing;
	@JsonProperty("numberOfPeopleBooked")
    private Integer numberOfPeopleBooked;
	@JsonProperty("numberOfRoomsLeft")
    private Integer numberOfRoomsLeft;
	@JsonProperty("lastBookedTime")
    private Long lastBookedTime;
	@JsonProperty("almostSoldStatus")
    private String almostSoldStatus;
	@JsonProperty("link")
    private String link;
	@JsonProperty("airAttachEnabled")
    private boolean airAttachEnabled;
	
	
	public HotelUrgencyInfo() {
	}
	/**
	 * @param airAttachRemainingTime
	 * @param numberOfPeopleViewing
	 * @param numberOfPeopleBooked
	 * @param numberOfRoomsLeft
	 * @param lastBookedTime
	 * @param almostSoldStatus
	 * @param link
	 * @param airAttachEnabled
	 */
	public HotelUrgencyInfo(Integer airAttachRemainingTime, Integer numberOfPeopleViewing, Integer numberOfPeopleBooked,
			Integer numberOfRoomsLeft, Long lastBookedTime, String almostSoldStatus, String link,
			boolean airAttachEnabled) {
		this.airAttachRemainingTime = airAttachRemainingTime;
		this.numberOfPeopleViewing = numberOfPeopleViewing;
		this.numberOfPeopleBooked = numberOfPeopleBooked;
		this.numberOfRoomsLeft = numberOfRoomsLeft;
		this.lastBookedTime = lastBookedTime;
		this.almostSoldStatus = almostSoldStatus;
		this.link = link;
		this.airAttachEnabled = airAttachEnabled;
	}
	public Integer getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}
	public void setAirAttachRemainingTime(Integer airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}
	public Integer getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}
	public void setNumberOfPeopleViewing(Integer numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}
	public Integer getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}
	public void setNumberOfPeopleBooked(Integer numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}
	public Integer getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}
	public void setNumberOfRoomsLeft(Integer numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}
	public Long getLastBookedTime() {
		return lastBookedTime;
	}
	public void setLastBookedTime(Long lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}
	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}
	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public boolean isAirAttachEnabled() {
		return airAttachEnabled;
	}
	public void setAirAttachEnabled(boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

}
