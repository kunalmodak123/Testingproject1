package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsForFrontAccounting_Task {
	
	WebDriver w;
	
	@BeforeClass
	public void openBrowser() {
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://demo.frontaccounting.eu/index.php");		
	}
	
	@BeforeMethod
	public void login() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.name("SubmitUser")).click();	
	}
	
	@Test (priority=1)
	public void SalesQuotation() throws Exception {
		w.findElement(By.linkText("Sales Quotation Entry")).click();
		Thread.sleep(2000);
		w.findElement(By.id("CancelOrder")).click();
		Thread.sleep(2000);
		Alert alt = w.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
	}
	
	@Test (priority=2)
	public void SalesOrder() throws Exception {
		w.findElement(By.linkText("Sales Order Entry")).click();
		Thread.sleep(2000);
		w.findElement(By.id("CancelOrder")).click();
		Thread.sleep(2000);
		Alert alt = w.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logout() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.linkText("Logout")).click();	
		Thread.sleep(2000);
		w.findElement(By.linkText("Click here to Login Again.")).click();
		Thread.sleep(2000);		
	}
	
	@AfterClass
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		w.close();
	}

}
