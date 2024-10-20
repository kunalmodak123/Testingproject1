package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedLocator_XPath {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		w.manage().window().maximize();
		
		//True XPath/Absolute Xpath
		w.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("true_xpath");
		
		//Relavtive XPath
		w.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123");
		
//		w.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("true xpath");
		}
}

// Two Types of XPath--> 1).Absolute Xpath
//2). Relative XPath

//Syntax for create manually Relative XPath--> //*[@Attribute=Value of Attribute]
//("//*[@id=\"password\"]")



