package com.APITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StatusCodeVerification {
	
	@Test
	private void statuscode() {
		
		Response res = RestAssured.given().when().get("https://api.restful-api.dev/objects/7");
		
		int statuscode = res.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		
		
		

	}

}
