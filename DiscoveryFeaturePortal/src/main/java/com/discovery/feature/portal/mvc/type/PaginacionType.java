package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;

public class PaginacionType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3895019041005238018L;
	
	private Integer registrosRestantes;
	private Integer indexPage;

	public PaginacionType() {}
	
	public PaginacionType(Integer registrosRestantes, Integer indexPage) {
		super();
		this.registrosRestantes = registrosRestantes;
		this.indexPage = indexPage;
	}
	
	public Integer getRegistrosRestantes() {
		return registrosRestantes;
	}

	public void setRegistrosRestantes(Integer registrosRestantes) {
		this.registrosRestantes = registrosRestantes;
	}

	public Integer getIndexPage() {
		return indexPage;
	}

	public void setIndexPage(Integer indexPage) {
		this.indexPage = indexPage;
	}

	@Override
	public String toString() {
		return "PaginacionType [registrosRestantes=" + registrosRestantes + ", indexPage=" + indexPage + "]";
	}

}
