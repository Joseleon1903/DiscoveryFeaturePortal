package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.discovery.feature.portal.mvc.commons.interfaces.BuscableType;
import com.discovery.feature.portal.mvc.entity.EscenarioTab;

public class EscenarioType implements Serializable, BuscableType<EscenarioType, EscenarioTab>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2484219161669741058L;
	
	private long escenarioId;
	private String contenido;

	public EscenarioType() {
		// TODO Auto-generated constructor stub
	}
	
	public EscenarioType(long escenarioId, String contenido) {
		super();
		this.escenarioId = escenarioId;
		this.contenido = contenido;
	}

	public long getEscenarioId() {
		return escenarioId;
	}

	public void setEscenarioId(long escenarioId) {
		this.escenarioId = escenarioId;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "EscenarioType [escenarioId=" + escenarioId + ", contenido=" + contenido + "]";
	}

	@Override
	public EscenarioType toType(EscenarioTab entity) {
		this.escenarioId = entity.getEscenarioId();
		this.contenido = entity.getContenido();
		return this;
	}

	@Override
	public EscenarioTab toEntity(EscenarioType type) {
		EscenarioTab entity = new EscenarioTab();
		entity.setEscenarioId(type.getEscenarioId());
		entity.setContenido(type.getContenido());
		return entity;
	}

	@Override
	public List<EscenarioType> toListType(List<EscenarioTab> entityList) {
		List<EscenarioType> listType = new ArrayList<>();
		for (EscenarioTab escenarioTab : entityList) {
			listType.add(new EscenarioType().toType(escenarioTab));
		}
		return listType;
	}

}
