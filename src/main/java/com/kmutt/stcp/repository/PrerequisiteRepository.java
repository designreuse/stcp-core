package com.kmutt.stcp.repository;

import com.kmutt.stcp.entity.Prerequisite;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class PrerequisiteRepository extends AbstractHibernateDAO<Prerequisite> {

    public PrerequisiteRepository() {
        super();
        setClazz(Prerequisite.class);
    }
}
