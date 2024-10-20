package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalLocator2_26May {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		w.manage().window().maximize();
		w.findElement(By.linkText("Downloads")).click(); // linkText --> Need 100% same content
		Thread.sleep(2000);
		
		w.findElement(By.partialLinkText("Doc")).click();// partialLink --> Similar content
		Thread.sleep(2000);

	}

}
