package me.heumsi.samplewebpage.articles;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticlesRepository extends JpaRepository<Article, Long> {
    List<Article> findByIdGreaterThanOrderByIdDesc(Long id, Pageable paging);
}
