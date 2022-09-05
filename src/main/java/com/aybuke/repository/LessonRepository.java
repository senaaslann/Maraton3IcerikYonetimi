package com.aybuke.repository;

import com.aybuke.entity.Answers;
import com.aybuke.entity.Lesson;
import com.aybuke.utility.MyFactoryRepository;

public class LessonRepository extends MyFactoryRepository <Lesson,Long> {
    public LessonRepository() {
        super(new Lesson());
    }
}
