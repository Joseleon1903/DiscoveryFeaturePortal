package com.discovery.feature.portal.mvc.dao;

import java.util.List;

import com.discovery.feature.portal.mvc.type.FeatureType;

public interface FeatureDao {

	List<FeatureType> buscarTodosLosFeature();
	
//	ResponsePaginationType buscarFeaturePantalla(int pageSize, int pageNumber, int featureType);
//	
//	ResponsePaginationType buscarFeatureFlujos(int pageSize, int pageNumber, int featureType);
//	
//	BuscarDetalleFeatureType buscarDetalleFeaturePantalla(long featureId);
//	
//	BuscarDetalleFlujoFeature buscarDetalleFeatureFlujo(long featureId);
//	
//	List<BuscarFeatureType> buscarFeatureParametrizado(int pageSize, int pageNumber,String parametro );

}
