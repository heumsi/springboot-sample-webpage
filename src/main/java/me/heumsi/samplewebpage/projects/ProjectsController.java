package me.heumsi.samplewebpage.projects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectsController {

    @GetMapping("/projects")
    public String getProjects() {
        return "page/projects";
    }

    @GetMapping("/project-detail")
    public String getProjectDetail() {
        return "page/project_detail";
    }

    @GetMapping("/project-edit")
    public String getProjectEdit() {
        return "page/project_edit";
    }
}
