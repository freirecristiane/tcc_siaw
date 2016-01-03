package br.com.scrumtaskboard.model.bean;

public enum UserStatus {
	
	ACTIVE("Active"),
	INACTIVE("Inactive");
	
	private String label;

    private UserStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
