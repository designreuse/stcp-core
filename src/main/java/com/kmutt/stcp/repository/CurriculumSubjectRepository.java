package com.kmutt.stcp.repository;

import org.springframework.stereotype.Repository;

import com.kmutt.stcp.entity.CurriculumSubject;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class CurriculumSubjectRepository extends AbstractHibernateDAO<CurriculumSubject> {

    public CurriculumSubjectRepository() {
        super();
        setClazz(CurriculumSubject.class);
    }
}
