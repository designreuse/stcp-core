package com.kmutt.stcp.repository;

import org.springframework.stereotype.Repository;

import com.kmutt.stcp.entity.Course;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class CourseRepository extends AbstractHibernateDAO<Course> {

    public CourseRepository() {
        super();
        setClazz(Course.class);
    }
}
