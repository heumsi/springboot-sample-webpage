package me.heumsi.samplewebpage.about;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class About {

    @Id @GeneratedValue
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @CreationTimestamp
    private LocalDateTime createdTimeAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedTimeAt() {
        return createdTimeAt;
    }

    public void setCreatedTimeAt(LocalDateTime createdTimeAt) {
        this.createdTimeAt = createdTimeAt;
    }

    @Override
    public String toString() {
        return "About{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createdTimeAt=" + createdTimeAt +
                '}';
    }
}
