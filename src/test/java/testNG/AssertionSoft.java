package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoft {
	
	
WebDriver w;
	
	@Test
	
	public void frounaccounting() throws Exception {
		w = new ChromeDriver();
		SoftAssert asr = new SoftAssert();
		w.get("https://demo.frontaccounting.eu/index.php");
		w.findElement(By.name("SubmitUser")).click();
		Thread.sleep(1000);
		asr.assertEquals(w.getTitle(), "Main Men");
		w.findElement(By.linkText("Logout")).click();
		asr.assertAll();
	}

}
