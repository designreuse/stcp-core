package com.kmutt.stcp.repository.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jirapatj on 2/19/16.
 */
@Transactional
public abstract class AbstractHibernateDAO<T extends Serializable> {
    private Class<T> clazz;

    @Autowired SessionFactory sessionFactory;

    public final void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(int id) {
        return (T) getCurrentSession().get(clazz, id);
    }

    public List<T> findAll() {
        return getCurrentSession().createQuery("from " + clazz.getName()).list();
    }

    public void create(T entity) {
        getCurrentSession().merge(entity);
        getCurrentSession().flush();
    }

    public void update(T entity) {
        getCurrentSession().merge(entity);
    }

    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    public void deleteById(int entityId) {
        T entity = findOne(entityId);
        delete(entity);
    }
    
    public List<T> querySQL(String sql) {
        return getCurrentSession().createSQLQuery(sql).addEntity(clazz).list();
    }
    
    public List<Object[]> querySQLByField(String sql) {
        return getCurrentSession().createSQLQuery(sql).list();
    }
    
    public List<T> queryHQL(String hql) {
        return getCurrentSession().createQuery(hql).list();
    }
    
    public List<Object[]> queryHQLByField(String hql) {
        return getCurrentSession().createQuery(hql).list();
    }

    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
