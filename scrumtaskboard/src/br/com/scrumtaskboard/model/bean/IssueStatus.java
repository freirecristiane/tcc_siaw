package br.com.scrumtaskboard.model.bean;

public enum IssueStatus {
	
	TO_DO("To Do"),
	IN_PROGRESS("In Progress"),
	DONE("Done");
	
	private String label;
	
	private IssueStatus(String label){
		this.label = label;
	}
	
	public String getLabel(){
		return label;
	}
}
