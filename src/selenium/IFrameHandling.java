package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		//w.switchTo().frame("iframe-name");
		w.switchTo().frame(w.findElement(By.xpath("/html/body/div[5]/fieldset/iframe")));
		Thread.sleep(2000);
		w.findElement(By.linkText("Mentorship")).click();
		//w.switchTo().parentFrame();
		w.switchTo().defaultContent();
		w.findElement(By.name("show-hide")).sendKeys("Kunal");
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
