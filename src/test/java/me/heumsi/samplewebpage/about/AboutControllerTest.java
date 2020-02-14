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

    /** GET /about 요청에 대한 테스트
     * 응답하는 뷰 템플릿이 page/about 이어야 합니다.
     **/
    @Test
    public void getAbout() throws Exception {
        when(aboutService.getRecentContent()).thenReturn("test");

        mockMvc.perform(get("/about"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/about"));
    }

    /** GET /about-edit 요청에 대한 테스트
     * 응답하는 뷰 템플릿이 page/about_edit 이어야 합니다.
     **/
    @Test
    public void getAboutEdit() throws Exception {
        when(aboutService.getRecentContent()).thenReturn("test");

        mockMvc.perform(get("/about-edit"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/about_edit"));
    }
}
