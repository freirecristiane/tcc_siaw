package br.com.scrumtaskboard.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Meeting;

public class MeetingDAO {

	private final DAO<Meeting> dao;
	
	public MeetingDAO(EntityManager em){
		dao = new DAO<Meeting>(Meeting.class);
	}

	public void add(Meeting t) {
		dao.add(t);
	}

	public void delete(Meeting t) {
		dao.delete(t);
	}

	public void update(Meeting t) {
		dao.update(t);
	}

	public List<Meeting> list() {
		return dao.listAll();
	}

	public Meeting search(int id) {
		return dao.searchById(id);
	}
	
	
}
