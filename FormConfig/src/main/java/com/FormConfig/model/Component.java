package com.FormConfig.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonValue;

public class Component {
	
	private Map <String,Object> element;

	@JsonValue
	public Map<String, Object> getElement() {
		return element;
	}

	public void setElement(Map<String, Object> element) {
		this.element = element;
	}

	
	public Component(Map<String, Object> element) {
		super();
		this.element = element;
	}
	
	

}
