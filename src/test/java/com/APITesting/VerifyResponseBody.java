package com.APITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class VerifyResponseBody {

	@Test
	public void bodycheck() {
		Response res = RestAssured.given().when().get("https://api.restful-api.dev/objects/7");
		String body = res.asPrettyString();
		System.out.println(body);
		//Assert.assertEquals(body.contains("Apple MacBook Pro 16"), true);
		
		
		if (body.contains("Apple MacBook Pro 16")) {
			System.out.println("Contain found in string");
		} else {
			System.out.println("Contain not found in string");
		}
		
	}
	
}
