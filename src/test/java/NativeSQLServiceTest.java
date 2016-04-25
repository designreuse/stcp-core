import com.kmutt.stcp.config.PersistenceConfig;
import com.kmutt.stcp.entity.Account;
import com.kmutt.stcp.entity.RoleUser;
import com.kmutt.stcp.entity.User;
import com.kmutt.stcp.repository.AccountRepository;
import com.kmutt.stcp.repository.RoleUserRepository;
import com.kmutt.stcp.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jirapatj on 2/19/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class}, loader = AnnotationConfigContextLoader.class)
public class NativeSQLServiceTest {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    RoleUserRepository roleUserRepository;
    @Autowired
    UserRepository userRepository;

    @Before
    public void before() {
    	RoleUser roleUser = new RoleUser();
    	roleUser.setRole("test");
        roleUser.setDescription("test");
    	
    	//Account 1
    	Account account = new Account();
    	account.setUsername("username1");
    	account.setPassword("password1");
    	account.setRoleUser(roleUser);

    	//Account 2
    	Account account2 = new Account();
    	account2.setUsername("username2");
    	account2.setPassword("password2");
    	account2.setRoleUser(roleUser);
    	
    	Set<Account> accounts = new HashSet<Account>();
    	accounts.add(account);
    	accounts.add(account2);
    	roleUser.setAccounts(accounts);
    	
    	roleUserRepository.create(roleUser);
    }

    @Test
    @Transactional
    public void querySQL() {
    	//--------------------------------- SQL ---------------------------------//
        List<Account> results = accountRepository.querySQL("select * "
							        		+ "from account a "
							        		+ "join role_user ru on ru.id = a.role_user_id "
							        		+ "where a.username = 'username1'"
						        		);

        System.out.println("--------------Start Result SQL-------------------");
        System.out.println("Result size = "+results.size());
        results.forEach(result -> {
        	System.out.println("Username = "+result.getUsername());
        });
        System.out.println("--------------End Result SQL-------------------");

    }

    @Test
    @Transactional
    public void querySQLByField() {
    	//--------------------------------- SQL By Field ---------------------------------//
        List<Object[]> results = accountRepository.querySQLByField("select a.username, a.password "
											        		+ "from Account a "
											    		);

	    System.out.println("--------------Start Result SQL By Field-------------------");
	    System.out.println("Result size = "+results.size());
	    results.forEach(result -> {
    		System.out.println("Username = "+result[0]
    						+", Password = "+result[1]);
	    });
	    System.out.println("--------------End Result SQL By Field-------------------");

    }

    @Test
    @Transactional
    public void queryHQL() {
    	//--------------------------------- HQL ---------------------------------//
    	List<Account> results = accountRepository.queryHQL("select a "
							        		+ "from Account a "
							        		+ "join a.roleUser ru "
							        		+ "where a.username = 'username1'"
						        		);

        System.out.println("--------------Start Result HQL-------------------");
        System.out.println("Result size = "+results.size());
        results.forEach(result -> {
        	System.out.println("Username = "+result.getUsername());
        	System.out.println("-------------");
        });
        System.out.println("--------------End Result HQL-------------------");

    }

    @Test
    @Transactional
    public void queryHQLByField() {
    	//--------------------------------- HQL By Field ---------------------------------//
    	List<Object[]> results = accountRepository.queryHQLByField("select a.username, a.password "
											        		+ "from Account a "
											    		);

	    System.out.println("--------------Start Result HQL By Field-------------------");
	    System.out.println("Result size = "+results.size());
	    results.forEach(result -> {
    		System.out.println("Username = "+result[0]
    				+", Password = "+result[1]);
	    });
	    System.out.println("--------------End Result HQL By Field-------------------");

    }
}
