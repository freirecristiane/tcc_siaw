package br.com.scrumtaskboard.model.tests;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Profile;
import br.com.scrumtaskboard.model.dao.JPAUtil;
import br.com.scrumtaskboard.model.dao.ProfileDAO;

public class TestProfileList {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		ProfileDAO dao = new ProfileDAO(em);
		
		em.getTransaction().begin();
		
		List<Profile> profiles = dao.list();
		
		for (Profile profile : profiles) {
			System.out.println(profile.getId() + " " + profile.getName());
		}		
		
		em.getTransaction().commit();
		em.close();

	}

}
