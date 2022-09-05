package com.aybuke.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToOne(cascade =  CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Questions Questions;
    @OneToOne(cascade =  CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private User user;
    private String Answers;

    private LocalDate createdAt;

    private LocalDate updateAt;
    private boolean Enabled;

    public Answers(com.aybuke.entity.Questions questions, User user, String answers, LocalDate createdAt, LocalDate updateAt, boolean enabled) {
        Questions = questions;
        this.user = user;
        Answers = answers;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        Enabled = enabled;
    }

    public Answers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.aybuke.entity.Questions getQuestions() {
        return Questions;
    }

    public void setQuestions(com.aybuke.entity.Questions questions) {
        Questions = questions;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAnswers() {
        return Answers;
    }

    public void setAnswers(String answers) {
        Answers = answers;
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
        return "Answers{" +
                "id=" + id +
                ", Questions=" + Questions +
                ", user=" + user +
                ", Answers='" + Answers + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", Enabled=" + Enabled +
                '}';
    }
}
