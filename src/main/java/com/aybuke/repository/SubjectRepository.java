package com.aybuke.repository;

import com.aybuke.entity.Questions;
import com.aybuke.entity.Subject;
import com.aybuke.utility.MyFactoryRepository;

public class SubjectRepository extends MyFactoryRepository <Subject,Long> {
    public SubjectRepository() {
        super(new Subject());
    }
}
