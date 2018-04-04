package com.discovery.feature.portal.mvc.dao.impl;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.discovery.feature.portal.mvc.dao.EstadisticasDao;
import com.discovery.feature.portal.mvc.entity.EstadisticaReportTab;
import com.discovery.feature.portal.mvc.jpa.util.AbstractDao;
import com.discovery.feature.portal.mvc.type.EstadisticaReportType;

@Repository("estadisticasDao")
public class EstadisticasDaoImpl extends AbstractDao<Long, EstadisticaReportTab> implements EstadisticasDao {

	private static final Logger logger = Logger.getLogger(EstadisticasDaoImpl.class);

	public EstadisticasDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public EstadisticaReportType buscarUltimaEstadisticaGeneral() {
		logger.info("Enmtrnado metodo buscarUltimaEstadisticaGeneral");

		EstadisticaReportTab estadistica = new EstadisticaReportTab();
		estadistica.setContadorFeature(100);
		estadistica.setContadorFlujo(50);
		estadistica.setContadorPantalla(50);
		getSession().saveOrUpdate(estadistica);
		return new EstadisticaReportType().toType(estadistica);
	}

	@Override
	public EstadisticaReportType buscarEstadisticaPorId(long id) {
		EstadisticaReportTab estadistica = getByKey(id);
		return new EstadisticaReportType().toType(estadistica);
	}

}
