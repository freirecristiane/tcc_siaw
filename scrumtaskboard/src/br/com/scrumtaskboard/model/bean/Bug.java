package br.com.scrumtaskboard.model.bean;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Bug extends Issue{
	
	private String affectedVersion;
	private String environment;
	private String fixVersion;
	
	@ManyToOne
	private User assignee;
	
	@ManyToOne
	private UserStory userStory;
	
	public String getAffectedVersion() {
		return affectedVersion;
	}

	public void setAffectedVersion(String affectedVersion) {
		this.affectedVersion = affectedVersion;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getFixVersion() {
		return fixVersion;
	}

	public void setFixVersion(String fixVersion) {
		this.fixVersion = fixVersion;
	}

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
