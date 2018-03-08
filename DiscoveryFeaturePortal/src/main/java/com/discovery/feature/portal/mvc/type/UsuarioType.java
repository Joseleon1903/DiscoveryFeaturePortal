package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;

public class UsuarioType implements Serializable {

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
