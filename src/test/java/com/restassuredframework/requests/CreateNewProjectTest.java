package com.restassuredframework.requests;

import static com.restapi.base.TestAPIEnvironment.*;

import com.restapi.base.APIBaseClass;
import com.restapi.base.DataBaseUtility;
import com.restapi.request.util.RequestUtil;

import static com.restapi.request.util.ResponseUtil.*;
import com.restapi.serialize.Project;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateNewProjectTest extends APIBaseClass {

    @Epic("RMG-1")
    @Story("RMG-11")
    @Severity(SeverityLevel.BLOCKER)
    @Description("creating new project with /addProject endpoint")
    @Test
    public void addDuplicateProjectTest(){
        Project project = new Project("Nithesh", "APIFramework", "completed", 1);
        Response response =getLastResponse(RequestUtil.createNewProject(project, getBaseUri() + getCreateProject()));
        getLogFromResponse();
        boolean projectIsExist=DataBaseUtility.executeQuery("select * from project","project_name",project.getProjectName());
        Assert.assertTrue(projectIsExist);

    }
}
