package com.discovery.feature.portal.mvc.dao.impl;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;

import com.discovery.feature.portal.mapping.FeatureMapping;
import com.discovery.feature.portal.mvc.dao.FeatureDao;
import com.discovery.feature.portal.mvc.entity.FeatureTab;
import com.discovery.feature.portal.mvc.jpa.util.AbstractJpaDao;
import com.discovery.feature.portal.mvc.type.BuscarDetalleFeatureType;
import com.discovery.feature.portal.mvc.type.BuscarFeatureType;
import com.discovery.feature.portal.mvc.type.FeatureType;

@Repository
public class FeatureDaoImpl extends AbstractJpaDao<Long, FeatureTab> implements FeatureDao {

	private static final Logger logger = Logger.getLogger(FeatureDaoImpl.class);

	@Override
	public List<FeatureType> buscarTodosLosFeature() {
		List<FeatureTab> listaEntity = null;
		try {
			listaEntity = buscarEntityListPorNameQueryConRetorno(FeatureTab.NameQuery.FIND_ALL, null);
		} catch (NoResultException | NonUniqueResultException e) {

		}
		return new FeatureType().toListType(listaEntity);
	}

	@Override
	public List<BuscarFeatureType> buscarFeaturePantalla(int pageSize, int pageNumber) {
		logger.info("Entrando en el metodo buscarFeaturePantalla..");
		String countQ = "Select count (f.featureId) from FeatureTab f";
		Query countQuery = entityManager.createQuery(countQ);
		Long countResults = (Long) countQuery.getSingleResult();
		logger.info("countResults: " + countResults);
		int totalPageNumber = (int) (Math.ceil(countResults / pageSize));
		logger.info("paginas totales: " + totalPageNumber);
		Query selectQuery = entityManager.createQuery("From FeatureTab");
		selectQuery.setFirstResult((pageNumber * pageSize) - pageSize);
		selectQuery.setMaxResults(pageSize);
		@SuppressWarnings("unchecked")
		List<FeatureTab> lastPage = selectQuery.getResultList();
		return FeatureMapping.toListBuscarBuscarFeatureType(lastPage);
	}

	@Override
	public BuscarDetalleFeatureType buscarDetalleFeature(long featureId) {
		logger.info("Entrando en el metodo buscarDetalleFeature..");
		logger.info("featureId: "+featureId);
		FeatureTab entity =  buscarEntityPorId(FeatureTab.class, featureId);		
		return FeatureMapping.toBuscarDetalleFeatureType(entity);
	}

	@Override
	public List<BuscarFeatureType> buscarFeatureParametrizado(int pageSize, int pageNumber, String nombre) {
		logger.info("Entrando en el metodo buscarFeaturePantalla..");
		String countQ = "select count (f.featureId) from FeatureTab f where f.nombre like :nombre or f.caracteristica like :caracteristica";
		Query countQuery = entityManager.createQuery(countQ);
		countQuery.setParameter("nombre", nombre);
		countQuery.setParameter("caracteristica", nombre);
		Long countResults = (Long) countQuery.getSingleResult();
		logger.info("countResults: " + countResults);
		int totalPageNumber = (int) (Math.ceil(countResults / pageSize));
		logger.info("paginas totales: " + totalPageNumber);
		Query selectQuery = entityManager.createQuery("select f from FeatureTab f where f.nombre like :nombre or f.caracteristica like :caracteristica");
		selectQuery.setParameter("nombre", nombre);
		selectQuery.setParameter("caracteristica", nombre);
		selectQuery.setFirstResult((pageNumber * pageSize) - pageSize);
		selectQuery.setMaxResults(pageSize);
		@SuppressWarnings("unchecked")
		List<FeatureTab> lastPage = selectQuery.getResultList();
		logger.info("result: "+lastPage);
		return FeatureMapping.toListBuscarBuscarFeatureType(lastPage);		
	}

}
