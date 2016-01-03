package br.com.scrumtaskboard.model.bean;

public enum Priority {
	
	HIGHEST("Highest", 1),
	HIGH("High", 2),
	MEDIUM("Medium", 3),
	LOW("Low", 4),
	LOWEST("Lowest", 5);
	
	private String label;
	private int value;
	
	private Priority(String label, int value){
		this.label = label;
		this.value = value;
	}
	
	public String getLabel(){
		return label;
	}
	
	public int getValue(){
		return value;
	}
}
