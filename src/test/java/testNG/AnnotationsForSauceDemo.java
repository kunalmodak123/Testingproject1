package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsForSauceDemo {
// before method and after method it can execute everytime when your condition is present
	WebDriver w;
	
    @BeforeMethod  // Pre condition  Before method execute before condition start there execution
    public void login() throws Exception {
    
    	w = new ChromeDriver();
    	w.get("https://www.saucedemo.com/");
    	Thread.sleep(2000);
    	w.findElement(By.id("user-name")).sendKeys("standard_user");
    	Thread.sleep(2000);
    	w.findElement(By.id("password")).sendKeys("secret_sauce");
    	Thread.sleep(2000);
    	w.findElement(By.id("login-button")).click();    	
    }
	
	@Test    //condition
	public void Product1() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void Product2() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod  // After one condition execution is done it start to execute himself
	public void logout() throws Exception {
		w.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		w.findElement(By.partialLinkText("Logout")).click();
		Thread.sleep(2000);
		w.close();
	}
}

