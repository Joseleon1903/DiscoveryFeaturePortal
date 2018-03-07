package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.discovery.feature.portal.mvc.commons.interfaces.BuscableType;
import com.discovery.feature.portal.mvc.entity.FeatureTab;

public class FeatureType implements Serializable, BuscableType<FeatureType, FeatureTab> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8627271860838190961L;
	
	private long featureId;
	private String nombre;
	private String idioma;
	private String caracteristica;
	
	private List<AntecedenteType> antecedentes;
	private List<EscenarioType> escenarios;

	public FeatureType() {}	

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
		if (antecedentes == null) {
			antecedentes = new ArrayList<>();
		}
		return antecedentes;
	}

	public void setAntecedentes(List<AntecedenteType> antecedentes) {
		this.antecedentes = antecedentes;
	}

	public List<EscenarioType> getEscenarios() {
		if (escenarios ==null) {
			escenarios = new ArrayList<>();
		}
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
		if (!entity.getAntecedentes().isEmpty()) {
			this.getAntecedentes().addAll(new AntecedenteType().toListType(entity.getAntecedentes()));
		}
		if (!entity.getEscenarios().isEmpty()) {
			this.getEscenarios().addAll(new EscenarioType().toListType(entity.getEscenarios()));
		}
		return this;
	}

	@Override
	public FeatureTab toEntity(FeatureType type) {
		FeatureTab entity =  new FeatureTab();
		entity.setFeatureId(type.getFeatureId());
		entity.setNombre(type.getNombre());
		entity.setIdioma(type.getIdioma());
		entity.setCaracteristica(type.getCaracteristica());
		if (!type.getAntecedentes().isEmpty()) {
			for (AntecedenteType anteType : type.getAntecedentes()) {
				entity.getAntecedentes().add(new AntecedenteType().toEntity(anteType));
			}
		}
		if (!type.getEscenarios().isEmpty()) {
			for (EscenarioType esceType : type.getEscenarios()) {
				entity.getEscenarios().add(new EscenarioType().toEntity(esceType));
			}
		}
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
