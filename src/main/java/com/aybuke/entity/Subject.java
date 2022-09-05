package com.aybuke.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @ManyToOne(cascade =  CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Lesson lesson;

    private LocalDate createdAt;

    private LocalDate updatedAt;
    private boolean Enable;

    public Subject(String name, Lesson lesson, LocalDate createdAt, LocalDate updatedAt, boolean enable) {
        this.name = name;
        this.lesson = lesson;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        Enable = enable;
    }

    public Subject() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isEnable() {
        return Enable;
    }

    public void setEnable(boolean enable) {
        Enable = enable;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lesson=" + lesson +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", Enable=" + Enable +
                '}';
    }
}
