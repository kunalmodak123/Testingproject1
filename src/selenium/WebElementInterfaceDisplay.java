package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterfaceDisplay {

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.findElement(By.id("hide-textbox")).click();
		
		boolean display = w.findElement(By.id("displayed-text")).isDisplayed();
		
		if (display) 
		{
			System.out.println("Webelement is display on the web[age");	
		}
		else
		{
			System.out.println("Webelement is not display on the web[age");
		}
	}
}
