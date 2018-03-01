package com.discovery.feature.portal.mvc.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.discovery.feature.portal.mvc.dao.UsuarioDao;
import com.discovery.feature.portal.mvc.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Usuario findByUsers(long id) {
		return entityManager.find(Usuario.class, id);
	}
 
}
