package com.kmutt.stcp.service;

import com.kmutt.stcp.entity.Account;
import com.kmutt.stcp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jirapatj on 2/19/16.
 */
@Service("accountService")
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Transactional
    public void save(Account account) {
        accountRepository.create(account);
    }
}
