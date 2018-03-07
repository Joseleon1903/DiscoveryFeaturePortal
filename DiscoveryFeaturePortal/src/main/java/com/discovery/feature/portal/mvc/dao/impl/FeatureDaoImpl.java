package com.discovery.feature.portal.mvc.dao.impl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.discovery.feature.portal.mvc.dao.FeatureDao;
import com.discovery.feature.portal.mvc.entity.FeatureTab;
import com.discovery.feature.portal.mvc.type.FeatureType;

@Repository
public class FeatureDaoImpl implements FeatureDao {

	@PersistenceContext
	private EntityManager entityManager;

	public FeatureDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public FeatureType[] buscarTodosLosFeature() {
		List<FeatureTab> listaEntity = null;
		try {
			Query query = entityManager.createQuery("SELECT f FROM FeatureTab f");
			listaEntity = query.getResultList();
		} catch (NoResultException | NonUniqueResultException e) {

		}
		FeatureType[] listType = new FeatureType[listaEntity.size()];
		for (int i = 0; i < listType.length; i++) {
			listType[i] = new FeatureType().toType(listaEntity.get(i));
		}
		return listType;
	}

}
