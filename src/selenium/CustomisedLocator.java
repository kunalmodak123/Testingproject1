package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedLocator {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.get("https://www.amazon.in/");
		Thread.sleep(2000);
		w.manage().window().maximize();
		w.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("watch"); //1).TagName#ID value
		Thread.sleep(2000);
		w.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=EG92EZ88YM9KVRJ3RCWM&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		w.findElement(By.cssSelector("input.a-input-text.a-span12.a-spacing-micro.auth-required-field.auth-require-phone-validation")).sendKeys("8657426428");//2).TagName.className value
		Thread.sleep(2000);
		//w.findElement(By.cssSelector("input[autocomplete=\"new-password\"]")).sendKeys("123");//3).TagName[Attribute=Value of that Attribute]
	
		w.findElement(By.cssSelector("input[placeholder=\"At least 6 characters\"]")).sendKeys("456");
	}

}




//Three Types of Customized locator-->1).TagName#ID value
//2).TagName.className value-->Replace space with dot
//3).TagName[Attribute=Value of that Attribute]