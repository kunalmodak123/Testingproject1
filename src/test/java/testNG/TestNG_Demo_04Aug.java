package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TestNG_Demo_04Aug {
	
	//@Test (priority = 1,enabled = false) //priority to set the order and enabled = false to not run the case
	@Test
	private void google() throws Exception 
	{
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com/");
		w.findElement(By.id("APjFqb")).sendKeys("watch",Keys.ENTER);
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\KUNAL\\eclipse-workspace\\AdvancedAutomation\\src\\test\\resource\\img1.png"));
	}
	
	//@Test (priority = 2)
	@Test
	private void facebook() throws Exception 
	{
		WebDriver w = new FirefoxDriver();
		w.get("https://www.facebook.com/");
		w.findElement(By.id("email")).sendKeys("kunal@mail.com");
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\KUNAL\\eclipse-workspace\\AdvancedAutomation\\src\\test\\resources//src2.png"));
	}
	

}
