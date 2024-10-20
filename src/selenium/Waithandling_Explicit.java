package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waithandling_Explicit {

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Explicitly Wait handling
		
		WebDriverWait wdw = new WebDriverWait(w, Duration.ofSeconds(10));
		WebDriverWait wdw1 = new WebDriverWait(w, Duration.ofSeconds(15));
		
		WebElement username = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		w.findElement(By.name("password")).sendKeys("admin123");
		w.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		wdw1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Time")));
		w.findElement(By.linkText("Time")).click(); 

	}

}
