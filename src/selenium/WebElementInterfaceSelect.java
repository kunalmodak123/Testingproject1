package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterfaceSelect {

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.findElement(By.id("checkBoxOption1")).click();
		boolean select = w.findElement(By.id("checkBoxOption1")).isSelected();
		if (select) 
		{
			System.out.println("Webelement is selected");			
		} 
		else 
		{
			System.out.println("Webelement is not selected");
		}
	}
}
