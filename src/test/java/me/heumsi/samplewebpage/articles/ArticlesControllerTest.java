package me.heumsi.samplewebpage.articles;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(ArticlesController.class)
class ArticlesControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getArticles() throws Exception {
        mockMvc.perform(get("/articles"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/articles"));
    }

    @Test
    void getArticleDetail() throws Exception {
        mockMvc.perform(get("/article-detail"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/article_detail"));
    }

    @Test
    void getArticleEdit() throws Exception {
        mockMvc.perform(get("/article-edit"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/article_edit"));
    }
}
