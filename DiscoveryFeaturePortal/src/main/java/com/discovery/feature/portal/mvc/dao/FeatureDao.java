package com.discovery.feature.portal.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.discovery.feature.portal.mvc.type.BuscarDetalleFeatureType;
import com.discovery.feature.portal.mvc.type.BuscarFeatureType;
import com.discovery.feature.portal.mvc.type.FeatureType;
import com.discovery.feature.portal.mvc.type.ResponsePaginationType;

@Component
public interface FeatureDao {

	List<FeatureType> buscarTodosLosFeature();
	
	ResponsePaginationType buscarFeaturePantalla(int pageSize, int pageNumber, int featureType);
	
	ResponsePaginationType buscarFeatureFlujos(int pageSize, int pageNumber, int featureType);
	
	BuscarDetalleFeatureType buscarDetalleFeaturePantalla(long featureId);
	
	List<BuscarFeatureType> buscarFeatureParametrizado(int pageSize, int pageNumber,String parametro );

}
