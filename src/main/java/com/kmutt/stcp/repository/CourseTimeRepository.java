package com.kmutt.stcp.repository;

import org.springframework.stereotype.Repository;

import com.kmutt.stcp.entity.CourseTime;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class CourseTimeRepository extends AbstractHibernateDAO<CourseTime> {

    public CourseTimeRepository() {
        super();
        setClazz(CourseTime.class);
    }
}
