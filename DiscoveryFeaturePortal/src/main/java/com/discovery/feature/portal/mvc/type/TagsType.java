package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;

public class TagsType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5944926821927652144L;
	
	private int line;
	private String name;

	public TagsType(int line, String name) {
		super();
		this.line = line;
		this.name = name;
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

	@Override
	public String toString() {
		return "TagsType [line=" + line + ", name=" + name + "]";
	}
}
