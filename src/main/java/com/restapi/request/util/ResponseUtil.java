package com.restapi.request.util;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.util.concurrent.TimeUnit;

public class ResponseUtil {
    public static Response response;
    public static Response getLastResponse(Response response){
        ResponseUtil.response=response;
        return response;
    }

    public static int getStatusCode(){
        return response.getStatusCode();
    }

    public static String getJsonValue(String jsonpath){
      return response.getBody().jsonPath().get(jsonpath);
    }

    public static Long getResponseTime(){
        return response.getTimeIn(TimeUnit.MILLISECONDS);
    }

    public static String getHeader(String headerName){
       return response.getHeader(headerName);
    }

    public static ValidatableResponse getLogFromResponse(){
       return response.then().log().all();
    }

}
