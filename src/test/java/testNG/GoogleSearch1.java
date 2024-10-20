package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch1 {
	
	@Test (dataProviderClass = ProvideDataToFrontAccounting1.class, dataProvider = "search")
	public void google(String search) throws Exception{
		WebDriver w;
		w = new ChromeDriver();
		w.get("https://www.google.com/");
		Thread.sleep(2000);
		w.findElement(By.id("APjFqb")).sendKeys(search,Keys.ENTER);
		Thread.sleep(2000);
	}

}
