package br.com.scrumtaskboard.model.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

@Entity
public class Review extends Meeting {

	@ManyToMany(fetch = FetchType.EAGER)
	private List<UserStory> userStories = new ArrayList<UserStory>();

	public List<UserStory> getUserStories() {
		return userStories;
	}
	
	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}

}
