package com.discovery.feature.portal.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.discovery.feature.portal.mvc.type.BuscarFeatureType;
import com.discovery.feature.portal.mvc.type.FeatureType;

@Component
public interface FeatureDao {

	List<FeatureType> buscarTodosLosFeature();
	
	List<BuscarFeatureType> buscarFeaturePantalla(int pageSize, int pageNumber);

}
