package br.com.scrumtaskboard.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Issue;

public class IssueDAO {

	private final DAO<Issue> dao;
	
	public IssueDAO(EntityManager em){
		dao = new DAO<Issue>(Issue.class);
	}

	public void add(Issue t) {
		dao.add(t);
	}

	public void delete(Issue t) {
		dao.delete(t);
	}

	public Issue search(int id) {
		return dao.searchById(id);
	}

	public List<Issue> list() {
		return dao.listAll();
	}

	public void update(Issue t) {
		dao.update(t);
	}
	
}
