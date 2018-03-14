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
import com.discovery.feature.portal.mvc.type.PaginacionType;
import com.discovery.feature.portal.mvc.type.ResponsePaginationType;

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
	public ResponsePaginationType buscarFeaturePantalla(int pageSize, int pageNumber) {
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
		List<BuscarFeatureType> listaSalida = FeatureMapping.toListBuscarBuscarFeatureType(lastPage);
		ResponsePaginationType response = new ResponsePaginationType();
		response.getTypeList().addAll(listaSalida);
		PaginacionType pagination = new PaginacionType();
		pagination.setIndexPage(pageNumber);
		pagination.setRegistrosRestantes(countResults);
		response.setPagination(pagination);
		return response;
	}

	@Override
	public BuscarDetalleFeatureType buscarDetalleFeature(long featureId) {
		logger.info("Entrando en el metodo buscarDetalleFeature..");
		logger.info("featureId: "+featureId);
		FeatureTab entity =  buscarEntityPorId(FeatureTab.class, featureId);		
		return FeatureMapping.toBuscarDetalleFeatureType(entity);
	}

}
