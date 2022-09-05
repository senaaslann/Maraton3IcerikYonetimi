package com.aybuke.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
public class SubjectDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToOne (cascade =  CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Subject subject;
    @OneToOne (cascade =  CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private User user;
    private String title;
    private String description;
    private String Article;

    private LocalDate createdAt;

    private LocalDate updateAt;
    private boolean Enabled;

    public SubjectDetail(Subject subject, User user, String title, String description, String article, LocalDate createdAt, LocalDate updateAt, boolean enabled) {
        this.subject = subject;
        this.user = user;
        this.title = title;
        this.description = description;
        Article = article;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        Enabled = enabled;
    }

    public SubjectDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArticle() {
        return Article;
    }

    public void setArticle(String article) {
        Article = article;
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
        return "SubjectDetail{" +
                "id=" + id +
                ", subject=" + subject +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", Article='" + Article + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", Enabled=" + Enabled +
                '}';
    }
}
