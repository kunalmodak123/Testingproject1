package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipkartGridStandalone_Practise {
	
	DesiredCapabilities dc;
	RemoteWebDriver w;
	
	@Parameters("browser")
	@BeforeMethod
	public void openbrowser(String browser) {
		if(browser.equals("chrome"))
		{
			dc = new DesiredCapabilities();
			dc.setPlatform(Platform.WINDOWS);
			dc.setBrowserName("chrome");
			w = new RemoteWebDriver(dc);
		}else if (browser.equals("edge")) 
		{
			dc = new DesiredCapabilities();
			dc.setPlatform(Platform.WINDOWS);
			dc.setBrowserName("MicrosoftEdge");
			w = new RemoteWebDriver(dc);		
		}
		w.get("https://www.flipkart.com/");
	}
	
	@Test
	public void search() {
		w.findElement(By.name("q")).sendKeys("watch" , Keys.ENTER);
	}
	
	@AfterMethod
	public void close() {
		w.close();
	}
	
	
	
	
	
}