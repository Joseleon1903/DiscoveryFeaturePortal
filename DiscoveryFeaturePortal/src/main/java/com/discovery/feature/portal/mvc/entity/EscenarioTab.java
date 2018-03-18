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
@Table(name="Escenario_Tab")
@NamedQueries({
		 @NamedQuery(name="EscenarioTab.BuscarTodos", query="SELECT e FROM EscenarioTab e") ,
		 @NamedQuery(name="EscenarioTab.BuscarPorId", query="SELECT e FROM EscenarioTab e WHERE e.escenarioId = :escenarioId")
})
public class EscenarioTab implements Serializable{
	
	private long escenarioId;
	private String contenido;

	public EscenarioTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name="Escenario_Gen", sequenceName="Escenario_Seq")
	@Id @GeneratedValue(generator="Escenario_Gen")
    @Column(name="ESCENARIO_ID", nullable= false)
	public long getEscenarioId() {
		return escenarioId;
	}

	public void setEscenarioId(long escenarioId) {
		this.escenarioId = escenarioId;
	}

	@Column(name="CONTENIDO", nullable= false)
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "EscenarioTab [escenarioId=" + escenarioId + ", contenido=" + contenido + "]";
	}	

}
