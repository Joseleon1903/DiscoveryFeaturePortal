package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;

public class BuscarFeatureType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8827995287650874669L;
	
	private long featureId;
	private String nombre;
	private String idioma;
	private String caracteristica;
	private String tags;

	public BuscarFeatureType() {
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
	
	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "BuscarFeatureType [featureId=" + featureId + ", nombre=" + nombre + ", idioma=" + idioma
				+ ", caracteristica=" + caracteristica + ", Tags=" + tags + "]";
	}
		
}
