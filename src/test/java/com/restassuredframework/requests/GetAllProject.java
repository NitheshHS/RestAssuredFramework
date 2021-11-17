package com.restassuredframework.requests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import com.restapi.base.APIBaseClass;
import static com.restapi.base.TestAPIEnvironment.*;
import com.restapi.request.util.RequestUtil;
import com.restassuredframework.desrialize.Projects;

import io.restassured.response.Response;
import static com.restapi.request.util.ResponseUtil.*;

public class GetAllProject extends APIBaseClass{

	@Epic("RMG-1")
	@Story("RMG-10")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify using /projects endpoint able to get complete project or not")
	@Test
	public void getAllProjectTest() {
		Response response = getLastResponse(RequestUtil.getAllProject(getBaseUri()+getGetAllProject()));
		Projects[] projects = response.getBody().as(Projects[].class);
		for(Projects project:projects) {
			System.out.println(project.getProjectId());
			System.out.println(project.getProjectName());
			System.out.print(project.getCreatedBy());
			System.out.println(project.getCreatedOn());
			System.out.println(project.getStatus());
			System.out.println(project.getTeamSize());
		}
		System.out.println(getResponseTime());
		System.out.println(getStatusCode());
		//response.then().log().all();
	}

}
