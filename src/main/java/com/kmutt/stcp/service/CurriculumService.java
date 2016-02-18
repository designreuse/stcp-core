package com.kmutt.stcp.service;

import com.kmutt.stcp.entity.Curriculum;
import com.kmutt.stcp.repository.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jirapatj on 2/19/16.
 */
@Service("curriculumService")
public class CurriculumService {

    @Autowired CurriculumRepository curriculumRepository;

    @Transactional
    public void save(Curriculum curriculum) {
        curriculumRepository.create(curriculum);
    }
}
