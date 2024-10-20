package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://www.httpwatch.com/httpgallery/authentication/");
		
		w.findElement(By.id("displayImage")).click();
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("D:\\Selenium\\Authentication.exe");

	}

}
