package br.com.scrumtaskboard.model.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String description;
	private String sponsor;
	private Calendar startDate;
	private Calendar endDate;
	
	@Enumerated(EnumType.STRING)
	private ProjectStatus projectStatus;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Role> roles = new ArrayList<Role>();
	
	@OneToMany(mappedBy = "project")
	private List<Issue> issues = new ArrayList<Issue>();
	
	@OneToMany(mappedBy = "project")
	private List<Sprint> sprints = new ArrayList<Sprint>();
	
//	@OneToMany(mappedBy = "sprint")
//	private List<UserStory> userStories = new ArrayList<UserStory>();
//	
//	@OneToMany(mappedBy = "sprint")
//	private List<Task> tasks = new ArrayList<Task>();
//	
//	@OneToMany(mappedBy = "sprint")
//	private List<Bug> bugs = new ArrayList<Bug>();
	
	public List<Issue> getIssues() {
		return issues;
	}
	
	public void setIssues(List<Issue> issues) {
		this.issues = issues;
	}
	
	public List<Sprint> getSprints() {
		return sprints;
	}
	
	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setProjectStatus(ProjectStatus projectStatus) {
		this.projectStatus = projectStatus;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getSponsor() {
		return sponsor;
	}
	
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	
	public Calendar getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	
	public Calendar getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	
	public ProjectStatus getProjectStatus() {
		return projectStatus;
	}
	
	public void setStatus(ProjectStatus projectStatus) {
		this.projectStatus = projectStatus;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

//	public List<UserStory> getUserStories() {
//		return userStories;
//	}
//
//	public void setUserStories(List<UserStory> userStories) {
//		this.userStories = userStories;
//	}
//
//	public List<Task> getTasks() {
//		return tasks;
//	}
//
//	public void setTasks(List<Task> tasks) {
//		this.tasks = tasks;
//	}
//
//	public List<Bug> getBugs() {
//		return bugs;
//	}
//
//	public void setBugs(List<Bug> bugs) {
//		this.bugs = bugs;
//	}
	
}
