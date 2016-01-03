package br.com.scrumtaskboard.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Profile;

public class ProfileDAO {

	private final DAO<Profile> dao;
	
	public ProfileDAO(EntityManager em){
		dao = new DAO<Profile>(Profile.class);
	}

	public void add(Profile t) {
		dao.add(t);
	}

	public void delete(Profile t) {
		dao.delete(t);
	}

	public void update(Profile t) {
		dao.update(t);
	}

	public List<Profile> list() {
		return dao.listAll();
	}

	public Profile search(int id) {
		return dao.searchById(id);
	}
	
	
}
