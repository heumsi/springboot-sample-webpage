package me.heumsi.samplewebpage.articles;

import me.heumsi.samplewebpage.projects.Project;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "LONGBLOB")
    private String coverImage;

    private String title;

    private String subTitle;

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

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
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
        return "Article{" +
                "id=" + id +
                ", coverImage='" + coverImage + '\'' +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", content='" + content + '\'' +
                ", description='" + description + '\'' +
                ", createdTimeAt=" + createdTimeAt +
                ", updatedTimeAt=" + updatedTimeAt +
                '}';
    }

    public void update(Article article) {
        this.coverImage = article.getCoverImage();
        this.title = article.getTitle();
        this.subTitle = article.getSubTitle();
        this.content = article.getContent();
        this.description = article.getDescription();
        this.updatedTimeAt = article.getUpdatedTimeAt();
    }
}
