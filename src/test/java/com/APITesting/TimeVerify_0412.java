package com.APITesting;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TimeVerify_0412
{
@Test
public void time()
{
	Response res = RestAssured.given().when().get("https://api.restful-api.dev/objects/7");
	
	long time = res.getTime();
	System.out.println(time + " Milisecond");
	res.then().time(Matchers.lessThanOrEqualTo(2000L));
}
}
