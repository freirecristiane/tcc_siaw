package br.com.scrumtaskboard.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Sprint;

public class SprintDAO {

	private final DAO<Sprint> dao;
	
	public SprintDAO(EntityManager em){
		dao = new DAO<Sprint>(Sprint.class);
	}

	public void add(Sprint t) {
		dao.add(t);
	}

	public void delete(Sprint t) {
		dao.delete(t);
	}

	public void update(Sprint t) {
		dao.update(t);
	}

	public List<Sprint> list() {
		return dao.listAll();
	}

	public Sprint search(int id) {
		return dao.searchById(id);
	}
	
	
}
