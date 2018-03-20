package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.Arrays;

public class RowType implements Serializable{
	
	private int line;
	private String id;
	private String cells[];

	public RowType() {
		// TODO Auto-generated constructor stub
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getCells() {
		return cells;
	}

	public void setCells(String[] cells) {
		this.cells = cells;
	}

	@Override
	public String toString() {
		return "RowType [line=" + line + ", id=" + id + ", cells=" + Arrays.toString(cells) + "]";
	}

}
