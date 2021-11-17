package com.restapi.serialize;

public class Project {
    private String createdBy;
    private String projectName;
    private String status;
    private Integer teamSize;

    public Project(String createdBy, String projectName, String status, Integer teamSize) {
        this.createdBy = createdBy;
        this.projectName = projectName;
        this.status = status;
        this.teamSize = teamSize;
    }

    public Project() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }
}
