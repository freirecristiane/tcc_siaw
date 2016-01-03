package br.com.scrumtaskboard.model.tests;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Profile;
import br.com.scrumtaskboard.model.dao.JPAUtil;
import br.com.scrumtaskboard.model.dao.ProfileDAO;

public class TestProfileSearch {
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		ProfileDAO dao = new ProfileDAO(em);
		
		em.getTransaction().begin();
		
		Profile profile = dao.search(1);

		System.out.println(profile.getName());
		
		em.getTransaction().commit();
		em.close();
		
	}
}
