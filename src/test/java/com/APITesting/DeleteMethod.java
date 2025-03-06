package com.APITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteMethod {
	
	@Test
	public void Deletedata() {
		
		RestAssured.given()
		.when().delete("https://api.restful-api.dev/objects/ff808181932badb601938bd82a9c7c22")
		.then().log().all();
	}

}
