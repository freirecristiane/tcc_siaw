	package br.com.scrumtaskboard.model.bean;

public enum ProjectStatus {
	ACTIVE("Active"),
	FINISHED("Finished"),
	CANCELLED("Cancelled");
	
	private String label;
	
	private ProjectStatus(String label){
		this.label = label;
	}
	
	public String getLabel(){
		return label;
	}
}
