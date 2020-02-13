package me.heumsi.samplewebpage.projects;

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
@WebMvcTest(ProjectsController.class)
class ProjectsControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getProjects() throws Exception {
        mockMvc.perform(get("/projects"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/projects"));
    }

    @Test
    void getProjectDetail() throws Exception {
        mockMvc.perform(get("/project-detail"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/project_detail"));
    }

    @Test
    void getProjectEdit() throws Exception {
        mockMvc.perform(get("/project-edit"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/project_edit"));
    }
}
