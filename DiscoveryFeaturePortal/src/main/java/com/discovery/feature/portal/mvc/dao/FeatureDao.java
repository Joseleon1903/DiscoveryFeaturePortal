package com.discovery.feature.portal.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.discovery.feature.portal.mvc.type.BuscarDetalleFeatureType;
import com.discovery.feature.portal.mvc.type.FeatureType;
import com.discovery.feature.portal.mvc.type.ResponsePaginationType;

@Component
public interface FeatureDao {

	List<FeatureType> buscarTodosLosFeature();
	
	ResponsePaginationType buscarFeaturePantalla(int pageSize, int pageNumber);
	
	BuscarDetalleFeatureType buscarDetalleFeature(long featureId);

}
