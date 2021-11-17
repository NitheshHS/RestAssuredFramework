package com.restassuredframework.requests;

import static com.restapi.base.TestAPIEnvironment.*;

import com.restapi.request.util.RequestUtil;

import static com.restapi.request.util.ResponseUtil.*;
import com.restapi.serialize.Project;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class CreateNewProjectTest {

    @Epic("RMG-1")
    @Story("RMG-11")
    @Severity(SeverityLevel.BLOCKER)
    @Description("creating new project with /addProject endpoint")
    @Test
    public void createNewProjectTest(){
        Project project = new Project("Nithesh", "RestAPIFramework", "OnGoing", 1);
        Response response =getLastResponse(RequestUtil.createNewProject(project, getBaseUri() + getCreateProject()));
        getLogFromResponse();


    }
}
