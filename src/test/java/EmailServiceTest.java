import com.kmutt.stcp.config.MailConfig;
import com.kmutt.stcp.config.PersistenceConfig;
import com.kmutt.stcp.config.PropertiesConfig;
import com.kmutt.stcp.service.MailService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jirapatj on 4/24/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class, MailConfig.class, PropertiesConfig.class}, loader = AnnotationConfigContextLoader.class)
public class EmailServiceTest {


    @Autowired MailService mailService;

    @Ignore
    @Test
    @Transactional
    public void findSubject() {

        String to = "jewel.jirapat@gmail.com";
        String from = "jewel.jirapat@gmail.com";
        String subject = "title of email";
        String message = "content of email";

        mailService.sendMail(to, from, subject, message);

    }
}
