package br.com.scrumtaskboard.model.tests;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Profile;
import br.com.scrumtaskboard.model.dao.JPAUtil;
import br.com.scrumtaskboard.model.dao.ProfileDAO;

public class TestProfileUpdate {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		ProfileDAO dao = new ProfileDAO(em);
		
		em.getTransaction().begin();
		
		Profile profile = dao.search(2);
		profile.setName("New Profile Name");
		
		em.getTransaction().commit();
		em.close();
	}

}
