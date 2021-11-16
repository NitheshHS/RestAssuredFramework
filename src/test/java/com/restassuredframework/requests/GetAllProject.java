package com.restassuredframework.requests;

import org.testng.annotations.Test;

import com.restapi.base.APIBaseClass;
import static com.restapi.base.TestAPIEnvironment.*;
import com.restapi.request.util.RequestUtil;
import com.restassuredframework.desrialize.Projects;

import io.restassured.response.Response;

public class GetAllProject extends APIBaseClass{
	
	@Test
	public void getAllProjectTest() {
		Response response = RequestUtil.getAllProject(getBaseUri()+getGetAllProject());
		Projects[] projects = response.getBody().as(Projects[].class);
		for(Projects project:projects) {
			System.out.println(project.getProjectId());
			System.out.println(project.getProjectName());
			System.out.print(project.getCreatedBy());
			System.out.println(project.getCreatedOn());
			System.out.println(project.getStatus());
			System.out.println(project.getTeamSize());
		}
		//response.then().log().all();
	}

}
