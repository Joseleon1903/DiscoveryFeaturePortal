package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;

public class UsuarioType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5207434094091687227L;
	private String name;

	public UsuarioType() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioType(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
