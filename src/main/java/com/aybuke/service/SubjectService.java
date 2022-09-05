package com.aybuke.service;

import com.aybuke.entity.Questions;
import com.aybuke.entity.Subject;
import com.aybuke.repository.QuestionsRepository;
import com.aybuke.repository.SubjectRepository;
import com.aybuke.utility.MyFactoryService;

public class SubjectService extends MyFactoryService<SubjectRepository, Subject,Long> {

    public SubjectService() {
        super(new SubjectRepository());
    }
}
