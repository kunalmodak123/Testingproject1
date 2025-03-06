package com.APITesting;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutMethod {
	
	@Test
	public void Update() 
	{
		HashMap map = new HashMap();
		map.put("year", 2022);
		map.put("price", 30000);
		map.put("CPU model", "Tensor");
		map.put("Hard disk size", "512 GB");
		map.put("color", "Neon Blue");
		
		HashMap map2 = new HashMap();
		map2.put("name", "Google Pixel 6");
		map2.put("data", map);
		
		RestAssured.given().contentType("application/json").body(map2)
		.when().put("https://api.restful-api.dev/objects/ff808181932badb60193f7f68a452327")
		.then().log().all();
		
		
	}

}
