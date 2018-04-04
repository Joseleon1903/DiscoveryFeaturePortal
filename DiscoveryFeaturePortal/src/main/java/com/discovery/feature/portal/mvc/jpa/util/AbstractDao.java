package com.discovery.feature.portal.mvc.jpa.util;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public abstract class AbstractDao<PK extends Serializable, T> {
	
	private static final Logger logger = Logger.getLogger(AbstractDao.class.getName());
	
	private final Class<T> persistentClass;
	
	@Autowired
	private SessionFactory sessionFactory;
		
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@SuppressWarnings("unchecked")
	public List<T> buscarEntityListPorCriteriaQuery (String parametrerQuery, ParameterExpression parametros){
		//iterando la lista de parametros
    	Query query =  (Query) getSession().createQuery(parametrerQuery);
    	if (parametros != null) {
    		for (Map.Entry<String, Object> entry : parametros.getParametros().entrySet()) {
    			query.setParameter(entry.getKey(), entry.getValue());
    		}	
		}
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public T buscarEntityPorNameQueryConRetorno(String parametrerQuery, ParameterExpression parametros) throws NoResultException,  NonUniqueResultException{
		//iterando la lista de parametros
		Query query =  (Query) getSession().createQuery(parametrerQuery);
    	if (parametros != null) {
    		for (Map.Entry<String, Object> entry : parametros.getParametros().entrySet()) {
    			query.setParameter(entry.getKey(), entry.getValue());
    		}	
		}
		return (T) query.getSingleResult();
	}

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}
	
	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(persistentClass);
	}

}
