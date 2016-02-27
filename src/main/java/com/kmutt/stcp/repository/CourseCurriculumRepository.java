package com.kmutt.stcp.repository;

import org.springframework.stereotype.Repository;

import com.kmutt.stcp.entity.CourseCurriculum;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class CourseCurriculumRepository extends AbstractHibernateDAO<CourseCurriculum> {

    public CourseCurriculumRepository() {
        super();
        setClazz(CourseCurriculum.class);
    }
}
