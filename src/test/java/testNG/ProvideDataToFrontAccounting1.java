package testNG;

import org.testng.annotations.DataProvider;

public class ProvideDataToFrontAccounting1 {
	
	@DataProvider
	public Object getdata() {
		
		Object data[][] = new Object[4][2];
		data[0][0] = "demouser";
		data[0][1] = "password";
		
		data[1][0] = "demouser1";
		data[1][1] = "password1";
		
		data[2][0] = "demouser2";
		data[2][1] = "password2";
		
		data[3][0] = "demouser3";
		data[3][1] = "password3";
		
		return data;		
	}
	
	@DataProvider
	public Object search() {
		
		Object data[] = new Object[4];
		data[0] = "watch";
		data[1] = "smartphone";
		data[2] = "sunglasses";
		data[3] = "shoes";
		
		return data;
		
	}
	
	
	
	@DataProvider
	public Object loginData() {
		
		Object loginData[][] = new Object[4][2];
		
		loginData[0][0] = "standard_user";
		loginData[0][1] = "secret_sauce";
		
		loginData[1][0] = "locked_out_user";
		loginData[1][1] = "secret_sauce";
		
		loginData[2][0] = "problem_user";
		loginData[2][1] = "secret_sauce";
		
		loginData[3][0] = "performance_glitch_user";
		loginData[3][1] = "secret_sauce";
		
		return loginData;
		
	}
}
