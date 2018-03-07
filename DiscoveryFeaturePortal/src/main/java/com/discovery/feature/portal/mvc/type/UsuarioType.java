package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.List;

import com.discovery.feature.portal.mvc.commons.interfaces.BuscableType;
import com.discovery.feature.portal.mvc.entity.Usuario;

public class UsuarioType implements Serializable, BuscableType<UsuarioType, Usuario> {
	
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

	@Override
	public UsuarioType toType(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario toEntity(UsuarioType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioType> toListType(List<Usuario> entityList) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
