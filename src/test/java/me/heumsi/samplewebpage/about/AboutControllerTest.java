package me.heumsi.samplewebpage.about;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(AboutController.class)
public class AboutControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    AboutService aboutService;

    @Test
    public void getAbout() throws Exception {
        when(aboutService.getRecentContent()).thenReturn("test");

        mockMvc.perform(get("/about"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/about"));
    }

    @Test
    public void getAboutEdit() throws Exception {
        when(aboutService.getRecentContent()).thenReturn("test");

        mockMvc.perform(get("/about-edit"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/about_edit"));
    }
}
