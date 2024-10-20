package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomisedReport {
	
	@Test(dataProviderClass = ProvideDataToFrontAccounting1.class, dataProvider = "loginData")
	
	public void login(String user, String pass) {
		
		WebDriver w = new ChromeDriver();
		Reporter.log("Browser has been launch successful.");
		w.get("https://www.saucedemo.com/");
		Reporter.log("Browser has redirect to saucedemo web page.");
		w.findElement(By.id("user-name")).sendKeys(user);
		Reporter.log("User has enter "+user+" has a username.");
		w.findElement(By.id("password")).sendKeys(pass);
		Reporter.log("User has enter "+pass+" has a password.");
		w.findElement(By.id("login-button")).click();
		Reporter.log("User has click on login button.");
		
		try {
			w.findElement(By.xpath("//*[@class=\"bm-burger-button\"]/button")).click();
			Reporter.log("User has click on open menu button.");
			Thread.sleep(2000);
			w.findElement(By.linkText("Logout")).click();
			Reporter.log("User has been logout successful.");
		} catch (Exception e) {
			Reporter.log("User not able to login by using "+user+" "+pass);			
		}
	}
	

}
