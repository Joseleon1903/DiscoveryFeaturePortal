package com.discovery.feature.portal.mvc.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.discovery.feature.portal.mvc.constante.ParametrosCatalogoConstante;
import com.discovery.feature.portal.mvc.dao.FeatureDao;
import com.discovery.feature.portal.mvc.entity.ElementsTab;
import com.discovery.feature.portal.mvc.entity.FeatureTab;
import com.discovery.feature.portal.mvc.entity.StepsTab;
import com.discovery.feature.portal.mvc.jpa.util.AbstractDao;
import com.discovery.feature.portal.mvc.type.BuscarDetalleFeatureType;
import com.discovery.feature.portal.mvc.type.FeatureType;
import com.discovery.feature.portal.mvc.type.PaginacionType;
import com.discovery.feature.portal.mvc.type.ResponsePaginationType;

@Repository("FeatureDao")
public class FeatureDaoImpl extends AbstractDao<Long, FeatureTab> implements FeatureDao {

	private static final Logger logger = Logger.getLogger(FeatureDaoImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<FeatureType> buscarTodosLosFeature() {
		List<FeatureTab> listaEntity = null;
		Criteria crit = getSession().createCriteria(FeatureTab.class).addOrder(Order.asc("featureId"));
		listaEntity = crit.list();
		return new FeatureType().toListType(listaEntity);
	}

	@Override
	@Transactional
	public ResponsePaginationType buscarFeaturePantalla(int pageSize, int pageNumber, int featureType) {
		List<FeatureTab> listaEntity = null;
		Criteria crit = getSession().createCriteria(FeatureTab.class);
		crit.add(Restrictions.eq("typeFeature.typeFeatureId",new Long(featureType)));
		listaEntity = crit.list();
		ResponsePaginationType response = new ResponsePaginationType();
		response.getTypeList().addAll(listaEntity);
		PaginacionType pagination = new PaginacionType();
		pagination.setIndexPage(pageNumber);
		pagination.setRegistrosRestantes(new Long(10));
		response.setPagination(pagination);
		return response;
	}

	@Override
	@Transactional
	public BuscarDetalleFeatureType buscarDetalleFeaturePantalla(long featureId) {
		
		BuscarDetalleFeatureType detalle = new BuscarDetalleFeatureType();
		
		Criteria critAnte = getSession().createCriteria(FeatureTab.class, "featureTab");
		critAnte.add(Restrictions.eq("featureId",featureId));
		critAnte.createAlias("featureTab.elements", "elements");
		critAnte.createAlias("elements.steps", "stepes");
		critAnte.setFetchMode("elements", FetchMode.EAGER);
		critAnte.setFetchMode("stepes", FetchMode.EAGER);
		critAnte.setFirstResult(0);
		critAnte.setMaxResults(1);
		critAnte.add(Restrictions.eq("elements.keyword",ParametrosCatalogoConstante.KeyWords.CONST_ANTECEDENTE));
		List<FeatureTab> listaEntityAntecedente = critAnte.list();
		
//		Criteria critEsce = getSession().createCriteria(FeatureTab.class, "featureTab");
//
//		critEsce.add(Restrictions.eq("featureId",featureId));
//		critEsce.createAlias("featureTab.elements", "elements");
//		critEsce.add(Restrictions.eq("elements.keyword", ParametrosCatalogoConstante.KeyWords.CONST_ESCENARIO));
//		List<FeatureTab> listaEntityEscenario = critEsce.list();
		
		for (FeatureTab featureTab : listaEntityAntecedente) {
			for (ElementsTab elment : featureTab.getElements()) {
				for (StepsTab step : elment.getSteps()) {
					detalle.getAntecedentes().add(step.getName());
				}
			}
		}
		
//		for (FeatureTab featureTab : listaEntityEscenario) {
//			for (ElementsTab elment : featureTab.getElements()) {
//				detalle.getEscenarios().add(new EscenarioType());
//			}
//		}
		return detalle;
	}
//
//	@Override
//	public List<BuscarFeatureType> buscarFeatureParametrizado(int pageSize, int pageNumber, String nombre) {
//		logger.info("Entrando en el metodo buscarFeaturePantalla..");
//		String countQ = "select count (f.featureId) from FeatureTab f where f.nombre like :nombre or f.caracteristica like :caracteristica";
//		Query countQuery = entityManager.createQuery(countQ);
//		countQuery.setParameter("nombre", nombre);
//		countQuery.setParameter("caracteristica", nombre);
//		Long countResults = (Long) countQuery.getSingleResult();
//		logger.info("countResults: " + countResults);
//		int totalPageNumber = (int) (Math.ceil(countResults / pageSize));
//		logger.info("paginas totales: " + totalPageNumber);
//		Query selectQuery = entityManager.createQuery("select f from FeatureTab f where f.nombre like :nombre or f.caracteristica like :caracteristica");
//		selectQuery.setParameter("nombre", nombre);
//		selectQuery.setParameter("caracteristica", nombre);
//		selectQuery.setFirstResult((pageNumber * pageSize) - pageSize);
//		selectQuery.setMaxResults(pageSize);
//		@SuppressWarnings("unchecked")
//		List<FeatureTab> lastPage = selectQuery.getResultList();
//		logger.info("result: "+lastPage);
//		return FeatureMapping.toListBuscarFeatureType(lastPage);		
//	}
//
//	@Override
//	public ResponsePaginationType buscarFeatureFlujos(int pageSize, int pageNumber, int featureType) {
//		logger.info("Entrando en el metodo buscarFeatureFlujos..");
//		String countQ = "Select count (f.featureId) from FeatureTab f WHERE typeFeature.typeFeatureId = "+ featureType;
//		Query countQuery = entityManager.createQuery(countQ);
//		Long countResults = (Long) countQuery.getSingleResult();
//		int totalPageNumber = (int) (Math.ceil(countResults / pageSize));
//		Query selectQuery = entityManager.createQuery("From FeatureTab WHERE typeFeature.typeFeatureId = "+ featureType);
//		selectQuery.setFirstResult((pageNumber * pageSize) - pageSize);
//		selectQuery.setMaxResults(pageSize);
//		@SuppressWarnings("unchecked")
//		List<FeatureTab> lastPage = selectQuery.getResultList();
//		List<BuscarFeatureType> listaSalida = FeatureMapping.toListBuscarFeatureType(lastPage);
//		ResponsePaginationType response = new ResponsePaginationType();
//		response.getTypeList().addAll(listaSalida);
//		PaginacionType pagination = new PaginacionType();
//		pagination.setIndexPage(pageNumber);
//		pagination.setRegistrosRestantes(countResults);
//		response.setPagination(pagination);
//		return response;
//	}
//
//	@Override
//	public BuscarDetalleFlujoFeature buscarDetalleFeatureFlujo(long featureId) {
//		Connection connexion = null;
//		PreparedStatement stmt = null;
//		BuscarDetalleFlujoFeature detalle = new BuscarDetalleFlujoFeature();
//		try {
//			connexion = getDataSource().getConnection();
//			stmt = connexion.prepareStatement(ConstantQuery.BUSCAR_DET_FEAT_FLUJO);
//			stmt.setLong(1, featureId);
//			ResultSet rs = stmt.executeQuery();
//			while (rs.next()) {
//				detalle.getSteps().add(rs.getString("KEYWORD") + " "+ rs.getString("NAME"));
//			}
//			stmt = connexion.prepareStatement(ConstantQuery.BUSCAR_DET_OBJETOS_FLUJO);
//			stmt.setLong(1, featureId);
//			rs = stmt.executeQuery();
//			List<String> content =  new ArrayList<>();
//			while (rs.next()) {
//				content.add(rs.getString("CONTENT"));
//			}
//			int sliteParam = content.size() / 2;
//			for (int i = 0; i < content.size(); i++) {
//				if (i < sliteParam) {
//					detalle.getParamKey().add(content.get(i));
//				}
//				if (i >= sliteParam) {
//					detalle.getParamValue().add(content.get(i));
//				}
//			}		
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return detalle;
//	}

}
