package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.discovery.feature.portal.mvc.commons.interfaces.BuscableType;
import com.discovery.feature.portal.mvc.entity.FeatureTab;

public class FeatureType implements Serializable, BuscableType<FeatureType, FeatureTab> {
	
	private long featureId;
	private String nombre;
	private String idioma;
	private String caracteristica;
	
	private List<AntecedenteType> antecedentes;
	private List<EscenarioType> escenarios;

	public FeatureType() {
		// TODO Auto-generated constructor stub
	}	

	public FeatureType(long featureId, String nombre, String idioma, String caracteristica,
			List<AntecedenteType> antecedentes, List<EscenarioType> escenarios) {
		super();
		this.featureId = featureId;
		this.nombre = nombre;
		this.idioma = idioma;
		this.caracteristica = caracteristica;
		this.antecedentes = antecedentes;
		this.escenarios = escenarios;
	}

	public long getFeatureId() {
		return featureId;
	}

	public void setFeatureId(long featureId) {
		this.featureId = featureId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public List<AntecedenteType> getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(List<AntecedenteType> antecedentes) {
		this.antecedentes = antecedentes;
	}

	public List<EscenarioType> getEscenarios() {
		return escenarios;
	}

	public void setEscenarios(List<EscenarioType> escenarios) {
		this.escenarios = escenarios;
	}

	@Override
	public String toString() {
		return "FeatureType [featureId=" + featureId + ", nombre=" + nombre + ", idioma=" + idioma + ", caracteristica="
				+ caracteristica + ", antecedentes=" + antecedentes + ", escenarios=" + escenarios + "]";
	}

	@Override
	public FeatureType toType(FeatureTab entity) {
		this.nombre = entity.getNombre();
		this.featureId = entity.getFeatureId();
		this.idioma = entity.getIdioma();
		this.caracteristica = entity.getCaracteristica();		
		return this;
	}

	@Override
	public FeatureTab toEntity(FeatureType type) {
		FeatureTab entity =  new FeatureTab();
		entity.setFeatureId(type.getFeatureId());
		entity.setNombre(type.getNombre());
		entity.setIdioma(type.getIdioma());
		entity.setCaracteristica(type.getCaracteristica());
		return entity;
	}

	@Override
	public List<FeatureType> toListType(List<FeatureTab> entityList) {
		List<FeatureType> typeList = new ArrayList<>();
		for (FeatureTab entidad : entityList) {
			typeList.add(new FeatureType().toType(entidad));
		}
		return typeList;
	}


}
