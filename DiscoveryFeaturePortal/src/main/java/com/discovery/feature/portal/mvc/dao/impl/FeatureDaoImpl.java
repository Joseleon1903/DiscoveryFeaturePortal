package com.discovery.feature.portal.mvc.dao.impl;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import org.springframework.stereotype.Repository;

import com.discovery.feature.portal.mvc.dao.FeatureDao;
import com.discovery.feature.portal.mvc.entity.FeatureTab;
import com.discovery.feature.portal.mvc.jpa.util.AbstractJpaDao;
import com.discovery.feature.portal.mvc.type.FeatureType;

@Repository
public class FeatureDaoImpl extends AbstractJpaDao<Long ,FeatureTab > implements FeatureDao {


	@Override
	public FeatureType[] buscarTodosLosFeature() {
		List<FeatureTab> listaEntity = null;
		try {
			listaEntity = buscarEntityListPorNameQueryConRetorno(FeatureTab.NameQuery.FIND_ALL, null);
		} catch (NoResultException | NonUniqueResultException e) {

		}
		FeatureType[] listType = new FeatureType[listaEntity.size()];
		for (int i = 0; i < listType.length; i++) {
			listType[i] = new FeatureType().toType(listaEntity.get(i));
		}
		return listType;
	}

}
