package com.kmutt.stcp.repository;

import org.springframework.stereotype.Repository;

import com.kmutt.stcp.entity.CourseLecture;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class CourseLectureRepository extends AbstractHibernateDAO<CourseLecture> {

    public CourseLectureRepository() {
        super();
        setClazz(CourseLecture.class);
    }
}
