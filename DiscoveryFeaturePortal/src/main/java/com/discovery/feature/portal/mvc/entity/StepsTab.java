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
@Table(name="Steps_Tab")
@NamedQueries({
		 @NamedQuery(name="StepsTab.BuscarTodos", query="SELECT s FROM StepsTab s") ,
		 @NamedQuery(name="StepsTab.BuscarPorId", query="SELECT s FROM StepsTab s WHERE s.stepId = :stepId")
})
public class StepsTab implements Serializable{
	
	private Long stepId;
    private String name;
    private String keyword;

	public StepsTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name="Steps_Gen", sequenceName="Steps_Seq")
	@Id @GeneratedValue(generator="Steps_Gen")
    @Column(name="STEP_ID", nullable= false)
	public Long getStepId() {
		return stepId;
	}

	public void setStepId(Long stepId) {
		this.stepId = stepId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	

}
