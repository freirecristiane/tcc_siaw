package br.com.scrumtaskboard.model.tests;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Project;
import br.com.scrumtaskboard.model.dao.JPAUtil;
import br.com.scrumtaskboard.model.dao.ProjectDAO;

public class TestCreateProject {

	public static void main(String[] args) {
		
		//Creating connection object
		EntityManager em = JPAUtil.getEntityManager();
		
		ProjectDAO dao = new ProjectDAO(em);		
		Project project = new Project();
		
		project.setDescription("My first project");
		project.setName("Cristiane Project");
		project.setSponsor("Anon");
		
		em.getTransaction().begin();
		dao.add(project);
		em.getTransaction().commit();
			
		
	    System.out.println("Generated ID: " + project.getId());
	    
	    em.close();

	}

}
