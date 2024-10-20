package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalLocator_19May {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.amazon.in/");
		Thread.sleep(2000);
		w.manage().window().maximize();
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		Thread.sleep(2000);
		w.findElement(By.className("nav-input")).sendKeys(" and shoes");
		Thread.sleep(2000);
		//w.findElement(By.name("field-keywords")).clear();
		
		w.findElement(By.id("nav-search-submit-button")).click();

	}

}
