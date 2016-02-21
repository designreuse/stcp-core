package com.kmutt.stcp.repository.common;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class GenericHibernateDAO<T extends Serializable>
        extends AbstractHibernateDAO<T> implements GenericDAO<T> {
}
