package com.discovery.feature.portal.mvc.dao;

import org.springframework.stereotype.Component;

import com.discovery.feature.portal.mvc.type.EstadisticaReportType;

@Component
public interface EstadisticasDao {
	
	EstadisticaReportType buscarUltimaEstadisticaGeneral();

}
