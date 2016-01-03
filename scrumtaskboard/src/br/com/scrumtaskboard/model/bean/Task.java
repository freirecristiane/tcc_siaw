package br.com.scrumtaskboard.model.bean;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Task extends Issue {

	@ManyToOne
	private User assignee;
	
	@ManyToOne
	private UserStory userStory;
	
	public User getAssignee() {
		return assignee;
	}
	
	public void setAssignee(User assignee) {
		this.assignee = assignee;
	}
	
	public UserStory getUserStory() {
		return userStory;
	}
	
	public void setUserStory(UserStory userStory) {
		this.userStory = userStory;
	}

}
