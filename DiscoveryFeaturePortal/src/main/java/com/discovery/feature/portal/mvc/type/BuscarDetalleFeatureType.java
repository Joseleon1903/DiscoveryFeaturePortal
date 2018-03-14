package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BuscarDetalleFeatureType implements Serializable {

	private List<AntecedenteType> antecedentes;
	private List<EscenarioType> escenarios;

	public BuscarDetalleFeatureType() {
		// TODO Auto-generated constructor stub
	}

	public List<AntecedenteType> getAntecedentes() {
		if (antecedentes == null) {
			antecedentes = new ArrayList<>();
		}
		return antecedentes;
	}

	public void setAntecedentes(List<AntecedenteType> antecedentes) {
		this.antecedentes = antecedentes;
	}

	public List<EscenarioType> getEscenarios() {
		if (escenarios == null) {
			escenarios = new ArrayList<>();
		}
		return escenarios;
	}

	public void setEscenarios(List<EscenarioType> escenarios) {
		this.escenarios = escenarios;
	}

	@Override
	public String toString() {
		return "BuscarDetalleFeatureType [antecedentes=" + antecedentes + ", escenarios=" + escenarios + "]";
	}

}
