package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.discovery.feature.portal.mapping.GenericMapping;
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

	public FeatureType() {}	

	public FeatureType(long featureId, String nombre, String idioma, String caracteristica) {
		super();
		this.featureId = featureId;
		this.nombre = nombre;
		this.idioma = idioma;
		this.caracteristica = caracteristica;
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

	@Override
	public String toString() {
		return "FeatureType [featureId=" + featureId + ", nombre=" + nombre + ", idioma=" + idioma + ", caracteristica="
				+ caracteristica + "]";
	}

	@Override
	public FeatureType toType(FeatureTab entity) {
		this.nombre = entity.getName();
		this.featureId = entity.getFeatureId();
		this.idioma = GenericMapping.buscarIdiomaEnComments(entity.getComments());
		this.caracteristica = entity.getDescription();
		return this;
	}

	@Override
	public FeatureTab toEntity(FeatureType type) {
		FeatureTab entity =  new FeatureTab();
		entity.setFeatureId(type.getFeatureId());
		entity.setName(type.getNombre());
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