import com.kmutt.stcp.config.PersistenceConfig;
import com.kmutt.stcp.entity.Account;
import com.kmutt.stcp.entity.CoursePlan;
import com.kmutt.stcp.entity.Prerequisite;
import com.kmutt.stcp.entity.Subject;
import com.kmutt.stcp.repository.*;
import com.kmutt.stcp.service.CoursePlannerService;
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

    @Autowired
    CoursePlannerService coursePlannerService;

    @Before
    public void before() {

    }

    @Ignore
    @Test
    public void testGetCoursePlan() throws Exception {
        System.out.print(coursePlannerService.getCoursePlan(null, 0, 0));
    }

//    @Ignore
    @Test
    public void testGetCoursePlanByAccount() {

        Account acc = new Account();
        acc.setId(2);

        System.out.print(coursePlannerService.getCoursePlan(acc));
    }

    @Ignore
    @Test
    public void testGetCoursePlanByAccountYear() throws Exception {
        System.out.print(coursePlannerService.getCoursePlan(null, 0));
    }

    @Ignore
    @Test
    public void testInsertCoursePlan() throws Exception {
        CoursePlan coursePlan = new CoursePlan();
        coursePlannerService.insertCoursePlan(null);
    }

    @Ignore
    @Test
    public void testGetSubject() throws Exception {
        String subjectId = "";
        coursePlannerService.getSubject(subjectId);
    }

    @Ignore
    @Test
    public void testSearchSubjectByName() throws Exception {
        String name = "";
        coursePlannerService.searchSubjectByName(name);
    }

    @Ignore
    @Test
    public void testDeleteCoursePlan() throws Exception {
        int coursePlanId = 0;
        coursePlannerService.deleteCoursePlan(coursePlanId);
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
