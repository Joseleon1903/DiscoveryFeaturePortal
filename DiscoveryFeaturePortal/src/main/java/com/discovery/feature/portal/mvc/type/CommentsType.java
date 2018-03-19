package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;

public class CommentsType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2550200392515344616L;
	
	private int line;
	private String value;
	
	public CommentsType() {}
	
	public CommentsType(int line, String value) {
		super();
		this.line = line;
		this.value = value;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "CommentsType [line=" + line + ", value=" + value + "]";
	}


}
