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
@Table(name="Tags_Tab")
@NamedQueries({
		 @NamedQuery(name="TagsTab.BuscarTodos", query="SELECT t FROM TagsTab t") ,
		 @NamedQuery(name="TagsTab.BuscarPorId", query="SELECT t FROM TagsTab t WHERE t.tagId = :tagId")
})
public class TagsTab implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2652479020580756991L;
	
	private Long tagId;
	private String name;

	public TagsTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name="Tags_Gen", sequenceName="Tags_Seq")
	@Id @GeneratedValue(generator="Tags_Gen")
    @Column(name="TAG_ID", nullable= false)
	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
