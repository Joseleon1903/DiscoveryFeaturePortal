package com.discovery.feature.portal.mvc.type;

import java.io.Serializable;
import java.util.List;
import com.discovery.feature.portal.mvc.commons.interfaces.BuscableType;
import com.discovery.feature.portal.mvc.entity.FeatureTab;

public class FeatureType implements Serializable, BuscableType<FeatureType, FeatureTab> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8627271860838190961L;
	
	private long featureId;
	private String nombre;
	private String idioma;
	private String caracteristica;
	
	@Override
	public FeatureType toType(FeatureTab entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FeatureTab toEntity(FeatureType type) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<FeatureType> toListType(List<FeatureTab> entityList) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
