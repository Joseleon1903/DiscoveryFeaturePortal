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
@Table(name="Type_Feature_Tab")
@NamedQueries({
		 @NamedQuery(name="TypeFeatureTab.BuscarTodos", query="SELECT t FROM TypeFeatureTab t") ,
		 @NamedQuery(name="TypeFeatureTab.BuscarPorId", query="SELECT t FROM TypeFeatureTab t WHERE t.typeFeatureId = :typeFeatureId")
})
public class TypeFeatureTab implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -523678503399417608L;
	
	private long typeFeatureId;
	private String type;
	
	public TypeFeatureTab() {
		super();
	}
	
	public TypeFeatureTab(long typeFeatureId, String type) {
		super();
		this.typeFeatureId = typeFeatureId;
		this.type = type;
	}

	@SequenceGenerator(name="Type_Feature_Gen", sequenceName="Type_Feature_Seq")
	@Id @GeneratedValue(generator="Type_Feature_Gen")
    @Column(name="TYPE_FEATURE_ID", nullable= false)
	public long getTypeFeatureId() {
		return typeFeatureId;
	}

	public void setTypeFeatureId(long typeFeatureId) {
		this.typeFeatureId = typeFeatureId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TypeFeatureTab [TypeFeatureId=" + typeFeatureId + ", type=" + type + "]";
	}

}
