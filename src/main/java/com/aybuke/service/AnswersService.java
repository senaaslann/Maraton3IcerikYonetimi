package com.aybuke.service;

import com.aybuke.entity.Answers;
import com.aybuke.repository.AnswersRepository;
import com.aybuke.utility.MyFactoryService;

public class AnswersService extends MyFactoryService<AnswersRepository, Answers,Long> {

    public AnswersService() {
        super(new AnswersRepository());
    }
}
