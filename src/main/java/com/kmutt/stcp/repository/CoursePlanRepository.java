package com.kmutt.stcp.repository;

import org.springframework.stereotype.Repository;

import com.kmutt.stcp.entity.CoursePlan;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class CoursePlanRepository extends AbstractHibernateDAO<CoursePlan> {

    public CoursePlanRepository() {
        super();
        setClazz(CoursePlan.class);
    }
}
