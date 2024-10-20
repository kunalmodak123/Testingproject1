package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingGrid_Standalone {
	
	DesiredCapabilities dc;
	RemoteWebDriver w;
	
	@Parameters("browser") // it is nothing but an annotation which pass value from testng.xml parameter value to an method also it help to identify where to pass that parameter xml value.
	@BeforeMethod
	public void OpenBrowser(String browser) {
		if (browser.equals("chrome")) 
		{
			dc = new DesiredCapabilities();
			dc.setPlatform(Platform.WINDOWS);
			dc.setBrowserName("chrome");
			w = new RemoteWebDriver(dc);			
		} else if (browser.equals("firefox")) 
		{
			dc = new DesiredCapabilities();
			dc.setPlatform(Platform.WINDOWS);
			dc.setBrowserName("firefox");
			w = new RemoteWebDriver(dc);			
		}else if (browser.equals("edge")) 
		{
			dc = new DesiredCapabilities();
			dc.setPlatform(Platform.WINDOWS);
			dc.setBrowserName("MicrosoftEdge");
			w = new RemoteWebDriver(dc);		
		}
		w.get("https://demo.frontaccounting.eu/index.php");		
	}
	
	@Test
	public void login() {
		w.findElement(By.name("SubmitUser")).click();
	}
	
	@AfterMethod
	public void logout() {
		w.findElement(By.linkText("Logout")).click();		
	}

}
