import com.kmutt.stcp.config.PersistenceConfig;
import com.kmutt.stcp.entity.Curriculum;
import com.kmutt.stcp.repository.CurriculumRepository;
import com.kmutt.stcp.service.CurriculumService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by jirapatj on 2/19/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class}, loader = AnnotationConfigContextLoader.class)
@Transactional
public class CurriculumServiceTest {

    @Autowired
    CurriculumService curriculumService;
    @Autowired
    CurriculumRepository curriculumRepository;

    Curriculum cr1 = null;

    @Before
    public void before() {

        cr1 = new Curriculum();
        cr1.setName("curriculum_name");
        cr1.setStartedYear("2015");
        cr1.setAccId(1);
        cr1.setStartYear("2016");

    }

    @Test
    public void createCurriculum_ShouldSaveToDB() {
        curriculumRepository.create(cr1);
        List<Curriculum> curriculums = curriculumRepository.findAll();
        assertEquals(curriculums.size(), 1);
    }
}
