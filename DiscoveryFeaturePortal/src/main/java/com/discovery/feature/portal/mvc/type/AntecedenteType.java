package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.discovery.feature.portal.mvc.commons.interfaces.BuscableType;
import com.discovery.feature.portal.mvc.entity.AntecedenteTab;

public class AntecedenteType implements Serializable, BuscableType<AntecedenteType, AntecedenteTab>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9151400349759054648L;
	
	private long antecedenteId;
	private String contenido;

	public AntecedenteType() {
		// TODO Auto-generated constructor stub
	}
	
	public AntecedenteType(long antecedenteId, String contenido) {
		super();
		this.antecedenteId = antecedenteId;
		this.contenido = contenido;
	}

	public long getAntecedenteId() {
		return antecedenteId;
	}

	public void setAntecedenteId(long antecedenteId) {
		this.antecedenteId = antecedenteId;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "AntecedenteType [antecedenteId=" + antecedenteId + ", contenido=" + contenido + "]";
	}

	@Override
	public AntecedenteType toType(AntecedenteTab entity) {
		this.antecedenteId = entity.getAntecedenteId();
		this.contenido = entity.getContenido();
		return this;
	}

	@Override
	public AntecedenteTab toEntity(AntecedenteType type) {
		AntecedenteTab entity = new AntecedenteTab();
		entity.setAntecedenteId(type.getAntecedenteId());
		entity.setContenido(type.getContenido());
		return entity;
	}

	@Override
	public List<AntecedenteType> toListType(List<AntecedenteTab> entityList) {
		List<AntecedenteType> listType = new ArrayList<>();
		for (AntecedenteTab antecedente : entityList) {
			listType.add(new AntecedenteType().toType(antecedente));
		}
		return listType;
	}

}
