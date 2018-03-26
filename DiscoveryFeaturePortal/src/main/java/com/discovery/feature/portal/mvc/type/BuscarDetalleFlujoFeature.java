package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BuscarDetalleFlujoFeature implements Serializable {

	private List<String> steps;

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

}
