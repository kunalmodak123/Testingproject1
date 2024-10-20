package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterfaceDisplay_Task {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/signup");
		//w.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("kunal@gmail.com");
		Thread.sleep(2000);	
		boolean display = w.findElement(By.name("reg_email_confirmation__")).isDisplayed();
		
		if (display) 
		{
			System.out.println("Email element is displayed");	
		} 
		else 
		{
			System.out.println("Email element is not displayed");
		}
	}
}
