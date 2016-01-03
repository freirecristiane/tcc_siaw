package br.com.scrumtaskboard.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("scrumtaskboard");
	
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public void close(EntityManager em){
		em.close();
	}
}
