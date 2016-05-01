package com.kmutt.stcp.service;

import com.kmutt.stcp.entity.Account;
import com.kmutt.stcp.entity.CoursePlan;
import com.kmutt.stcp.entity.Subject;
import com.kmutt.stcp.repository.CoursePlanRepository;
import com.kmutt.stcp.repository.SubjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jirapatj on 4/19/16.
 */
@Service("coursePlannerService")
public class CoursePlannerService {

    private final Logger logger = LoggerFactory.getLogger(CoursePlannerService.class);


    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private CoursePlanRepository coursePlanRepository;

    public CoursePlannerService() {
    }

    public List<Subject> getSubjectListTest() {
        return subjectRepository.findAll();
    }

    public CoursePlan getCoursePlan(Account account, int semester, int term) {
        if (account == null || semester == 0 || term == 0) {
            return null;
        }
        List<CoursePlan> coursePlans = coursePlanRepository.queryHQL(" FROM CoursePlan where account.id=" + account.getId() + " and semesterYear = " + semester + " and semesterTerm =" + term);
        if (coursePlans != null && coursePlans.size() > 0) {
            return coursePlans.get(0);
        }
        return null;
    }


    public List<CoursePlan> getCoursePlan(Account account) {
        if (account == null) {
            return null;
        }
        List<CoursePlan> coursePlans = coursePlanRepository.queryHQL(" FROM CoursePlan where account.id=" + account.getId());
        if (coursePlans != null && coursePlans.size() > 0) {
            return coursePlans;
        }
        return null;
    }

    public List<CoursePlan> getCoursePlan(Account account, int year) {
        if (account == null || year == 0) {
            return null;
        }
        List<CoursePlan> coursePlans = coursePlanRepository.queryHQL(" FROM CoursePlan where account.id=" + account.getId() + " and semesterYear = " + year);
        if (coursePlans != null && coursePlans.size() > 0) {
            return coursePlans;
        }
        return null;
    }

    public boolean insertCoursePlan(CoursePlan coursePlan) {
        coursePlanRepository.create(coursePlan);
        if (coursePlan.getId() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public Subject getSubject(String idS) {
        if (idS == null || "".equals(idS.trim())) {
            return null;
        }
        int id;
        try {
            id = Integer.parseInt(idS);
        } catch (NumberFormatException ex) {
            return null;
        }

        return subjectRepository.findOne(id);
    }

    public List<Subject> searchSubjectByName(String name) {
        if (name == null) {
            return null;
        }
        List<Subject> subjects = subjectRepository.queryHQL(" from Subject where nameThai like '%" + name + "%' or nameEng like '%" + name + "%'");
        return subjects;
    }

    public void deleteCoursePlan(int coursePlanId) throws Exception {

        try {
            CoursePlan cri = coursePlanRepository.findOne(coursePlanId);
            coursePlanRepository.delete(cri);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception();
        }

    }
}
