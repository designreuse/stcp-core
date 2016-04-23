package com.kmutt.stcp.service;

import com.kmutt.stcp.entity.Account;
import com.kmutt.stcp.entity.CoursePlan;
import com.kmutt.stcp.entity.Subject;
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

    public CoursePlannerService() {
    }

    public List<Subject> getSubjectListTest() {
        return subjectRepository.findAll();
    }

    public CoursePlan getCoursePlan(Account account,int semester,int term) {

        return new CoursePlan();
    }


    public List<CoursePlan> getCoursePlan(Account account) {

        return new ArrayList<>();
    }

    public List<CoursePlan> getCoursePlan(Account account,int year) {

        return new ArrayList<>();
    }

    public boolean insertCoursePlan(CoursePlan coursePlan) {

        return false;
    }

    public Subject getSubject(String subjectId) {

        return new Subject();
    }

    public List<Subject> getSubject(String code, String name) {

        return new ArrayList<>();
    }

    public boolean deleteCoursePlan(int coursePlanId) {

        return false;
    }
}
