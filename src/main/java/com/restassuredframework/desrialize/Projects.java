package com.restassuredframework.desrialize;

public class Projects {
	
	private String projectId;
	
	private String projectName;
	
	private Integer teamSize;
	
	private String createdBy;
	
	private String createdOn;
	
	private String status;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Projects{" +
				"projectId='" + projectId + '\'' +
				", projectName='" + projectName + '\'' +
				", teamSize=" + teamSize +
				", createdBy='" + createdBy + '\'' +
				", createdOn='" + createdOn + '\'' +
				", status='" + status + '\'' +
				'}';
	}
}
