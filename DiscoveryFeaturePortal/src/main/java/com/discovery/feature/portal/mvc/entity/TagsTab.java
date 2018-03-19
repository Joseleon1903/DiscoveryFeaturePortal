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
@Table(name = "Tags_Tab")
@NamedQueries({ @NamedQuery(name = "TagsTab.BuscarTodos", query = "SELECT t FROM TagsTab t"),
		@NamedQuery(name = "TagsTab.BuscarPorId", query = "SELECT t FROM TagsTab t WHERE t.tagsTabId = :tagsTabId") })
public class TagsTab implements Serializable{

	private Long tagsTabId;
	private String name;

	public TagsTab() {
		super();
	}

	public TagsTab(Long tagsTabId, String name) {
		super();
		this.tagsTabId = tagsTabId;
		this.name = name;
	}

	@SequenceGenerator(name = "Tags_Gen", sequenceName = "Tags_Seq")
	@Id
	@GeneratedValue(generator = "Tags_Gen")
	@Column(name = "TAG_ID", nullable = false)
	public Long getTagsTabId() {
		return tagsTabId;
	}

	public void setTagsTabId(Long tagsTabId) {
		tagsTabId = tagsTabId;
	}

	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TagsTab [tagsTabId=" + tagsTabId + ", name=" + name + "]";
	}

}
