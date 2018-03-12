package com.discovery.feature.portal.mvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.discovery.feature.portal.mvc.dao.EstadisticasDao;
import com.discovery.feature.portal.mvc.entity.EstadisticaReportTab;
import com.discovery.feature.portal.mvc.jpa.util.AbstractJpaDao;
import com.discovery.feature.portal.mvc.jpa.util.ParameterExpression;
import com.discovery.feature.portal.mvc.type.EstadisticaReportType;

@Repository
public class EstadisticasDaoImpl extends AbstractJpaDao<Long ,EstadisticaReportTab> implements EstadisticasDao{

	public EstadisticasDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public EstadisticaReportType buscarUltimaEstadisticaGeneral() {
		ParameterExpression para = new ParameterExpression();
		para.addParam("estadisticaReportId",new Long(1));
		EstadisticaReportTab estatistica = buscarEntityPorNameQueryConRetorno(EstadisticaReportTab.NameQuery.FIND_BY_ID, para);
		return new EstadisticaReportType().toType(estatistica);
	}

}
