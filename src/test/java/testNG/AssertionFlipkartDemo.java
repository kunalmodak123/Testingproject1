package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionFlipkartDemo {
	
	WebDriver w;
	
	@Test
	
	public void Flipkart() {
		
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		w.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		
		//Hard Assertion
//		String exptitle = "Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
//		String acttitle = w.getTitle();
//		Assert.assertEquals(acttitle, exptitle);
//		
//		String expurl = "https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off";
//		String acturl = w.getCurrentUrl();
//		Assert.assertEquals(expurl, acturl);
		
		//Soft Assertion
		SoftAssert soft = new SoftAssert();
		String exptitle = "Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		String acttitle = w.getTitle();
		soft.assertEquals(acttitle, exptitle);
		
		String expurl = "https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off";
		String acturl = w.getCurrentUrl();
		soft.assertEquals(expurl, acturl);
		soft.assertAll();
	}
		
	}


