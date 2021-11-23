package com.restapi.base;

public class TestAPIEnvironment {

	private static final String BASE_URI="http://localhost:8085";
	private static final String GET_ALL_PROJECT="/projects";
	private static final String GET_SINGLE_PROJECT="/projects/{projectId}";
	private static final String CREATE_PROJECT="/addProject";
	private static final String UPDATE_PROJECT="/projects/{projectId}";
	private static final String DELETE_PROJECT="/projects/{projectId}";
	public static String getBaseUri() {
		return BASE_URI;
	}
	public static String getGetAllProject() {
		return GET_ALL_PROJECT;
	}
	public static String getGetSingleProject() {
		return GET_SINGLE_PROJECT;
	}
	public static String getCreateProject() {
		return CREATE_PROJECT;
	}
	public static String getUpdateProject() {
		return UPDATE_PROJECT;
	}
	public static String getDeleteProject() {
		return DELETE_PROJECT;
	}



}
