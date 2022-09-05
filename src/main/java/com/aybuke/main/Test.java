package com.aybuke.main;

import com.aybuke.entity.*;
import com.aybuke.service.*;
import com.aybuke.utility.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;

public class Test {
    private static Session session;
    private static Transaction transaction;
    private static EntityManager entityManager;
    private static CriteriaBuilder criteriaBuilder;

    public static void main(String[] args) {
        implD();

    }
    private static void implD(){
        UserService userService=new UserService();
        LessonService lessonService=new LessonService();
        SubjectService subjectService=new SubjectService();
        SubjectDetailService subjectDetailService=new SubjectDetailService();
        QuestionsService questionsService=new QuestionsService();
        AnswersService answersService=new AnswersService();


        User user = new User("Aybuke","Aslan" ,Role.User, LocalDate.now(),LocalDate.now(),true);
        User user2 = new User("Ogretmen","Aslan" ,Role.Editor, LocalDate.now(),LocalDate.now(),true);
        User user3 = new User("Ogretmen2","Aslan" ,Role.Editor, LocalDate.now(),LocalDate.now(),true);
        Lesson lesson = new Lesson("Matematik", "3.Sinif",LocalDate.now(),LocalDate.now(),true);
        Subject subject = new Subject("Dort Islem",lesson ,LocalDate.now(),LocalDate.now(),true);
        SubjectDetail subjectDetail=new SubjectDetail(subject, user2, "Toplama","Toplama islemi","Toplama isleminin sembolu + dir",LocalDate.now(),LocalDate.now(),true);
        Questions  questions =new Questions(subjectDetail,user,"Toplama islemi","Toplama islemini nasil yapariz ",LocalDate.now(),LocalDate.now(),true);
        Answers answers=new Answers(questions,user2,"4+5 =9 gibi yapilabilir",LocalDate.now(),LocalDate.now(),true);


        userService.save(List.of(user,user2,user3));
        lessonService.save(lesson);
        subjectService.save(subject);
        subjectDetailService.save(subjectDetail);
        questionsService.save(questions);
        answersService.save(answers);
    }
}
