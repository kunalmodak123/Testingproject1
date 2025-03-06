package com.APITesting;

import org.testng.annotations.Test;

import io.cucumber.java.it.Data;
import io.restassured.RestAssured;
import org.hamcrest.Matcher;

public class GetMethod {
	
	@Test
	public void ReqResGet()
	{
		RestAssured.given()
		.when().get("https://reqres.in/api/users/2") 
		.then().log().all();
		//.then().statusCode(200);
	}
	
}
//all-->> for header and body response
//body-->>only for body
//header-->>only for header
