package com.kmutt.stcp.repository;

import com.kmutt.stcp.entity.Curriculum;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class CurriculumRepository extends AbstractHibernateDAO<Curriculum> {

    public CurriculumRepository() {
        super();
        setClazz(Curriculum.class);
    }
}
