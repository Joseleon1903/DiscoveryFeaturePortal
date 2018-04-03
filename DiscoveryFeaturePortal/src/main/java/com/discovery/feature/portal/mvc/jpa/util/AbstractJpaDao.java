package com.discovery.feature.portal.mvc.jpa.util;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractJpaDao<ID, E> {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DataSource dataSource;
	
	protected Class<E> entityClass;
	protected E entity;
	
	private static final Logger logger = Logger.getLogger(AbstractJpaDao.class.getName());

		
	/**
	 * Descripcion: Metodo que permite elimninar una entidad por su Id.
	 * 
	 * @param id
	 * @return 
	 */
    public E removeById(Class<E> clazz, ID id) throws PersistenceException {
    		
		try {
			entityManager.getTransaction().begin();
			E delete = entityManager.find(clazz, id);
			entityManager.remove(delete);
			entityManager.getTransaction().commit();
			return delete;
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
    }
    
    /**
	 * Descripcion: Metodo que permite actualizar una entidad.
	 * 
	 * @param entity
	 * @return boolean
	 */
    public boolean actualizarEntity(Class<E> clazz, ID id , E entity) throws PersistenceException {
    		
		try {
			entityManager.getTransaction().begin();
			entityManager.find(clazz, id);
			entityManager.flush();
			entityManager.merge(entity);
			return true;
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
    }

    /**
     * 	Descripcion: Metodo que permite buscar una entidad por su Id.
     * 
     * @param ID
     * @return Entity
     * @throws PersistenceException
     */
	public E buscarEntityPorId(Class<E> clazz, ID id) throws PersistenceException {
		try {
			E entity =  null;
			entity = (E) entityManager.find(clazz, id);
			return entity;
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
    }
    
    /**
     * Descripcion: metodo para buscar una lista de Entity por un nameQuery.
     * 
     * @param query
     * @param parametros
     * @return List<E>
     */
    @SuppressWarnings("unchecked")
	public List<E> buscarEntityListPorNameQueryConRetorno (String parametrerQuery, ParameterExpression parametros){
		//iterando la lista de parametros
    	Query query = entityManager.createNamedQuery(parametrerQuery);
    	if (parametros != null) {
    		for (Map.Entry<String, Object> entry : parametros.getParametros().entrySet()) {
    			query.setParameter(entry.getKey(), entry.getValue());
    		}	
		}
		return query.getResultList();
	}
    
    /**
     * Descripcion: metodo para buscar un  Entity por un nameQuery.
     * 
     * @param query
     * @param parametros
     * @return
     */
    @SuppressWarnings("unchecked")
	public E buscarEntityPorNameQueryConRetorno(String parametrerQuery, ParameterExpression parametros) throws NoResultException,  NonUniqueResultException{
		//iterando la lista de parametros
    	Query query = entityManager.createNamedQuery(parametrerQuery);
    	if (parametros != null) {
    		for (Map.Entry<String, Object> entry : parametros.getParametros().entrySet()) {
    			query.setParameter(entry.getKey(), entry.getValue());
    		}	
		}
		return (E) query.getSingleResult();
	}
    
    /**
     * Descripcion: Metodo para registrar una entidad
     * 
     * @param entity
     */
    @Transactional 
	public E registrarEntity(E entity) throws PersistenceException, EntityExistsException {
		this.entity = entity;
		try {
			this.entityManager.persist(entity);
		} catch (EntityExistsException e) {
			logger.info(e.getMessage());
			throw new EntityExistsException(e);
		}catch (PersistenceException e) {
			logger.info(e.getMessage());
			throw new PersistenceException(e);
		}
		return this.entity;
	}
	
	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	/**
	 * @return the DataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}
	

}
