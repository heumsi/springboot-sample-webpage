package me.heumsi.samplewebpage.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProjectsService {

    @Autowired
    ProjectsRepository projectsRepository;

    public List<Project> getAllProjects() {
        return projectsRepository.findAll();
    }

    public List<Project> getProjects(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return projectsRepository.findByIdGreaterThanOrderByIdDesc(0l, pageable);
    }

    public Project insertProject(Project project) {
        return projectsRepository.save(project);
    }

    public Project getProject(Long id) {
        return projectsRepository.findById(id).get();
    }

    public void deleteProject(Long id) {
        projectsRepository.deleteById(id);
    }

    public Project updateProject(Long id, Project updatedProject) {
        Project project = projectsRepository.findById(id).get();
        project.update(updatedProject);
        projectsRepository.save(project);

        return project;
    }
}
