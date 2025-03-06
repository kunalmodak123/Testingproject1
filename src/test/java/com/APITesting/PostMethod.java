package com.APITesting;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostMethod {
	
	@Test
	public void RestPost() {
		HashMap map1 = new HashMap();
		map1.put("year", 2024);
		map1.put("price", 45000);
		map1.put("CPU model", "tensor");
		map1.put("Hard disk size", "256 GB");
		
		HashMap map2 = new HashMap();
		
		map2.put("name", "Google Pixel 4");
		map2.put("data", map1);
		
		RestAssured.given().contentType("application/json").body(map2)
		.when().post("https://api.restful-api.dev/objects")
		.then().log().all();
		
		//ff808181932badb601938bd82a9c7c22
	}

}
