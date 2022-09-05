package com.aybuke.entity;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToOne(cascade =  CascadeType.ALL)
    private SubjectDetail subjectDetail;
    @OneToOne(cascade =  CascadeType.ALL)
    private User user;
    private String title;
    private String Questions;

    private LocalDate createdAt;

    private LocalDate updateAt;
    private boolean Enabled;

    public Questions(SubjectDetail subjectDetail, User user, String title, String questions, LocalDate createdAt, LocalDate updateAt, boolean enabled) {
        this.subjectDetail = subjectDetail;
        this.user = user;
        this.title = title;
        this.Questions = questions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        Enabled = enabled;
    }

    public Questions() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubjectDetail getSubjectDetail() {
        return subjectDetail;
    }

    public void setSubjectDetail(SubjectDetail subjectDetail) {
        this.subjectDetail = subjectDetail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    public boolean isEnabled() {
        return Enabled;
    }

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", subjectDetail=" + subjectDetail +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", Questions=" + Questions +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", Enabled=" + Enabled +
                '}';
    }
}

