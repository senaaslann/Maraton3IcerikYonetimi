package com.aybuke.repository;

import com.aybuke.entity.Lesson;
import com.aybuke.entity.Questions;
import com.aybuke.utility.MyFactoryRepository;

public class QuestionsRepository extends MyFactoryRepository <Questions,Long> {
    public QuestionsRepository() {
        super(new Questions());
    }
}
