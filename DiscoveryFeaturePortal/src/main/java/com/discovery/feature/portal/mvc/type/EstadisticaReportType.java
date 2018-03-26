package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.discovery.feature.portal.mvc.commons.interfaces.BuscableType;
import com.discovery.feature.portal.mvc.entity.EstadisticaReportTab;

public class EstadisticaReportType implements Serializable, BuscableType<EstadisticaReportType, EstadisticaReportTab> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9088735216916210486L;
	
	private long estadisticaReportId;
	private int contadorPantalla;
	private int contadorFlujo;
	private int contadorFeature;

	public EstadisticaReportType() {
		// TODO Auto-generated constructor stub
	}

	public EstadisticaReportType(long estatisticaReportId, int contadorPantalla, int contadorFlujo,
			int contadorFeature) {
		super();
		this.estadisticaReportId = estatisticaReportId;
		this.contadorPantalla = contadorPantalla;
		this.contadorFlujo = contadorFlujo;
		this.contadorFeature = contadorFeature;
	}

	public long getEstadisticaReportId() {
		return estadisticaReportId;
	}

	public void setEstadisticaReportId(long estatisticaReportId) {
		this.estadisticaReportId = estatisticaReportId;
	}

	public int getContadorPantalla() {
		return contadorPantalla;
	}

	public void setContadorPantalla(int contadorPantalla) {
		this.contadorPantalla = contadorPantalla;
	}

	public int getContadorFlujo() {
		return contadorFlujo;
	}

	public void setContadorFlujo(int contadorFlujo) {
		this.contadorFlujo = contadorFlujo;
	}

	public int getContadorFeature() {
		return contadorFeature;
	}

	public void setContadorFeature(int contadorFeature) {
		this.contadorFeature = contadorFeature;
	}

	@Override
	public String toString() {
		return "EstatisticaReportType [estatisticaReportId=" + estadisticaReportId + ", contadorPantalla="
				+ contadorPantalla + ", contadorFlujo=" + contadorFlujo + ", contadorFeature=" + contadorFeature + "]";
	}

	@Override
	public EstadisticaReportType toType(EstadisticaReportTab entity) {
		this.estadisticaReportId = entity.getEstadisticaReportId();
		this.contadorFeature = entity.getContadorFeature();
		this.contadorPantalla = entity.getContadorPantalla();
		this.contadorFlujo = entity.getContadorFlujo();
		return this;
	}

	@Override
	public EstadisticaReportTab toEntity(EstadisticaReportType type) {
		EstadisticaReportTab entity =  new EstadisticaReportTab();
		entity.setEstadisticaReportId(type.getEstadisticaReportId());
		entity.setContadorPantalla(type.getContadorPantalla());
		entity.setContadorFeature(type.getContadorFeature());
		entity.setContadorFlujo(type.getContadorFlujo());
		return entity;
	}

	@Override
	public List<EstadisticaReportType> toListType(List<EstadisticaReportTab> entityList) {
		List<EstadisticaReportType> listType = new ArrayList<>();
		for (EstadisticaReportTab esta : entityList) {
			listType.add(new EstadisticaReportType().toType(esta));
		}
		return listType;
	}	

}
