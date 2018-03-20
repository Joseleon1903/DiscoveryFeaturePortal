package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.Arrays;

public class ExampleType implements Serializable {

	private int line;
	private String name;
	private String description;
	private String id;
	private RowType[] rows;

	public ExampleType() {
		super();
	}

	public ExampleType(int line, String name, String description, String id, RowType[] rows) {
		super();
		this.line = line;
		this.name = name;
		this.description = description;
		this.id = id;
		this.rows = rows;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RowType[] getRows() {
		return rows;
	}

	public void setRows(RowType[] rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "ExampleType [line=" + line + ", name=" + name + ", description=" + description + ", id=" + id
				+ ", rows=" + Arrays.toString(rows) + "]";
	}

}
