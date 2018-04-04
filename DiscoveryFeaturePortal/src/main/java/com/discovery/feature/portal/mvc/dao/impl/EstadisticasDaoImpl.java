package com.discovery.feature.portal.mvc.dao.impl;

import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.discovery.feature.portal.mvc.dao.EstadisticasDao;
import com.discovery.feature.portal.mvc.entity.EstadisticaReportTab;
import com.discovery.feature.portal.mvc.type.EstadisticaReportType;

@Repository("estadisticasDao")
public class EstadisticasDaoImpl implements EstadisticasDao {
	
	private static final Logger logger = Logger.getLogger(EstadisticasDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public EstadisticasDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
    @Transactional 
	public EstadisticaReportType buscarUltimaEstadisticaGeneral() {
		logger.info("Enmtrnado metodo buscarUltimaEstadisticaGeneral");
		// actualizando estadisticas
//		List<FeatureType> lista = featureDao.buscarTodosLosFeature();
//		int totalFeature = lista.size();
//		int totalPantallas = 0;
//		for (FeatureType featureType : lista) {
//			if (featureType.getType() == 1) {
//				totalPantallas++;
//			}
//		}		
//		int totalFlujos = totalFeature - totalPantallas;
//
//		EstadisticaReportTab estadistica = new EstadisticaReportTab();
//		estadistica.setContadorFeature(totalFeature);
//		estadistica.setContadorFlujo(totalFlujos);
//		estadistica.setContadorPantalla(totalPantallas);
//		Connection connexion = null;
//		PreparedStatement stmt = null;		
//		try {
//			connexion = datasource.getConnection();
//			stmt = connexion.prepareStatement(ConstantQuery.INSERT_ESTADISTICA);
//			stmt.setLong(1,(long) (Math.random() * (1 - 10000)));
//			stmt.setInt(2, estadistica.getContadorFeature());
//			stmt.setInt(3, estadistica.getContadorFlujo());
//			stmt.setInt(4, estadistica.getContadorPantalla());
//			stmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		sessionFactory.getCurrentSession().persist(estadistica);
		
		EstadisticaReportTab estadistica = new EstadisticaReportTab();
		estadistica.setContadorFeature(100);
		estadistica.setContadorFlujo(50);
		estadistica.setContadorPantalla(50);
		logger.info("ready for insertion");
		sessionFactory.getCurrentSession().save(estadistica);
		logger.info("insertion succesifully");
//		entityManager.persist(estadistica);
		return new EstadisticaReportType().toType(estadistica);
	}

}
