package com.aybuke.service;

import com.aybuke.entity.Lesson;
import com.aybuke.entity.Questions;
import com.aybuke.repository.LessonRepository;
import com.aybuke.repository.QuestionsRepository;
import com.aybuke.utility.MyFactoryService;

public class QuestionsService extends MyFactoryService<QuestionsRepository, Questions,Long> {

    public QuestionsService() {
        super(new QuestionsRepository());
    }
}
