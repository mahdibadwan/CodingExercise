package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "persona", "userId" })

public class UserInfo {

	@JsonProperty("persona")
	private Persona persona;
	@JsonProperty("userId")
	private String userInfo;

	public UserInfo() {
	}

	/**
	 * @param persona
	 * @param userInfo
	 */

	public UserInfo(Persona persona, String userInfo) {
		this.persona = persona;
		this.userInfo = userInfo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}
