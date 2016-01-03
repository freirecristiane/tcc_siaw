package br.com.scrumtaskboard.model.tests;

import javax.persistence.EntityManager;

import br.com.scrumtaskboard.model.bean.User;
import br.com.scrumtaskboard.model.bean.UserStatus;
import br.com.scrumtaskboard.model.dao.JPAUtil;
import br.com.scrumtaskboard.model.dao.UserDAO;

public class TestUserAdd {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		UserDAO userDAO = new UserDAO(em);
		
		User user = new User();
		user.setEmail("user@email.com");
		user.setName("Catalina Silva");
		user.setPassword("123456");
		user.setUsername("catalinasilva");
		user.setUserstatus(UserStatus.ACTIVE);
		
		/*Profile profile = new Profile();
		profile.setName("Profile Name");
		profile.setDescription("Profile description");
		profile.setPermission("Profile permission");
		ProfileDAO profileDAO = new ProfileDAO(em);
		profileDAO.add(profile);
		user.setProfiles(profile);*/
		
		/*Role role = new Role();
		role.setName("Role Name");
		RoleDAO roleDAO = new RoleDAO(em);
		roleDAO.add(role);
		user.setRoles(role);*/
		
		userDAO.add(user);
		em.getTransaction().commit();
		
		System.out.println("ID gerado: " + user.getId());
		
		em.close();

	}

}
