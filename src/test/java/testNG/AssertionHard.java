package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionHard {
	
	WebDriver w;
	
	@Test
	
	public void frounaccounting() throws Exception {
		w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/index.php");
		w.findElement(By.name("SubmitUser")).click();
		Thread.sleep(1000);
		Assert.assertEquals(w.getTitle(), "Main Men");
		w.findElement(By.linkText("Logout")).click();
	}

}
