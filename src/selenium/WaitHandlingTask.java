package selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandlingTask {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://github.com/signup");
		w.manage().window().maximize();
		
		WebDriverWait wdw = new WebDriverWait(w, Duration.ofSeconds(10));
		
		
		WebElement username = wdw.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		username.sendKeys("kuna123@gmail.com");
		
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\KUNAL\\Pictures/img001.png"));
		
		WebElement click = wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div[4]/main/div[1]/text-suggester/div[1]/form/div[1]/div[2]/button")));
		click.click();
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\KUNAL\\Pictures/img002.png"));

	}

}
