package com.discovery.feature.portal.mvc.dao;

import org.springframework.stereotype.Component;

import com.discovery.feature.portal.mvc.type.FeatureType;

@Component
public interface FeatureDao {

	FeatureType[] buscarTodosLosFeature();

}
