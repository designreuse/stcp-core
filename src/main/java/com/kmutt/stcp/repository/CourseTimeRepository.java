package com.kmutt.stcp.repository;

import com.kmutt.stcp.entity.CourseTime;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;
import org.springframework.stereotype.Repository;

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
