package br.com.scrumtaskboard.model.bean;

import javax.persistence.Entity;

@Entity
public class Retrospective extends Meeting {

	private String event;
	private String www;
	private String wcbi;
	private String actionPoint;
	
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	
	public String getWww() {
		return www;
	}
	
	public void setWww(String www) {
		this.www = www;
	}
	
	public String getWcbi() {
		return wcbi;
	}
	
	public void setWcbi(String wcbi) {
		this.wcbi = wcbi;
	}
	
	public String getActionPoint() {
		return actionPoint;
	}
	
	public void setActionPoint(String actionPoint) {
		this.actionPoint = actionPoint;
	}
	
}
