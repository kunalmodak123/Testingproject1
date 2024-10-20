package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		w.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
//		w.findElement(By.name("q")).sendKeys("iphone");
//		w.findElement(By.name("q")).submit();
		Thread.sleep(2000);
		w.findElement(By.partialLinkText("Apple iPhone 14 Plus (Starlight, 128 GB)")).click();
		
		String parentwinidow = w.getWindowHandle();
		System.out.println("parent window "+parentwinidow);
		Set<String> multiwondow = w.getWindowHandles();
		System.out.println("multi wondow "+multiwondow);
		
		for (String child : multiwondow) 
		{
			if (!parentwinidow.equals(child)) 
			{
				w.switchTo().window(child);
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
			}
		}
	}
}
