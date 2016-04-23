import com.kmutt.stcp.config.PersistenceConfig;
import com.kmutt.stcp.entity.Prerequisite;
import com.kmutt.stcp.entity.Subject;
import com.kmutt.stcp.repository.CourseRepository;
import com.kmutt.stcp.repository.CurriculumRepository;
import com.kmutt.stcp.repository.PrerequisiteRepository;
import com.kmutt.stcp.repository.SubjectRepository;
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

import static org.junit.Assert.assertEquals;

/**
 * Created by jirapatj on 2/19/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class}, loader = AnnotationConfigContextLoader.class)
public class SubjectServiceTest {

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    PrerequisiteRepository prerequisiteRepository;

    @Before
    public void before() {

    }

    @Ignore
    @Test
    @Transactional
    public void findSubject() {

        Subject main = new Subject();
        main.setId(1);

        Subject child = new Subject();
        child.setId(1);


        Prerequisite prerequisite = new Prerequisite();
        prerequisite.setId(1);
        prerequisite.setSubjectBySubjectId(main);
        prerequisite.setSubjectByPresubjectId(child);

        subjectRepository.create(main);

//        prerequisiteRepository.create(prerequisite);



        List<Subject> list = subjectRepository.findAll();
        assertEquals(list.size(), 1);

    }
}
