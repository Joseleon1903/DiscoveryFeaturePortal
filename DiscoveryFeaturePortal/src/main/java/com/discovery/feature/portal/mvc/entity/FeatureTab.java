package com.discovery.feature.portal.mvc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Feature_Tab")
@NamedQueries({
		 @NamedQuery(name="FeatureTab.BuscarTodos", query="SELECT f FROM FeatureTab f") ,
		 @NamedQuery(name="FeatureTab.BuscarPorId", query="SELECT f FROM FeatureTab f WHERE f.featureId = :featureId")
})
public class FeatureTab {
	
	private long featureId;
	private String nombre;
	private String idioma;
	private String caracteristica;
	
	private List<AntecedenteTab> antecedentes;
	private List<EscenarioTab> escenarios;

	public FeatureTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name="Feature_Gen", sequenceName="Feature_Seq")
	@Id @GeneratedValue(generator="Feature_Gen")
    @Column(name="FEATURE_ID", nullable= false)
	public long getFeatureId() {
		return featureId;
	}

	public void setFeatureId(long featureId) {
		this.featureId = featureId;
	}

	@Column(name="NOMBRE_FILE", nullable= false)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="IDIOMA", nullable= false)
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Column(name="CARACTERISTICA", nullable= false , length=3000)
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "FEATURE_ANTECEDENTES",
	joinColumns = { @JoinColumn(name = "FEATURE_ID") },
	inverseJoinColumns = { @JoinColumn(name = "ANTECEDENTE_ID") })
	public List<AntecedenteTab> getAntecedentes() {
		return antecedentes;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "FEATURE_ESCENARIOS",
	joinColumns = { @JoinColumn(name = "FEATURE_ID") },
	inverseJoinColumns = { @JoinColumn(name = "ESCENARIO_ID") })
	public List<EscenarioTab> getEscenarios() {
		return escenarios;
	}

	public void setEscenarios(List<EscenarioTab> escenarios) {
		this.escenarios = escenarios;
	}

	public void setAntecedentes(List<AntecedenteTab> antecedentes) {
		this.antecedentes = antecedentes;
	}

	@Override
	public String toString() {
		return "FeatureTab [featureId=" + featureId + ", nombre=" + nombre + ", idioma=" + idioma + ", caracteristicas="
				+ caracteristica + "]";
	}
	
	

}
