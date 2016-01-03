package br.com.scrumtaskboard.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Project;

public class ProjectDAO {

	private final DAO<Project> dao;
	
	public ProjectDAO(EntityManager em){
		dao = new DAO<Project>(Project.class);
	}

	public void add(Project t) {
		dao.add(t);
	}

	public void delete(Project t) {
		dao.delete(t);
	}

	public void update(Project t) {
		dao.update(t);
	}

	public List<Project> list() {
		return dao.listAll();
	}

	public Project search(int id) {
		return dao.searchById(id);
	}
}
