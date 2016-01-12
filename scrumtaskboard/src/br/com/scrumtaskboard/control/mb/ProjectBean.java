package br.com.scrumtaskboard.control.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.scrumtaskboard.model.bean.Project;
import br.com.scrumtaskboard.model.bean.ProjectStatus;
import br.com.scrumtaskboard.model.dao.DAO;

@ViewScoped
@ManagedBean
public class ProjectBean {

	private Project project = new Project();
	private List<Project> projects;
	private List<ProjectStatus> projectStatuses;
	
	public Project getProject(){
		return project;
	}
	
	public void save(){
		DAO<Project> dao = new DAO<Project>(Project.class);
		
		if (project.getId() == null) {
			dao.add(project);
		} else {
			dao.update(project);
		}
	
		this.project = new Project();
		this.projects = dao.listAll();
	}
	
	@PostConstruct
	public void loadProjects(){
		projects = new DAO<Project>(Project.class).listAll();
	}
	
	public List<Project> getProjects(){
		return projects;
	}
	
	public void delete(){
		DAO<Project> dao = new DAO<Project>(Project.class);
		dao.delete(this.project);
		
		this.project = new Project();
	}
	
	public void setProject(Project project){
		this.project = project;
	}
	
	public List<ProjectStatus> getProjectStatuses(){
		if (projectStatuses == null || projectStatuses.isEmpty()) {
			projectStatuses = new ArrayList<ProjectStatus>();
			
			for (ProjectStatus is : ProjectStatus.values()) {
				projectStatuses.add(is);
			}
		}
		
		return projectStatuses;
	}
	
}
