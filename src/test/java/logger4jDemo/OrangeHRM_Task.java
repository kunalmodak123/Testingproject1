package logger4jDemo;

import java.time.Duration;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_Task {

	public static void main(String[] args) {
		
		Logger log = LogManager.getFormatterLogger();
		try {
			WebDriver w = new ChromeDriver();
			log.info("Browser has been launch");
			String user = "Admin";
			String pass = "admin123";
			w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			log.info("Browser has been redirected to Orange HRM site");
			w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			w.findElement(By.name("username")).sendKeys(user);
			log.info(user+" value has been added in Username field");
			w.findElement(By.name("password")).sendKeys(pass);
			log.info(pass+" value has been added in Password field");
			w.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			log.info("User click on Login button");
			
			w.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			w.findElement(By.linkText("Logout")).click();
			log.info("User click on Logout button");
			
		} catch (Exception e) {
			
			log.info("User unable to login");
		}

	}

}
