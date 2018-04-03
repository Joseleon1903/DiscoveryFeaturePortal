package com.discovery.feature.portal.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.discovery.feature.portal.mvc.dao.EstadisticasDao;
import com.discovery.feature.portal.mvc.entity.EstadisticaReportTab;
import com.discovery.feature.portal.mvc.jpa.util.AbstractJpaDao;
import com.discovery.feature.portal.mvc.type.EstadisticaReportType;
import com.discovery.feature.portal.mvc.type.FeatureType;
import com.discovery.feature.query.ConstantQuery;

@Repository
@Transactional
public class EstadisticasDaoImpl extends AbstractJpaDao<Long, EstadisticaReportTab> implements EstadisticasDao {
		
	@Autowired
	@Qualifier("featureDaoImpl")
	private FeatureDaoImpl featureDao;

	public EstadisticasDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
    @Transactional 
	public EstadisticaReportType buscarUltimaEstadisticaGeneral() {
		// actualizando estadisticas
		List<FeatureType> lista = featureDao.buscarTodosLosFeature();
		int totalFeature = lista.size();
		int totalPantallas = 0;
		for (FeatureType featureType : lista) {
			if (featureType.getType() == 1) {
				totalPantallas++;
			}
		}		
		int totalFlujos = totalFeature - totalPantallas;

		EstadisticaReportTab estadistica = new EstadisticaReportTab();
		estadistica.setContadorFeature(totalFeature);
		estadistica.setContadorFlujo(totalFlujos);
		estadistica.setContadorPantalla(totalPantallas);
		Connection connexion = null;
		PreparedStatement stmt = null;		
		try {
			connexion = getDataSource().getConnection();
			stmt = connexion.prepareStatement(ConstantQuery.INSERT_ESTADISTICA);
			stmt.setLong(1,(long) (Math.random() * (1 - 10000)));
			stmt.setInt(2, estadistica.getContadorFeature());
			stmt.setInt(3, estadistica.getContadorFlujo());
			stmt.setInt(4, estadistica.getContadorPantalla());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// estadistica = registrarEntity(estadistica);
		return new EstadisticaReportType().toType(estadistica);
	}

}
