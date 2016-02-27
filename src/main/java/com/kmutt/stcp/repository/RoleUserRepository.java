package com.kmutt.stcp.repository;

import org.springframework.stereotype.Repository;

import com.kmutt.stcp.entity.RoleUser;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class RoleUserRepository extends AbstractHibernateDAO<RoleUser> {

    public RoleUserRepository() {
        super();
        setClazz(RoleUser.class);
    }
}
