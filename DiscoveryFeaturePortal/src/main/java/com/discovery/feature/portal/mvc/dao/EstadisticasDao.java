package com.discovery.feature.portal.mvc.dao;

import com.discovery.feature.portal.mvc.type.EstadisticaReportType;

public interface EstadisticasDao {
	
	EstadisticaReportType buscarEstadisticaPorId(long id);
	
	EstadisticaReportType buscarUltimaEstadisticaGeneral();

}
