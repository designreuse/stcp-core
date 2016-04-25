package com.kmutt.stcp.repository.common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jirapatj on 2/19/16.
 */
public interface GenericDAO<T extends Serializable> {

    T findOne(final int id);

    List<T> findAll();

    public List<T> querySQL(String sql);
    public List<Object[]> querySQLByField(String sql);
    public List<T> queryHQL(String hql);
    public List<Object[]> queryHQLByField(String hql);
    
    void create(final T entity);

    void update(final T entity);

    void delete(final T entity);

    void deleteById(final int entityId);
}
