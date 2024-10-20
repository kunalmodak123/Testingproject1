package logger4jDemo;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccounting_Log4j {

	public static void main(String[] args) {
		
		Logger log = LogManager.getFormatterLogger();
		
		try {
			WebDriver w = new ChromeDriver();
			log.info("Browser has been launch");
			String user = "demouser";
			String pass = "password";
			w.get("https://demo.frontaccounting.eu/index.php");
			log.info("Browser has been redirected to Front Accounting site");
			w.findElement(By.name("user_name_entry_field")).clear();
			log.info("Username field data has been clear");
			w.findElement(By.name("user_name_entry_field")).sendKeys(user);
			log.info(user+" value has been added in Username field");
			w.findElement(By.name("password")).clear();
			log.info("Password field data has been clear");
			w.findElement(By.name("password")).sendKeys(pass);
			log.info(pass+" value has been added in Password field");
			w.findElement(By.name("SubmitUser")).click();
			log.info("User click on Login button");
			w.findElement(By.linkText("Logout")).click();
			log.info("User click on Logout button");
			
		} catch (Exception e) {
			
		log.info("User unable to login");
		}
	}

}
