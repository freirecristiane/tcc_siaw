package br.com.scrumtaskboard.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.User;

public class UserDAO {

	private final DAO<User> dao;
	
	public UserDAO(EntityManager em){
		this.dao = new DAO<User>(User.class);
	}

	public void add(User t) {
		dao.add(t);
	}

	public void delete(User t) {
		dao.delete(t);
	}

	public void update(User t) {
		dao.update(t);
	}

	public List<User> list() {
		return dao.listAll();
	}

	public User search(int id) {
		return dao.searchById(id);
	}
	
	
}
