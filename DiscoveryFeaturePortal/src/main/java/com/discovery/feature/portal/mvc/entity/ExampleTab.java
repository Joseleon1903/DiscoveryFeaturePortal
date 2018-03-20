package com.discovery.feature.portal.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Example_Tab")
@NamedQueries({
		 @NamedQuery(name="ExampleTab.BuscarTodos", query="SELECT e FROM ExampleTab e") ,
		 @NamedQuery(name="ExampleTab.BuscarPorId", query="SELECT e FROM ExampleTab e WHERE e.exampleId = :exampleId")
})
public class ExampleTab {

	
	private Long exampleId;
	private String name;
	private String description;
	private String id;
	
	public ExampleTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name="Example_Gen", sequenceName="Example_Seq")
	@Id @GeneratedValue(generator="Example_Gen")
    @Column(name="EXAMPLE_ID", nullable= false)
	public Long getExampleId() {
		return exampleId;
	}

	public void setExampleId(Long exampleId) {
		this.exampleId = exampleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
