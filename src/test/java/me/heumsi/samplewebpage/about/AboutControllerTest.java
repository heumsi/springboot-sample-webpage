package me.heumsi.samplewebpage.about;

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
@WebMvcTest(AboutController.class)
class AboutControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getAbout() throws Exception {
        mockMvc.perform(get("/about"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/about"));
    }

    @Test
    void getAboutEdit() throws Exception {
        mockMvc.perform(get("/about-edit"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/about_edit"));
    }
}
