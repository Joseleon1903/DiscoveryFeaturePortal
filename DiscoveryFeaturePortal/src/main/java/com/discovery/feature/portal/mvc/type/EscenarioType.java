package com.discovery.feature.portal.mvc.type;

import java.util.List;

import com.discovery.feature.portal.mvc.commons.interfaces.BuscableType;
import com.discovery.feature.portal.mvc.entity.EscenarioTab;

public class EscenarioType implements BuscableType<EscenarioType, EscenarioTab>{
	
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EscenarioTab toEntity(EscenarioType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EscenarioType> toListType(List<EscenarioTab> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

}
