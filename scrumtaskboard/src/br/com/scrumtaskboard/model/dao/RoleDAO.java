package br.com.scrumtaskboard.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Role;

public class RoleDAO {

	private final DAO<Role> dao;
	
	public RoleDAO(EntityManager em){
		dao = new DAO<Role>(Role.class);
	}

	public void add(Role t) {
		dao.add(t);
	}

	public void delete(Role t) {
		dao.delete(t);
	}

	public void update(Role t) {
		dao.update(t);
	}

	public List<Role> list() {
		return dao.listAll();
	}

	public Role search(int id) {
		return dao.searchById(id);
	}
	
	
}
