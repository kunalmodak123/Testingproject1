package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartPriceValidation {
	
	@Test
	
	public void price() {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		w.findElement(By.name("q")).sendKeys("iphone 15" , Keys.ENTER);
		
		String actprice = w.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[2]/div[1]/div[1]/div[1]")).getText();
		String expprice = "₹60,500";
		
		Assert.assertEquals(actprice, expprice);
		
	}

}
