package me.heumsi.samplewebpage.articles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticlesController {

    @GetMapping("/articles")
    public String getArticles() {
        return "page/articles";
    }

    @GetMapping("/article-detail")
    public String getArticleDetail() {
        return "page/article_detail";
    }

    @GetMapping("/article-edit")
    public String getArticleEdit() {
        return "page/article_edit";
    }
}
