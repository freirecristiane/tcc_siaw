package br.com.scrumtaskboard.model.tests;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Profile;
import br.com.scrumtaskboard.model.dao.JPAUtil;
import br.com.scrumtaskboard.model.dao.ProfileDAO;

public class TestProfileAdd {

	
	public static void main(String[] args) {
		/*
		 * Sem JPAUtil e DAO
		 * 
		 * EntityManagerFactory factory = Persistence.createEntityManagerFactory("scrumtaskboard");
		EntityManager em = factory.createEntityManager();
		
		Profile profile = new Profile();
		
		profile.setName("Profile Name");
		profile.setDescription("Profile description");
		profile.setPermission("Profile permission");
		
		em.getTransaction().begin();
		em.persist(profile);
		em.getTransaction().commit();
		
		System.out.println("ID gerado: " + profile.getId());*/
		
		
		EntityManager em = JPAUtil.getEntityManager();
		ProfileDAO dao = new ProfileDAO(em);
		
		Profile profile = new Profile();
		profile.setName("Profile Name 3");
		profile.setDescription("Profile description 3");
		profile.setPermission("Profile permission 3");
		
		em.getTransaction().begin();
		dao.add(profile);
		em.getTransaction().commit();
		
		System.out.println("ID gerado: " + profile.getId());
		
		em.close();

	}

}
