package br.com.scrumtaskboard.model.bean;

import java.util.ArrayList;
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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String email;
	private String username;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private UserStatus userstatus;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Profile> profiles = new ArrayList<Profile>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Role> roles = new ArrayList<Role>();
	
	@OneToMany(mappedBy = "assignee")
	private List<Task> tasks = new ArrayList<Task>();
	
	@OneToMany(mappedBy = "assignee")
	private List<Bug> bugs = new ArrayList<Bug>();
	
	@ManyToMany(mappedBy = "attendants")
	private List<Meeting> meetings = new ArrayList<Meeting>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserStatus getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(UserStatus userstatus) {
		this.userstatus = userstatus;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public List<Bug> getBugs() {
		return bugs;
	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Meeting> getMeetings() {
		return meetings;
	}
}
