package com.restapi.request.util;

import com.restapi.base.LoggerClass;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RequestUtil 
{

	@Step("authenticated with {userName} and {password} and sending request to {URL}")
	public static Response getAllProject(String userName, String password,String URL) {
		LoggerClass.getLogger().info("username: "+userName+" password: "+password+""
				+ " URL: "+URL);
		Response response= RestAssured.given()
				.contentType(ContentType.JSON)
				.auth().basic(userName, password)
				.when()
				.get(URL);

		return response;
	}

	@Step(value = "Sending request to {URL} to get all project")
	public static Response getAllProject(String URL) {
		LoggerClass.getLogger().info("URL: "+URL);
		Response response=RestAssured.given()
				.get(URL);
		return response;
	}

	@Step("authenticated with username {username} and password {password} payload: {body} url: {URL}")
	public static Response createNewProject(String username, String password,Object body,String URL) {
		LoggerClass.getLogger().info("username: "+username+" password: "+password+" Payload: "+body+""
				+ " URL: "+URL);
		Response response=RestAssured.given()
			.contentType(ContentType.JSON)
			.auth().basic(username, password)
			.body(body)
			.when()
			.post(URL);
		return response;
	}

	@Step("Payload: {body} Url: {URL}")
	public static Response createNewProject(Object body,String URL) {
		LoggerClass.getLogger().info("Payload: "+body+" URL: "+URL);
		Response response=RestAssured.given()
			.contentType(ContentType.JSON)
			.body(body)
			.when()
			.post(URL);
		return response;
	}
	
	public static Response updateProject(Object body,String URL,String projectId) {
		LoggerClass.getLogger().info("Payload: "+body+" URL: "+URL+" projectId: "+projectId);
		Response response=RestAssured.given()
			.contentType(ContentType.JSON)
			.pathParam("projectId", projectId)
			.body(body)
			.when()
			.patch(URL);
		return response;
	}
	
	public static Response updateProject(String userName, String password,Object body,String URL,String projectId) {
		LoggerClass.getLogger().info("username: "+userName+" password: "+password+" Payload: "+body.toString()+""
				+ " URL: "+URL);
		Response response=RestAssured.given()
			.contentType(ContentType.JSON)
			.pathParam("projectId", projectId)
			.auth().basic(userName, password)
			.body(body)
			.when()
			.patch(URL);
		return response;
	}
	
	public static Response deleteProject(String URL, String projectId) {
		LoggerClass.getLogger().info("URL: "+URL+" projectId: "+projectId);
		Response response = RestAssured.given()
			.contentType(ContentType.JSON)
			.pathParam("projectId", projectId)
			.when()
			.delete(URL);
		return response;
			
	}

}
