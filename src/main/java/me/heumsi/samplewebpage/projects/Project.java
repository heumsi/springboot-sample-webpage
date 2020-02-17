package me.heumsi.samplewebpage.projects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Project {

    @Id @GeneratedValue
    private Long id;

    private String title;

    private String name;

    @Column(columnDefinition = "LONGBLOB")
    private String coverImage;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate periodFrom;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate periodTo;

    @Column(columnDefinition = "LONGTEXT")
    private String content;

    @Column(columnDefinition = "TEXT")
    private String description;

    @CreationTimestamp
    private LocalDateTime createdTimeAt;

    @UpdateTimestamp
    private LocalDateTime updatedTimeAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public LocalDate getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(LocalDate periodFrom) {
        this.periodFrom = periodFrom;
    }

    public LocalDate getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(LocalDate periodTo) {
        this.periodTo = periodTo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedTimeAt() {
        return createdTimeAt;
    }

    public void setCreatedTimeAt(LocalDateTime createdTimeAt) {
        this.createdTimeAt = createdTimeAt;
    }

    public LocalDateTime getUpdatedTimeAt() {
        return updatedTimeAt;
    }

    public void setUpdatedTimeAt(LocalDateTime updatedTimeAt) {
        this.updatedTimeAt = updatedTimeAt;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", coverImage='" + coverImage + '\'' +
                ", periodFrom=" + periodFrom +
                ", periodTo=" + periodTo +
                ", content='" + content + '\'' +
                ", description='" + description + '\'' +
                ", createdTimeAt=" + createdTimeAt +
                ", updatedTimeAt=" + updatedTimeAt +
                '}';
    }

    public void update(Project project) {
        this.title = project.getTitle();
        this.name = project.getName();
        this.coverImage = project.getCoverImage();
        this.periodFrom = project.getPeriodFrom();
        this.periodTo = project.getPeriodTo();
        this.description = project.getDescription();
        this.content = project.getContent();
        this.updatedTimeAt = project.getUpdatedTimeAt();
    }
}
