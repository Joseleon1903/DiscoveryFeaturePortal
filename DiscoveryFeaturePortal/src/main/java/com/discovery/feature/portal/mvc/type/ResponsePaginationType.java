package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponsePaginationType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 276561895229277888L;
	
	List<Object> typeList;
	PaginacionType pagination;
	
	public ResponsePaginationType() {}

	public List<Object> getTypeList() {
		if (typeList == null) {
			typeList = new ArrayList<>();
		}
		return typeList;
	}

	public void setTypeList(List<Object> typeList) {
		this.typeList = typeList;
	}

	public PaginacionType getPagination() {
		return pagination;
	}

	public void setPagination(PaginacionType pagination) {
		this.pagination = pagination;
	}

	@Override
	public String toString() {
		return "ResponsePaginationType [typeList=" + typeList + ", pagination=" + pagination + "]";
	}
	
}
