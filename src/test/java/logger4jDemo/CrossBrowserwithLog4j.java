package logger4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserwithLog4j {

	    Logger log;
	    WebDriver w;
		
		@BeforeClass
		public void logger() {
			log = LogManager.getFormatterLogger();
		}
		
		@Parameters("browser") // it is nothing but an annotation which pass value from testng.xml parameter value to an method also it help to identify where to pass that parameter xml value.
		@BeforeMethod
		public void OpenBrowser(String browser) {
			if (browser.equals("chrome")) 
			{
				w = new ChromeDriver();	
				log.info("Chrome browser has been launch");
			} else if (browser.equals("firefox")) 
			{
				w = new FirefoxDriver();
				log.info("Forefox browser has been launch");
			}else if (browser.equals("edge")) 
			{
				w = new EdgeDriver();
				log.info("Edge browser has been launch");
			}
			w.get("https://demo.frontaccounting.eu/index.php");
			log.info("Browser has been redirected to Front Accounting site");
		}
		
		@Test
		public void login() {
			w.findElement(By.name("SubmitUser")).click();
			log.info("Click on login button");
		}
		
		@AfterMethod
		public void logout() {
			w.findElement(By.linkText("Logout")).click();
			log.info("Click on logout button");
		}

	}


