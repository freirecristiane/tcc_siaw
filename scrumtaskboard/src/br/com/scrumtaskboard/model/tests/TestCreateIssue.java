package br.com.scrumtaskboard.model.tests;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.Issue;
//import br.com.scrumtaskboard.model.bean.Issue;
import br.com.scrumtaskboard.model.bean.IssueStatus;
import br.com.scrumtaskboard.model.bean.IssueType;
import br.com.scrumtaskboard.model.bean.Priority;
import br.com.scrumtaskboard.model.bean.UserStory;
import br.com.scrumtaskboard.model.dao.IssueDAO;
import br.com.scrumtaskboard.model.dao.JPAUtil;

public class TestCreateIssue {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		IssueDAO dao = new IssueDAO(em);
		
		Issue issue = new UserStory();
		issue.setDescription("issue description");
		issue.setIssueStatus(IssueStatus.TO_DO);
		issue.setIssueType(IssueType.USER_STORY);
		issue.setPriority(Priority.HIGHEST);
		issue.setSummary("issue summary");
		
		em.getTransaction().begin();
		dao.add(issue);
		em.getTransaction().commit();
			
		
	    System.out.println("Generated ID: " + issue.getId());
	    
	    em.close();
	}

}
