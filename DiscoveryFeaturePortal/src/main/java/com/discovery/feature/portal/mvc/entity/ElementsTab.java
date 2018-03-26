package com.discovery.feature.portal.mvc.entity;

import java.io.Serializable;
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
@Table(name="Elements_Tab")
@NamedQueries({
		 @NamedQuery(name="ElementsTab.BuscarTodos", query="SELECT e FROM ElementsTab e") ,
		 @NamedQuery(name="ElementsTab.BuscarPorId", query="SELECT e FROM ElementsTab e WHERE e.elementId = :elementId")
})
public class ElementsTab implements Serializable {
	
	
	private Long elementId;
    private String name;
    private String description;
    private String type;
    private String keyword;
    private List<StepsTab> steps;
    private List<ExampleTab> examples;

	public ElementsTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name="Elements_Gen", sequenceName="Elements_Seq")
	@Id @GeneratedValue(generator="Elements_Gen")
    @Column(name="ELEMENT_ID", nullable= false)
	public Long getElementId() {
		return elementId;
	}

	public void setElementId(Long elementId) {
		this.elementId = elementId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STEPS_ELEMENT", joinColumns = {@JoinColumn(name = "ELEMENT_ID") },
	inverseJoinColumns = {@JoinColumn(name = "STEP_ID") })
	public List<StepsTab> getSteps() {
		return steps;
	}

	public void setSteps(List<StepsTab> steps) {
		this.steps = steps;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EXAMPLE_ELEMENT", joinColumns = {@JoinColumn(name = "ELEMENT_ID") },
	inverseJoinColumns = {@JoinColumn(name = "EXAMPLE_ID") })
	public List<ExampleTab> getExamples() {
		return examples;
	}

	public void setExamples(List<ExampleTab> examples) {
		this.examples = examples;
	}
	
	
	
	

}
