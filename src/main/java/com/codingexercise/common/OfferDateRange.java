package com.codingexercise.common;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "travelStartDate", "travelEndDate", "lengthOfStay" })

public class OfferDateRange {
	@JsonProperty("travelStartDate")
	private List<Integer> travelStartDate = new ArrayList<Integer>();
	@JsonProperty("travelEndDate")
	private List<Integer> travelEndDate = new ArrayList<Integer>();
	@JsonProperty("lengthOfStay")
	private Integer lengthOfStay;

	public OfferDateRange() {
	}

	/**
	 * @param travelStartDate
	 * @param travelEndDate
	 * @param lengthOfStay
	 */
	public OfferDateRange(List<Integer> travelStartDate, List<Integer> travelEndDate, Integer lengthOfStay) {
		this.travelStartDate = travelStartDate;
		this.travelEndDate = travelEndDate;
		this.lengthOfStay = lengthOfStay;
	}

	public List<Integer> getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(List<Integer> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public List<Integer> getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(List<Integer> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

}
