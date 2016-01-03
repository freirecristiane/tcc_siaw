package br.com.scrumtaskboard.model.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class UserStory extends Issue {
	
	private int storyPoint;
	
	@ManyToMany(mappedBy = "userStories")
	private List<Planning> plannings = new ArrayList<Planning>();
	
	@ManyToMany(mappedBy = "userStories")
	private List<Review> reviews = new ArrayList<Review>();
	
	@OneToMany(mappedBy = "userStory")
	private List<Task> tasks = new ArrayList<Task>();
	
	@OneToMany(mappedBy = "userStory")
	private List<Bug> bugs = new ArrayList<Bug>();
	
	public int getStoryPoint() {
		return storyPoint;
	}

	public void setStoryPoint(int storyPoint) {
		this.storyPoint = storyPoint;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Bug> getBugs() {
		return bugs;
	}

	public void setBugs(List<Bug> bugs) {
		this.bugs = bugs;
	}

	public List<Planning> getPlannings() {
		return plannings;
	}

	public void setPlannings(List<Planning> plannings) {
		this.plannings = plannings;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
