package com.discovery.feature.portal.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
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
import com.discovery.feature.query.ConstantQuery;

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
		List<BuscarFeatureType> listaSalida = FeatureMapping.toListBuscarFeatureType(lastPage);
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
		Connection connexion = null;
		PreparedStatement stmt = null;
		BuscarDetalleFeatureType detalle = new BuscarDetalleFeatureType();
		try {
			connexion = getDataSource().getConnection();
			stmt = connexion.prepareStatement(ConstantQuery.BUSCAR_DET_FEAT_PANTALLA_ANTECEDENTES);
			stmt.setLong(1, featureId);
			stmt.setString(2, "Antecedentes");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				detalle.getAntecedentes().add(rs.getString("KEYWORD") + " "+ rs.getString("DESCRIPCION"));
			}
			//buscando escenarios
			stmt = connexion.prepareStatement(ConstantQuery.BUSCAR_DET_FEAT_PANTALLA_ESCENARIOS);
			stmt.setLong(1, featureId);
			stmt.setString(2, "Escenario");
			rs = stmt.executeQuery();
			HashMap<String,List<String>> mapList= new HashMap<>();
			while (rs.next()) {
				if (!mapList.containsKey(rs.getString("NAME"))) {
					mapList.put(rs.getString("NAME"),new ArrayList<>());
				}
				List<String> array = mapList.get(rs.getString("NAME"));
				array.add(rs.getString("KEYWORD") + " "+ rs.getString("DESCRIPCION"));
				mapList.put(rs.getString("NAME"),array);
			}
			detalle.setEscenarios(FeatureMapping.castEscenario(mapList));
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return detalle;
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
		return FeatureMapping.toListBuscarFeatureType(lastPage);		
	}

}
