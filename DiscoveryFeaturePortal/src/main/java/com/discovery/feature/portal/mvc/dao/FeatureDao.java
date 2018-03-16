package com.discovery.feature.portal.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.discovery.feature.portal.mvc.type.BuscarDetalleFeatureType;
import com.discovery.feature.portal.mvc.type.BuscarFeatureType;
import com.discovery.feature.portal.mvc.type.FeatureType;

@Component
public interface FeatureDao {

	List<FeatureType> buscarTodosLosFeature();
	
	List<BuscarFeatureType> buscarFeaturePantalla(int pageSize, int pageNumber);
	
	BuscarDetalleFeatureType buscarDetalleFeature(long featureId);
	
	List<BuscarFeatureType> buscarFeatureParametrizado(int pageSize, int pageNumber,String parametro );

}
