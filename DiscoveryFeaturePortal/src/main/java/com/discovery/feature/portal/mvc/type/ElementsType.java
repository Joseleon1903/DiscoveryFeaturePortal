package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.Arrays;

public class ElementsType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2706935182167447031L;
	
	private int line;
    private String name;
    private String description;
    private String type;
    private String keyword;
    private StepsType[] steps;
    
	public ElementsType(int line, String name, String description, String type, String keyword, StepsType[] steps) {
		super();
		this.line = line;
		this.name = name;
		this.description = description;
		this.type = type;
		this.keyword = keyword;
		this.steps = steps;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
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

	public StepsType[] getSteps() {
		return steps;
	}

	public void setSteps(StepsType[] steps) {
		this.steps = steps;
	}

	@Override
	public String toString() {
		return "ElementsType [line=" + line + ", name=" + name + ", description=" + description + ", type=" + type
				+ ", keyword=" + keyword + ", steps=" + Arrays.toString(steps) + "]";
	}
    
}
