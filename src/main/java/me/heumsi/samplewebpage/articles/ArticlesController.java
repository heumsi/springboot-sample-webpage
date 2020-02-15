package me.heumsi.samplewebpage.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ArticlesController {

    @Autowired
    ArticlesService articlesService;

    @GetMapping("/articles")
    public String getArticles(Model model) {
        return "page/articles";
    }

    @GetMapping("/articles/list")
    public @ResponseBody List<Article> getArticles(@RequestParam Integer page, @RequestParam Integer size) {
        return articlesService.getArticles(page, size);
    }

    @GetMapping("/article-detail")
    public String getArticleDetail() {
        return "page/article_detail";
    }

    @GetMapping("/article-edit")
    public String getArticleEdit() {
        return "page/article_edit";
    }

    @PostMapping("/article-edit")
    public @ResponseBody Article postArticle(@RequestBody Article article) {
        return articlesService.insertArticle(article);
    }
}
