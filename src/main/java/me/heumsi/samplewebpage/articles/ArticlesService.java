package me.heumsi.samplewebpage.articles;

import me.heumsi.samplewebpage.projects.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesService {

    @Autowired
    ArticlesRepository articlesRepository;

    public List<Article> getAllArticles() {
        return articlesRepository.findAll();
    }

    public List<Article> getArticles(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return articlesRepository.findByIdGreaterThanOrderByIdDesc(0l, pageable);
    }

    public Article insertArticle(Article article) {
        return articlesRepository.save(article);
    }

    public Article getArticle(Long id) {
        return articlesRepository.findById(id).get();
    }

    public void deleteArticle(Long id) {
        articlesRepository.deleteById(id);
    }

    public Article updateArticle(Long id, Article updatedArticle) {
        Article article = articlesRepository.findById(id).get();
        article.update(updatedArticle);
        articlesRepository.save(article);

        return article;
    }
}
