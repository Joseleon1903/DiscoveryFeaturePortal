package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EscenarioType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7014825913249029677L;
	
	private String name;
	private List<String> steps;
	
	public EscenarioType() { super(); }
	
	public EscenarioType(String name, List<String> steps) {
		super();
		this.name = name;
		this.steps = steps;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getSteps() {
		if (steps == null) {
			steps = new ArrayList<>();
		}
		return steps;
	}
	
	public void setSteps( List<String> steps) {
		this.steps = steps;
	}

	@Override
	public String toString() {
		return "EscenarioType [name=" + name + ", steps=" + steps + "]";
	}	

}
