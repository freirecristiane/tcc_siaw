package br.com.scrumtaskboard.model.bean;

public enum MeetingType {
	
	PLANNING("Planning"),
	REVIEW("Review"),
	RETROSPECTIVE("Retrospective");
	
	private String label;

    private MeetingType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
