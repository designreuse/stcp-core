import com.kmutt.stcp.config.PersistenceConfig;
import com.kmutt.stcp.entity.Account;
import com.kmutt.stcp.entity.RoleUser;
import com.kmutt.stcp.entity.User;
import com.kmutt.stcp.repository.AccountRepository;
import com.kmutt.stcp.repository.RoleUserRepository;
import com.kmutt.stcp.repository.UserRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jirapatj on 4/26/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class}, loader = AnnotationConfigContextLoader.class)
public class AccountServiceTest {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleUserRepository roleUserRepository;

    @Ignore
    @Test
    @Transactional
    public void testFindAll() throws Exception {

        //given
        User user = new User();
        user.setId(1);
        user.setCitizenId("11");
        user.setEmail("email");
        user.setFaculty("faculty");
        user.setFirstname("firstname");
        user.setLastname("lastname");
        user.setMajor("major");
        user.setSemester(1);
        userRepository.create(user);

        RoleUser role = new RoleUser();
        role.setId(1);
        roleUserRepository.create(role);

        Account account = new Account();
        account.setUsername("username");
        account.setPassword("password");
        account.setUser(userRepository.findAll().get(0));
        account.setRoleUser(roleUserRepository.findAll().get(0));
        accountRepository.create(account);

        //when
        List<Account> list = accountRepository.findAll();

        //then
//        assertEquals(1, list.size());
    }

}
