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
@Table(name="Antecedente_Tab")
@NamedQueries({
		 @NamedQuery(name="AntecedentesTab.BuscarTodos", query="SELECT a FROM AntecedenteTab a") ,
		 @NamedQuery(name="AntecedentesTab.BuscarPorId", query="SELECT a FROM AntecedenteTab a WHERE a.antecedenteId = :antecedenteId")
})
public class AntecedenteTab implements Serializable {
	
	private long antecedenteId;
	private String contenido;

	public AntecedenteTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name="Antecedente_Gen", sequenceName="Antecedente_Seq")
	@Id @GeneratedValue(generator="Antecedente_Gen")
    @Column(name="FEATURE_ID", nullable= false)
	public long getAntecedenteId() {
		return antecedenteId;
	}

	public void setAntecedenteId(long antecedenteId) {
		this.antecedenteId = antecedenteId;
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
		return "AntecedentesTab [antecedenteId=" + antecedenteId + ", contenido=" + contenido + "]";
	}

}
