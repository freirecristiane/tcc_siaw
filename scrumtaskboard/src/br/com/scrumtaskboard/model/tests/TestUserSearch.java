package br.com.scrumtaskboard.model.tests;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.User;
import br.com.scrumtaskboard.model.dao.JPAUtil;
import br.com.scrumtaskboard.model.dao.UserDAO;

public class TestUserSearch {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		UserDAO userDAO = new UserDAO(em);
		
		em.getTransaction().begin();
		
		User user = userDAO.search(4);
		
		System.out.println(user.getName());
		
		em.getTransaction().begin();
		em.close();
	}

}
