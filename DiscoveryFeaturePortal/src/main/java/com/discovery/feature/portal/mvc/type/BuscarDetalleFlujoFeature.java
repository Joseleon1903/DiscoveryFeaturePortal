package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BuscarDetalleFlujoFeature implements Serializable {

	private List<String> steps;
	private List<String> paramKey;
	private List<String> paramValue;

	public BuscarDetalleFlujoFeature() {
		super();
	}

	public BuscarDetalleFlujoFeature(List<String> steps) {
		super();
		this.steps = steps;
	}

	public List<String> getSteps() {
		if (steps == null) {
			steps = new ArrayList<>();
		}
		return steps;
	}

	public void setSteps(List<String> steps) {
		this.steps = steps;
	}

	public List<String> getParamKey() {
		if (paramKey == null) {
			paramKey = new ArrayList<>();
		}
		return paramKey;
	}

	public void setParamKey(List<String> paramKey) {
		this.paramKey = paramKey;
	}

	public List<String> getParamValue() {
		if (paramValue == null) {
			paramValue = new ArrayList<>();
		}
		return paramValue;
	}

	public void setParamValue(List<String> paramValue) {
		this.paramValue = paramValue;
	}	
	

}
