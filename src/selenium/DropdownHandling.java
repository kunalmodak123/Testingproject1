package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/signup");
		w.manage().window().maximize();
		WebElement bday = w.findElement(By.id("day"));
		Select bd = new Select(bday);
		Thread.sleep(2000);
		bd.selectByIndex(10);
		Thread.sleep(2000);
//		bd.selectByValue("19");
//		Thread.sleep(2000);
//		bd.selectByVisibleText("23");
//		Thread.sleep(2000);
		
		WebElement month = w.findElement(By.id("month"));
		Select mt = new Select(month);
		Thread.sleep(2000);
		mt.selectByValue("10");
		Thread.sleep(2000);
		
		WebElement year = w.findElement(By.id("year"));
		Select yr = new Select(year);
		Thread.sleep(2000);
		yr.selectByVisibleText("1992");
		
		Thread.sleep(2000);

	}

}
