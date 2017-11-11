package com.codingexercise.common;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "personaType" })

public class Persona {
	@JsonProperty("personaType")
	private String personaType;

	public Persona() {
	}

	/**
	 * @param personaType
	 */
	public Persona(String personaType) {
		this.personaType = personaType;
	}

	public String getPersonaType() {
		return personaType;
	}

	public void setPersonaType(String personaType) {
		this.personaType = personaType;
	}

}
