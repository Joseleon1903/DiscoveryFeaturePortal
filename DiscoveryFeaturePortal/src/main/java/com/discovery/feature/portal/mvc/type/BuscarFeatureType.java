package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.Date;

public class BuscarFeatureType implements Serializable{
	
	private long featureId;
	private String nombre;
	private String idioma;
	private String caracteristica;
	private Date fechaUltimaActualizacion;

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

	public Date getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}

	public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}

	@Override
	public String toString() {
		return "BuscarFeatureType [featureId=" + featureId + ", nombre=" + nombre + ", idioma=" + idioma
				+ ", caracteristica=" + caracteristica + ", fechaUltimaActualizacion=" + fechaUltimaActualizacion + "]";
	}

}
