package com.kmutt.stcp.repository;

import com.kmutt.stcp.entity.Account;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class AccountRepository extends AbstractHibernateDAO<Account> {

    public AccountRepository() {
        super();
        setClazz(Account.class);
    }
}
