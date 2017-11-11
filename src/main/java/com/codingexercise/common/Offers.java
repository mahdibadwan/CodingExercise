package com.codingexercise.common;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "Hotel" })

public class Offers {

	@JsonProperty("Hotel")
	private List<Hotel> Hotels = new ArrayList<Hotel>();

	public Offers() {
	}

	/**
	 * @param hotel
	 */
	public Offers(List<Hotel> hotels) {
		this.Hotels = hotels;
	}

	public List<Hotel> getHotels() {
		return Hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.Hotels = hotels;
	}

}
