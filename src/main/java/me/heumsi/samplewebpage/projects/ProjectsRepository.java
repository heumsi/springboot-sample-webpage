package me.heumsi.samplewebpage.projects;

import me.heumsi.samplewebpage.articles.Article;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectsRepository extends JpaRepository<Project, Long> {
    List<Project> findByIdGreaterThanOrderByIdDesc(Long id, Pageable paging);
}
