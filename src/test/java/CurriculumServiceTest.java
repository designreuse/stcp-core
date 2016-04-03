import com.kmutt.stcp.config.PersistenceConfig;
import com.kmutt.stcp.entity.Course;
import com.kmutt.stcp.entity.Curriculum;
import com.kmutt.stcp.repository.CourseRepository;
import com.kmutt.stcp.repository.CurriculumRepository;
import org.junit.Before;
import org.junit.Ignore;
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
public class CurriculumServiceTest {

    @Autowired
    CurriculumRepository curriculumRepository;
    @Autowired
    CourseRepository courseRepository;

    @Before
    public void before() {
    	
//    	//Course 1
//    	Course course = new Course();
//    	course.setCode("01");
//    	course.setName("course name");
//
//    	//Curriculum 1
//    	Curriculum cr1 = new Curriculum();
//        cr1.setName("curriculum_name_test1");
//        cr1.setStartedYear("2015");
//        cr1.setAccId(1);
//        cr1.setStartYear("2016");
//
//        Set<CourseCurriculum> courseCurriculumList = new HashSet<CourseCurriculum>();
//        //CourseCurriculum 1
//        CourseCurriculum courseCurriculum = new CourseCurriculum();
//        courseCurriculum.setCurriculum(cr1);
//        courseCurriculum.setCourse(course);
//        courseCurriculumList.add(courseCurriculum);
//
//        //CourseCurriculum 2
//        courseCurriculum = new CourseCurriculum();
//        courseCurriculum.setCurriculum(cr1);
//        courseCurriculum.setCourse(course);
//        courseCurriculumList.add(courseCurriculum);
//
//        course.setCourseCurriculums(courseCurriculumList);
//        cr1.setCourseCurriculums(courseCurriculumList);
//
//        curriculumRepository.create(cr1);
//
//        //Curriculum 2
//        cr1 = new Curriculum();
//        cr1.setName("curriculum_name_test2");
//        cr1.setStartedYear("2015");
//        cr1.setAccId(1);
//        cr1.setStartYear("2016");
//
//        curriculumRepository.create(cr1);
    }

    @Ignore
    @Test
    @Transactional
    public void querySQL() {
//    	//--------------------------------- SQL ---------------------------------//
//        List<Curriculum> curriculums = curriculumRepository.querySQL("select * "
//							        		+ "from curriculum c "
//							        		+ "join course_curriculum cc on c.id = cc.curriculum_id "
//							        		+ "join course co on co.id = cc.course_id "
//							        		+ "where co.code = '01'"
//						        		);
//
//        System.out.println("--------------Start Result SQL-------------------");
//        System.out.println("Result size = "+curriculums.size());
//        curriculums.forEach(curriculum -> {
//        	if(curriculum.getCourseCurriculums() != null){
//	        	curriculum.getCourseCurriculums().forEach(courseCurriculum -> {
//	        		System.out.println("curriculum name = "+curriculum.getName()
//        					+", CourseCurriculum id = "+courseCurriculum.getId()
//        					+", course code = "+courseCurriculum.getCourse().getCode());
//
//	        	});
//        	}
//        	System.out.println("-------------");
//        });
//        System.out.println("--------------End Result SQL-------------------");
        
    }
    
    @Test
    @Transactional
    public void querySQLByField() {
    	//--------------------------------- SQL By Field ---------------------------------//
        List<Object[]> resultList = curriculumRepository.querySQLByField("select c.id, c.name "
											        		+ "from Curriculum c "
											    		);
	    
	    System.out.println("--------------Start Result SQL By Field-------------------");
	    System.out.println("Result size = "+resultList.size());
	    resultList.forEach(result -> {
    		System.out.println("curriculum id = "+result[0] 
    						+", curriculum name = "+result[1]);
	    });
	    System.out.println("--------------End Result SQL By Field-------------------");
	    
    }

    @Ignore
    @Test
    @Transactional
    public void queryHQL() {
    	//--------------------------------- HQL ---------------------------------//
//    	List<Curriculum> curriculums = curriculumRepository.queryHQL("select c "
//							        		+ "from Curriculum c "
//							        		+ "join c.courseCurriculums cc "
//							        		+ "join cc.course co "
//							        		+ "where co.code = '01'"
//						        		);
//
//        System.out.println("--------------Start Result HQL-------------------");
//        System.out.println("Result size = "+curriculums.size());
//        curriculums.forEach(curriculum -> {
//
//        	if(curriculum.getCourseCurriculums() != null){
//	        	curriculum.getCourseCurriculums().forEach(courseCurriculum -> {
//	        		System.out.println("curriculum name = "+curriculum.getName()
//	        					+", CourseCurriculum id = "+courseCurriculum.getId()
//	        					+", course code = "+courseCurriculum.getCourse().getCode());
//	        	});
//        	}
//        	System.out.println("-------------");
//        });
//        System.out.println("--------------End Result HQL-------------------");
        
    }
    
    @Test
    @Transactional
    public void queryHQLByField() {
    	//--------------------------------- HQL By Field ---------------------------------//
    	List<Object[]>resultList = curriculumRepository.queryHQLByField("select c.id, c.name "
											        		+ "from Curriculum c "
											    		);
	    
	    System.out.println("--------------Start Result HQL By Field-------------------");
	    System.out.println("Result size = "+resultList.size());
	    resultList.forEach(result -> {
    		System.out.println("curriculum id = "+result[0] 
    				+", curriculum name = "+result[1]);
	    });
	    System.out.println("--------------End Result HQL By Field-------------------");

    }
}
