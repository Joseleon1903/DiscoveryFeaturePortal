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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Feature_Tab")
@NamedQueries({ @NamedQuery(name = "FeatureTab.BuscarTodos", query = "SELECT f FROM FeatureTab f"),
		@NamedQuery(name = "FeatureTab.BuscarPorId", query = "SELECT f FROM FeatureTab f WHERE f.featureId = :featureId") })
public class FeatureTab implements Serializable{

	private Long featureId;
	private String name;
	private String description;
	private String id;
	private String keyword;
	private String uri;
	private TypeFeatureTab typeFeature;
	private List<TagsTab> tags;
	private List<CommentsTab> comments;
	private List<ElementsTab> elements;
	
	public FeatureTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name = "Feature_Gen", sequenceName = "Feature_Seq")
	@Id
	@GeneratedValue(generator = "Feature_Gen")
	@Column(name = "FEATURE_ID", nullable = false)
	public Long getFeatureId() {
		return featureId;
	}

	public void setFeatureId(Long featureId) {
		this.featureId = featureId;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "TAGS_FEATURE", joinColumns = { @JoinColumn(name = "FEATURE_ID") },
	inverseJoinColumns = {@JoinColumn(name = "TAG_ID") })
	public List<TagsTab> getTags() {
		return tags;
	}

	public void setTags(List<TagsTab> tags) {
		this.tags = tags;
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

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="TYPE_FEATURE_ID")
	public TypeFeatureTab getTypeFeature() {
		return typeFeature;
	}

	public void setTypeFeature(TypeFeatureTab typeFeature) {
		this.typeFeature = typeFeature;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "COMMENTS_FEATURE", joinColumns = {@JoinColumn(name = "FEATURE_ID") },
	inverseJoinColumns = {@JoinColumn(name = "COMMENT_ID") })
	public List<CommentsTab> getComments() {
		return comments;
	}

	public void setComments(List<CommentsTab> comments) {
		this.comments = comments;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ELEMENTS_FEATURE", joinColumns = {@JoinColumn(name = "FEATURE_ID") },
	inverseJoinColumns = {@JoinColumn(name = "ELEMENT_ID") })
	public List<ElementsTab> getElements() {
		return elements;
	}

	public void setElements(List<ElementsTab> elements) {
		this.elements = elements;
	}

	/**
	 * Query de la entidad
	 *
	 */
	public static interface NameQuery {
		String FIND_ALL = "FeatureTab.BuscarTodos";
		String FIND_BY_ID = "FeatureTab.BuscarPorId";
	}

}
