package com.aybuke.service;

import com.aybuke.entity.Subject;
import com.aybuke.entity.SubjectDetail;
import com.aybuke.repository.SubjectDetailRepository;
import com.aybuke.repository.SubjectRepository;
import com.aybuke.utility.MyFactoryService;

public class SubjectDetailService extends MyFactoryService<SubjectDetailRepository, SubjectDetail,Long> {

    public SubjectDetailService() {
        super(new SubjectDetailRepository());
    }
}
