package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling_Task {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.amazon.in/");
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		w.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
		Thread.sleep(2000);
		w.findElement(By.partialLinkText("Apple iPhone 15 (128 GB) - Black")).click();
		
		String parentwindow = w.getWindowHandle();
		System.out.println("parent window "+parentwindow);
		Set<String> childwindow = w.getWindowHandles();
		System.out.println("child window "+childwindow);
		
		for (String child : childwindow) 
		{
			if (!parentwindow.equals(child)) 
			{
				w.switchTo().window(child);
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();	
				w.findElement(By.id("buy-now-button")).click();
//				WebDriverWait wdw = new WebDriverWait(w, Duration.ofSeconds(10));
//				WebElement click = wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/span/span/input"))).click();
				//w.findElement(By.xpath("/html/body/div[10]/div[3]/div/div/div[1]/div[3]/div[1]/div[2]/div[3]/span/span/input")).click();
			}
			
		}
		

	}

}
