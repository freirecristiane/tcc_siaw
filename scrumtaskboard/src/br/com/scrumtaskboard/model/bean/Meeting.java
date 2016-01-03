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
import javax.persistence.ManyToOne;

@Entity
public abstract class Meeting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
		
	@Enumerated(EnumType.STRING)
	private MeetingType meetingType;
	
	private Calendar date;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<User> attendants = new ArrayList<User>();
	
	@ManyToOne
	private Sprint sprint;
	
	private String comment;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public MeetingType getMeetingType() {
		return meetingType;
	}

	public void setMeetingType(MeetingType meetingType) {
		this.meetingType = meetingType;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Sprint getSprint() {
		return sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<User> getAttendants() {
		return attendants;
	}

	public void setAttendants(List<User> attendants) {
		this.attendants = attendants;
	}
	
	
	
	
}
