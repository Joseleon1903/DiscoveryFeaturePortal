package com.discovery.feature.portal.mvc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Estatistica_Report_Tab")
@NamedQueries({
		 @NamedQuery(name="EstadisticaReportTab.BuscarTodos", query="SELECT e FROM EstadisticaReportTab e") ,
		 @NamedQuery(name="EstadisticaReportTab.BuscarPorId", query="SELECT e FROM EstadisticaReportTab e WHERE e.estadisticaReportId = :estadisticaReportId")
})
public class EstadisticaReportTab implements Serializable {
	
	private long estadisticaReportId;
	private int contadorPantalla;
	private int contadorFlujo;
	private int contadorFeature;

	public EstadisticaReportTab() {
		// TODO Auto-generated constructor stub
	}

	public EstadisticaReportTab(long estatisticaReportId, int contadorPantalla, int contadorFlujos,
			int contadorFeature) {
		super();
		this.estadisticaReportId = estatisticaReportId;
		this.contadorPantalla = contadorPantalla;
		this.contadorFlujo = contadorFlujos;
		this.contadorFeature = contadorFeature;
	}

	@SequenceGenerator(name="EstadisticaReport_Gen", sequenceName="EstadisticaReport_Seq")
	@Id @GeneratedValue(generator="EstadisticaReport_Gen")
    @Column(name="ESTADISTICA_REPORT_ID", nullable= false)
	public long getEstadisticaReportId() {
		return estadisticaReportId;
	}

	public void setEstadisticaReportId(long estatisticaReportId) {
		this.estadisticaReportId = estatisticaReportId;
	}

	@Column(name="CONTADOR_PANTALLA", nullable= true)
	public int getContadorPantalla() {
		return contadorPantalla;
	}

	public void setContadorPantalla(int contadorPantalla) {
		this.contadorPantalla = contadorPantalla;
	}
	
	@Column(name="CONTADOR_FLUJO", nullable= true)
	public int getContadorFlujo() {
		return contadorFlujo;
	}

	public void setContadorFlujo(int contadorFlujos) {
		this.contadorFlujo = contadorFlujos;
	}
	
	@Column(name="CONTADOR_FEATURE", nullable= true)
	public int getContadorFeature() {
		return contadorFeature;
	}

	public void setContadorFeature(int contadorFeature) {
		this.contadorFeature = contadorFeature;
	}

	@Override
	public String toString() {
		return "EstatisticaReportTab [estatisticaReportId=" + estadisticaReportId + ", contadorPantalla="
				+ contadorPantalla + ", contadorFlujos=" + contadorFlujo + ", contadorFeature=" + contadorFeature
				+ "]";
	}
	
	/**
	 * Query de la entidad
	 *
	 */
	public static interface NameQuery{
		String FIND_ALL = "EstadisticaReportTab.BuscarTodos";
		String FIND_BY_ID = "EstadisticaReportTab.BuscarPorId";
	}


}
