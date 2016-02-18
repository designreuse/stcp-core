package com.kmutt.stcp.repository.common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jirapatj on 2/19/16.
 */
public interface GenericDAO<T extends Serializable> {

    T findOne(final long id);

    List<T> findAll();

    void create(final T entity);

    void update(final T entity);

    void delete(final T entity);

    void deleteById(final long entityId);
}
