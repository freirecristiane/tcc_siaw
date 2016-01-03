package br.com.scrumtaskboard.model.bean;

public enum IssueType {
	
	USER_STORY("User Story"),
	TASK("Task"),
	BUG("Bug");
	
	private String label;

    private IssueType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
