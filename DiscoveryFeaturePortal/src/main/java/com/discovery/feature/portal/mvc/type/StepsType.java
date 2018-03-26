package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;

public class StepsType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1876066786025365736L;
	
	private int line;
    private String name;
    private String keyword;
    
	public StepsType(int line, String name, String keyword) {
		super();
		this.line = line;
		this.name = name;
		this.keyword = keyword;
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

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "StepsType [line=" + line + ", name=" + name + ", keyword=" + keyword + "]";
	}
}
