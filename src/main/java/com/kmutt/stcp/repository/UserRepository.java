package com.kmutt.stcp.repository;

import com.kmutt.stcp.entity.User;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class UserRepository extends AbstractHibernateDAO<User> {

    public UserRepository() {
        super();
        setClazz(User.class);
    }
}
