import com.kmutt.stcp.config.PersistenceConfig;
import com.kmutt.stcp.entity.Account;
import com.kmutt.stcp.repository.AccountRepository;
import com.kmutt.stcp.service.AccountService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jirapatj on 2/19/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class}, loader = AnnotationConfigContextLoader.class)
public class AccountServiceTest {

    @Autowired
    AccountService accountService;
    @Autowired
    AccountRepository accountRepository;

    Account ac = null;

    @Before
    public void before() {

        ac = new Account();
        ac.setUsername("username");
        ac.setPassword("password");

    }

    @Ignore(value = "Data Integrity Violation")
    @Test
    @Transactional
    public void createAcoount_ShouldSaveToDB() {
        accountService.save(ac);
        List<Account> accounts = accountRepository.findAll();
        assert accounts.size() == 1;
    }
}
