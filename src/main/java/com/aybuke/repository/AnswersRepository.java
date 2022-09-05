package com.aybuke.repository;

import com.aybuke.entity.Answers;
import com.aybuke.utility.MyFactoryRepository;

public class AnswersRepository extends MyFactoryRepository <Answers,Long> {
    public AnswersRepository() {
        super(new Answers());
    }
}
