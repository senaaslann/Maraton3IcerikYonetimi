package com.aybuke.service;

import com.aybuke.entity.Answers;
import com.aybuke.entity.Lesson;
import com.aybuke.repository.AnswersRepository;
import com.aybuke.repository.LessonRepository;
import com.aybuke.utility.MyFactoryService;

public class LessonService extends MyFactoryService<LessonRepository,Lesson,Long> {

    public LessonService() {
        super(new LessonRepository());
    }
}
