import com.kmutt.stcp.config.PersistenceConfig;
import com.kmutt.stcp.entity.Curriculum;
import com.kmutt.stcp.repository.CurriculumRepository;
import com.kmutt.stcp.service.CurriculumService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
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
public class CurriculumServiceTest {

    @Autowired
    CurriculumService curriculumService;
    @Autowired
    CurriculumRepository curriculumRepository;

    Curriculum curriculum = null;

    @Before
    public void before() {

        curriculum = new Curriculum();
        curriculum.setName("curriculum_name");
        curriculum.setStartedYear("2015");
        curriculum.setAccId(1);
        curriculum.setStartYear("2016");

    }

    @Test
    @Transactional
    public void createAcoount_ShouldSaveToDB() {
        curriculumRepository.create(curriculum);
        List<Curriculum> curriculums = curriculumRepository.findAll();
        assert curriculums.size() == 1;
    }
}
