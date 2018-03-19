package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.Arrays;

public class FeatureBuilder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -136715233244359848L;
	
	private String name;
	private String description;
	private String id;
	private String keyword;
	private String uri;
	private TagsType[] tags;
	private CommentsType[] comments;
	private ElementsType[] elements;

	public FeatureBuilder() {
	}

	public FeatureBuilder(String name, String description, String id, String keyword, String uri) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
		this.keyword = keyword;
		this.uri = uri;
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

	public TagsType[] getTags() {
		return tags;
	}

	public void setTags(TagsType[] tags) {
		this.tags = tags;
	}

	public CommentsType[] getComments() {
		return comments;
	}

	public void setComments(CommentsType[] comments) {
		this.comments = comments;
	}

	public ElementsType[] getElements() {
		return elements;
	}

	public void setElements(ElementsType[] elements) {
		this.elements = elements;
	}

	@Override
	public String toString() {
		return "FeatureBuilder [name=" + name + ", description=" + description + ", id=" + id + ", keyword=" + keyword
				+ ", uri=" + uri + ", tags=" + Arrays.toString(tags) + ", comments=" + Arrays.toString(comments)
				+ ", elements=" + Arrays.toString(elements) + "]";
	}

}
