package com.aybuke.repository;

import com.aybuke.entity.Subject;
import com.aybuke.entity.SubjectDetail;
import com.aybuke.utility.MyFactoryRepository;

public class SubjectDetailRepository extends MyFactoryRepository <SubjectDetail,Long> {
    public SubjectDetailRepository() {
        super(new SubjectDetail());
    }
}
