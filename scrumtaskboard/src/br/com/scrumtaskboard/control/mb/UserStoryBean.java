package br.com.scrumtaskboard.control.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.scrumtaskboard.model.bean.IssueStatus;
import br.com.scrumtaskboard.model.bean.IssueType;
import br.com.scrumtaskboard.model.bean.Priority;
import br.com.scrumtaskboard.model.bean.UserStory;
import br.com.scrumtaskboard.model.dao.DAO;

@ViewScoped
@ManagedBean
public class UserStoryBean {

	private UserStory userStory = new UserStory();
	private List<UserStory> userStories;
	private List<IssueType> issueTypes;
	private List<Priority> priorities;
	private List<IssueStatus> issueStatuses;
	
	public UserStory getUserStory(){
		return userStory;
	}
	
	public void save(){
		DAO<UserStory> dao = new DAO<UserStory>(UserStory.class);
		
		if (userStory.getId() == null) {
			dao.add(userStory);
		} else {
			dao.update(userStory);
		}
		
		this.userStory = new UserStory();
		this.userStories = dao.listAll();
	}
	
	@PostConstruct
	public void loadUserStories(){
		userStories = new DAO<UserStory>(UserStory.class).listAll();
	}
	
	public List<UserStory> getUserStories(){
		return userStories;
	}
	
	public void delete(){
		DAO<UserStory> dao = new DAO<UserStory>(UserStory.class);
		dao.delete(this.userStory);
		this.userStory = new UserStory();
	}
	
	public void setUserStory(UserStory userStory){
		this.userStory = userStory;
	}
	
	public List<IssueType> getIssueTypes(){
		if(issueTypes == null || issueTypes.isEmpty()){
			issueTypes = new ArrayList<IssueType>();
			
			for (IssueType it : IssueType.values()) {
				issueTypes.add(it);
			}
		}
		
		return issueTypes;
	}
	
	public List<Priority> getPriorities(){
		if (priorities == null || priorities.isEmpty()) {
			priorities = new ArrayList<Priority>();
			
			for (Priority p : Priority.values()) {
				priorities.add(p);
			}
		}
		
		return priorities;
	}
	
	public List<IssueStatus> getIssueStatuses(){
		if (issueStatuses == null || issueStatuses.isEmpty()) {
			issueStatuses = new ArrayList<IssueStatus>();
			
			for (IssueStatus is : IssueStatus.values()) {
				issueStatuses.add(is);
			}
		}
		
		return issueStatuses;
	}
}
