package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling_Task {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		w.manage().window().maximize();
		WebElement country = w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));
		Select ctry = new Select(country);
		Thread.sleep(2000);
		ctry.selectByVisibleText("India");
		Thread.sleep(2000);

	}

}
